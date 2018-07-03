package com.wwj.finance.job;

import com.wwj.finance.service.NewsService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by txkj on 2018/7/3.
 */
public class InsertNewsJob implements Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("开始插入新闻:"+sdf.format(new Date()));

        ApplicationContext applicationContext = (ApplicationContext) context.getJobDetail().getJobDataMap()
                .get("applicationContext");
        NewsService newsService = (NewsService) applicationContext.getBean("newsServiceImpl");

        int num = newsService.insertNews();

        System.out.println("结束插入新闻,共插入 " + num +" 条");
    }
}
