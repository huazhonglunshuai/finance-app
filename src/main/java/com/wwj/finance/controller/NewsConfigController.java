package com.wwj.finance.controller;

import com.google.gson.Gson;
import com.wwj.finance.entry.Result;
import com.wwj.finance.pojo.NewsConfig;
import com.wwj.finance.service.NewsConfigService;
import com.wwj.finance.vo.NewsConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by txkj on 2018/7/2.
 */
@Controller
@RequestMapping(value= "/news/config",produces = "json/plain;charset=UTF-8")
public class NewsConfigController {

    @Autowired
    private NewsConfigService newsConfigService;

    /**
     * 得到全部配置
     * @return
     */
    @RequestMapping(value="/getConfigList",method= RequestMethod.POST)
    @ResponseBody
    public String getConfigList() {
        Result result = newsConfigService.getConfigList();
        return new Gson().toJson(result);
    }

    /**
     * 添加一个单位
     * @return
     */
    @RequestMapping(value="/add",method= RequestMethod.POST)
    @ResponseBody
    public String add(NewsConfigVO newsConfigVO) {
        Result result = newsConfigService.add(newsConfigVO);
        return new Gson().toJson(result);
    }

    /**
     * 通过ID得到配置
     * @return
     */
    @RequestMapping(value="/getConfigById",method= RequestMethod.POST)
    @ResponseBody
    public String getConfigById(NewsConfigVO newsConfigVO) {
        Result result = newsConfigService.getConfigById(newsConfigVO);
        return new Gson().toJson(result);
    }

    /**
     * 通过name得到配置
     * @return
     */
    @RequestMapping(value="/getConfigByName",method= RequestMethod.POST)
    @ResponseBody
    public String getConfigByName(NewsConfigVO newsConfigVO) {
        Result result = newsConfigService.getConfigByName(newsConfigVO);
        return new Gson().toJson(result);
    }

    /**
     * 通过权限得到配置
     * @return
     */
    @RequestMapping(value="/getConfigByAllow",method= RequestMethod.POST)
    @ResponseBody
    public String getConfigByAllow(NewsConfigVO newsConfigVO) {
        Result result = newsConfigService.getConfigByAllow(newsConfigVO);
        return new Gson().toJson(result);
    }

    /**
     * 更改权限,id或name均可
     * @return
     */
    @RequestMapping(value="/updateAllow",method= RequestMethod.POST)
    @ResponseBody
    public String updateAllow(NewsConfigVO newsConfigVO) {
        Result result = newsConfigService.updateAllow(newsConfigVO);
        return new Gson().toJson(result);
    }

}
