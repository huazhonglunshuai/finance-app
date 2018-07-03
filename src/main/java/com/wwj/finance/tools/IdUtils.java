package com.wwj.finance.tools;

/**
 * Created by txkj on 2018/7/2.
 */
public class IdUtils {

    public static Long createId(){
        return System.currentTimeMillis()+(int)(Math.random() * 10000);
    }
}
