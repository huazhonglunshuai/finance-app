package com.wwj.finance.mapper;

import com.wwj.finance.pojo.NewsFinanceDate;
import com.wwj.finance.pojo.NewsFinanceDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsFinanceDateMapper {
    int countByExample(NewsFinanceDateExample example);

    int deleteByExample(NewsFinanceDateExample example);

    int deleteByPrimaryKey(String uniquekey);

    int insert(NewsFinanceDate record);

    int insertSelective(NewsFinanceDate record);

    List<NewsFinanceDate> selectByExample(NewsFinanceDateExample example);

    NewsFinanceDate selectByPrimaryKey(String uniquekey);

    int updateByExampleSelective(@Param("record") NewsFinanceDate record, @Param("example") NewsFinanceDateExample example);

    int updateByExample(@Param("record") NewsFinanceDate record, @Param("example") NewsFinanceDateExample example);

    int updateByPrimaryKeySelective(NewsFinanceDate record);

    int updateByPrimaryKey(NewsFinanceDate record);
}