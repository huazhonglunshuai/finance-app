package com.wwj.finance.tools;

import com.wwj.finance.entry.CodeEnum;
import com.wwj.finance.entry.Result;

import java.util.List;

/**
 * Created by txkj on 2018/7/2.
 */
public class ReturnUitls {

    public static Result returnListResult(List list){
        Result result = new Result();

        if(null != list && list.size() > 0){
            result.setCode(CodeEnum.SUCCESS.getValue());
            result.setData(list);
        }else {
            result.setCode(CodeEnum.NULL_DATA.getValue());
        }

        return result;
    }

    public static<T> Result returnPojoResult(T t){
        Result result = new Result();

        if(null != t){
            result.setCode(CodeEnum.SUCCESS.getValue());
            result.setData(t);
        }else {
            result.setCode(CodeEnum.NULL_DATA.getValue());
        }

        return result;
    }

    public static<T> Result updateResult(int count, T t){
        Result result = new Result();

        if(count > 0){
            result.setCode(CodeEnum.SUCCESS.getValue());
            result.setData(t);
        }else {
            result.setCode(CodeEnum.ADD_FAIL.getValue());
        }

        return result;
    }
}
