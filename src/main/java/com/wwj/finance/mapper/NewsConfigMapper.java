package com.wwj.finance.mapper;

import com.wwj.finance.pojo.NewsConfig;
import com.wwj.finance.pojo.NewsConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsConfigMapper {
    int countByExample(NewsConfigExample example);

    int deleteByExample(NewsConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NewsConfig record);

    int insertSelective(NewsConfig record);

    List<NewsConfig> selectByExample(NewsConfigExample example);

    NewsConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NewsConfig record, @Param("example") NewsConfigExample example);

    int updateByExample(@Param("record") NewsConfig record, @Param("example") NewsConfigExample example);

    int updateByPrimaryKeySelective(NewsConfig record);

    int updateByPrimaryKey(NewsConfig record);
}