package com.wwj.finance.service;

import com.wwj.finance.entry.Result;
import com.wwj.finance.vo.NewsConfigVO;

/**
 * Created by txkj on 2018/7/2.
 */
public interface NewsConfigService {
    Result getConfigList();

    Result add(NewsConfigVO newsConfigVO);

    Result getConfigById(NewsConfigVO newsConfigVO);

    Result getConfigByName(NewsConfigVO newsConfigVO);

    Result getConfigByAllow(NewsConfigVO newsConfigVO);

    Result updateAllow(NewsConfigVO newsConfigVO);
}
