package com.wwj.finance.service.impl;

import com.google.gson.Gson;
import com.wwj.finance.mapper.NewsFinanceDateMapper;
import com.wwj.finance.pojo.*;
import com.wwj.finance.service.NewsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsFinanceDateMapper newsFinanceDateMapper;

	// 插入到数据库
	@Override
	public int insertNews() {

		String jsonData = getNews("caijing");
		NewsFinanceDTO NewsFinanceDTO = new Gson().fromJson(jsonData, NewsFinanceDTO.class);
		NewsFinanceResultDTO result = NewsFinanceDTO.getResult();
		List<NewsFinanceDateDTO> data = result.getData();

		int count = 0;
		if (data.size() > 0) {
			for (NewsFinanceDateDTO newsFinanceDateDTO : data) {
				NewsFinanceDate newsFinanceDate = new NewsFinanceDate();

				// 获取html字符串
				String html = httpRequest(newsFinanceDateDTO.getUrl());
				newsFinanceDateDTO.setContext(htmlFiter(html));
				BeanUtils.copyProperties(newsFinanceDateDTO, newsFinanceDate);
				count += newsFinanceDateMapper.insert(newsFinanceDate);
			}
		}

		return count;
	}

	@Override
	public int deleteNews() {
		int count = newsFinanceDateMapper.deleteByBeforeDate(3);
		return count;
	}

	// 得到财经头条
	public String getNews(String type) {
		String strUrl = "http://v.juhe.cn/toutiao/index?type="+type+"&key=3de4ba2480242d3b7cd7d28d75646451";
		URL url;
		String reder = "";

		try {
			url = new URL(strUrl);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			reder = br.readLine();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return reder;
	}

	// 根据来源过滤
	public NewsFinanceDTO authorNameFilter(NewsFinanceDTO NewsFinanceDTO) {
		// 设置保留的来源
		ArrayList<String> authorNameList = new ArrayList<String>();
		authorNameList.add("新浪财经");
		authorNameList.add("新华社");
		authorNameList.add("中国网");
		authorNameList.add("海外网");
		authorNameList.add("中国新闻网");
		authorNameList.add("人民网");
		authorNameList.add("中国证券报·中证网");

		// 进行过滤
		int size = NewsFinanceDTO.getResult().getData().size();
		for (int i = 0; i < size; i++) {
			// 判断是否是所需要的来源
			boolean contains = authorNameList.contains(NewsFinanceDTO.getResult().getData().get(i).getAuthor_name());

			if (!contains) {
				// 若不是，则移除
				NewsFinanceDTO.getResult().getData().remove(i);
				size--;
				i--;
			}
		}

		return NewsFinanceDTO;
	}

	// 设置title过滤
	public NewsFinanceDTO titleFilter(NewsFinanceDTO NewsFinanceDTO) {
		// 设置保留的title
		ArrayList<String> titleWorldList = new ArrayList<>();
		titleWorldList.add("证券");
		titleWorldList.add("股");
		titleWorldList.add("牛市");

		// 进行过滤
		int size = NewsFinanceDTO.getResult().getData().size();
		for (int i = 0; i < size; i++) {

			// 判断是否移除，初始为移除
			boolean isRemove = true;

			for (String string : titleWorldList) {
				// 判断title是否包含所需字符串，若有，则不移除
				boolean contains2 = NewsFinanceDTO.getResult().getData().get(i).getTitle().contains(string);
				if (contains2) {
					isRemove = false;
					break;
				}
			}

			// 移除
			if (isRemove) {
				NewsFinanceDTO.getResult().getData().remove(i);
				size--;
				i--;
			}
		}

		return NewsFinanceDTO;
	}

	// 过滤数据
	public NewsFinanceDTO myFilter(NewsFinanceDTO NewsFinanceDTO) {

		// 设置保留的title
		ArrayList<String> titleWorldList = new ArrayList<>();
		titleWorldList.add("证券");
		titleWorldList.add("股");
		titleWorldList.add("牛市");

		// 进行过滤
		int size = NewsFinanceDTO.getResult().getData().size();
		for (int i = 0; i < size; i++) {

			// 判断是否移除，初始为移除
			boolean isRemove = true;

			for (String string : titleWorldList) {
				// 判断title是否包含所需字符串，若有，则不移除
				boolean contains2 = NewsFinanceDTO.getResult().getData().get(i).getTitle().contains(string);
				if (contains2) {
					isRemove = false;
					break;
				}
			}

			// 移除
			if (isRemove) {
				NewsFinanceDTO.getResult().getData().remove(i);
				size--;
				i--;
			}
		}

		return NewsFinanceDTO;
	}

	/**
	 * 发起http get请求获取网页源代码
	 * 
	 * @param requestUrl
	 *            String 请求地址
	 * @return String 该地址返回的html字符串
	 */
	private static String httpRequest(String requestUrl) {

		StringBuffer buffer = null;
		BufferedReader bufferedReader = null;
		InputStreamReader inputStreamReader = null;
		InputStream inputStream = null;
		HttpURLConnection httpUrlConn = null;

		try {
			// 建立get请求
			URL url = new URL(requestUrl);
			httpUrlConn = (HttpURLConnection) url.openConnection();
			httpUrlConn.setDoInput(true);
			httpUrlConn.setRequestMethod("GET");

			// 获取输入流
			inputStream = httpUrlConn.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			bufferedReader = new BufferedReader(inputStreamReader);

			// 从输入流读取结果
			buffer = new StringBuffer();
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (inputStreamReader != null) {
				try {
					inputStreamReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (httpUrlConn != null) {
				httpUrlConn.disconnect();
			}
		}
		return buffer.toString();
	}

	/**
	 * 过滤掉html字符串中无用的信息
	 * 
	 * @param html
	 *            String html字符串
	 * @return String 有用的数据
	 */
	private static String htmlFiter(String html) {

		StringBuffer buffer = new StringBuffer();
		String str1 = "";
		String str2 = "";

		// 取出有用的范围
		Pattern p = Pattern.compile("(.*)(<article)(.*?)(</article>)(.*)");
		Matcher m = p.matcher(html);
		if (m.matches()) {
			str1 = m.group(3);
			// 匹配日期，注：日期被包含在<h2> 和 </h2>中
			p = Pattern
					.compile("(.*)(<div id=\"content\" class=\"J-article-content article-content\">)(.*?)(</div>)(.*)");
			m = p.matcher(str1);
			if (m.matches()) {
				str2 = m.group(3);
				buffer.append(str2);
				buffer.append("\n");
			}
		}

		return buffer.toString();
	}
}
