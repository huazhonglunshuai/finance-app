package com.wwj.finance.service;

import com.wwj.finance.entry.Result;

/**
 * Created by txkj on 2018/7/2.
 */
public interface FinanceService {
    Result getFinanceData(Integer page, Integer rows);
}
