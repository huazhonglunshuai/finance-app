package com.wwj.finance.controller;

import com.google.gson.Gson;
import com.wwj.finance.entry.PageReq;
import com.wwj.finance.entry.Result;
import com.wwj.finance.service.FinanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by txkj on 2018/7/2.
 */
@Controller
@RequestMapping(value= "/finance",produces = "json/plain;charset=UTF-8")
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    private Logger logger = LoggerFactory.getLogger(FinanceController.class);

    @RequestMapping(value="/getFinanceData",method= RequestMethod.POST)
    @ResponseBody
    public String getFinanceData(@RequestBody PageReq page) {
        logger.info("----------:{} ",new Gson().toJson(page));
        Result result = financeService.getFinanceData(page);
        return new Gson().toJson(result);
    }
}
