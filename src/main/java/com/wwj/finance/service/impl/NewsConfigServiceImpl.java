package com.wwj.finance.service.impl;

import com.wwj.finance.entry.Result;
import com.wwj.finance.mapper.NewsConfigMapper;
import com.wwj.finance.pojo.NewsConfig;
import com.wwj.finance.pojo.NewsConfigExample;
import com.wwj.finance.service.NewsConfigService;
import com.wwj.finance.tools.IdUtils;
import com.wwj.finance.tools.ReturnUitls;
import com.wwj.finance.vo.NewsConfigVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by txkj on 2018/7/2.
 */
@Service
public class NewsConfigServiceImpl implements NewsConfigService{

    @Autowired
    private NewsConfigMapper newsConfigMapper;

    @Override
    public Result getConfigList() {
        NewsConfigExample example = new NewsConfigExample();
        NewsConfigExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<NewsConfig> list = newsConfigMapper.selectByExample(example);
        return ReturnUitls.returnListResult(list);
    }

    @Override
    public Result add(NewsConfigVO newsConfigVO) {
        NewsConfig newsConfig = new NewsConfig();
        BeanUtils.copyProperties(newsConfigVO, newsConfig);
        newsConfig.setId(IdUtils.createId());
        int count = newsConfigMapper.insertSelective(newsConfig);
        return ReturnUitls.updateResult(count, newsConfig);
    }

    @Override
    public Result getConfigById(NewsConfigVO newsConfigVO) {
        NewsConfig newsConfig = newsConfigMapper.selectByPrimaryKey(newsConfigVO.getId());
        return ReturnUitls.returnPojoResult(newsConfig);
    }

    @Override
    public Result getConfigByName(NewsConfigVO newsConfigVO) {
        NewsConfigExample example = new NewsConfigExample();
        NewsConfigExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(newsConfigVO.getName());
        List<NewsConfig> list = newsConfigMapper.selectByExample(example);
        return ReturnUitls.returnListResult(list);
    }

    @Override
    public Result getConfigByAllow(NewsConfigVO newsConfigVO) {
        NewsConfigExample example = new NewsConfigExample();
        NewsConfigExample.Criteria criteria = example.createCriteria();
        criteria.andAllowEqualTo(newsConfigVO.getAllow());
        List<NewsConfig> list = newsConfigMapper.selectByExample(example);
        return ReturnUitls.returnListResult(list);
    }

    @Override
    public Result updateAllow(NewsConfigVO newsConfigVO) {
        NewsConfig newsConfig = new NewsConfig();
        BeanUtils.copyProperties(newsConfigVO, newsConfig);
        int count = 0;
        NewsConfig newsConfigResutl = null;

        if(null != newsConfig.getId()){
            count = newsConfigMapper.updateByPrimaryKeySelective(newsConfig);
            newsConfigResutl = newsConfigMapper.selectByPrimaryKey(newsConfig.getId());
        }else if(null != newsConfig.getName()){
            NewsConfigExample example = new NewsConfigExample();
            NewsConfigExample.Criteria criteria = example.createCriteria();
            criteria.andNameEqualTo(newsConfigVO.getName());
            count = newsConfigMapper.updateByExampleSelective(newsConfig, example);
            List<NewsConfig> list = newsConfigMapper.selectByExample(example);
            if(null != list && list.size() > 0){
                newsConfigResutl = list.get(0);
            }
        }

        return ReturnUitls.updateResult(count, newsConfigResutl);
    }
}
