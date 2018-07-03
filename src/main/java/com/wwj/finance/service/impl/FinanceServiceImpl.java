package com.wwj.finance.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.wwj.finance.entry.Result;
import com.wwj.finance.mapper.NewsFinanceDateMapper;
import com.wwj.finance.pojo.NewsFinanceDate;
import com.wwj.finance.pojo.NewsFinanceDateExample;
import com.wwj.finance.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by txkj on 2018/7/2.
 */
@Service
public class FinanceServiceImpl implements FinanceService {

    @Autowired
    private NewsFinanceDateMapper newsFinanceDateMapper;

    @Override
    public Result getFinanceData(Integer page, Integer rows) {

        if(null == page){
            page = 1;
        }
        if(null == rows){
            rows = 5;
        }

        Result result = new Result();

        //分页查询
        PageHelper.startPage(page, rows);
        NewsFinanceDateExample example = new NewsFinanceDateExample();
        NewsFinanceDateExample.Criteria criteria = example.createCriteria();
        criteria.andUniquekeyIsNotNull();
        List<NewsFinanceDate> list = newsFinanceDateMapper.selectByExample(example);

        PageInfo<NewsFinanceDate> pageInfo = new PageInfo<NewsFinanceDate>(list);
        result.setTotal(pageInfo.getTotal());
        result.setData(pageInfo.getList());
        return result;
    }
}
