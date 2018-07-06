package com.wwj.finance.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.wwj.finance.entry.PageReq;
import com.wwj.finance.entry.Result;
import com.wwj.finance.filter.BodyReaderHttpServletRequestWrapper;
import com.wwj.finance.mapper.NewsConfigMapper;
import com.wwj.finance.pojo.NewsConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by txkj on 2018/7/4.
 */
public class ConfigInterceptor implements HandlerInterceptor {

    @Autowired
    private NewsConfigMapper newsConfigMapper;

    private Logger logger = LoggerFactory.getLogger(ConfigInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        try{
            response.setHeader("Content-type", "application/json;charset=UTF-8");

            String requestMethord = request.getRequestURI();//请求方法
            if(requestMethord==null){
                return false;
            }
            //获取请求参数
            JSONObject parameterMap = JSON.parseObject(new BodyReaderHttpServletRequestWrapper(request).getBodyString(request));
            String id = String.valueOf(parameterMap.get("id"));
            if(null != id){
            NewsConfig newsConfig = newsConfigMapper.selectByPrimaryKey(Long.parseLong(id));
            if(null != newsConfig && newsConfig.getAllow() == 0){
                return true;
            }
        }

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
