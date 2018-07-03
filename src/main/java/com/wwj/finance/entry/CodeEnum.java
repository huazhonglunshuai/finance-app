package com.wwj.finance.entry;

/**
 * Created by txkj on 2018/7/2.
 */
public enum CodeEnum {

    SUCCESS(0, "成功"),
    NULL_DATA(1001, "空数据"),
    ADD_FAIL(1002, "添加失败");

    private int value;
    private String label;
    private CodeEnum(int value,String label) {
        this.value = value;
        this.label = label;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public String getLabel() {
        return label;
    }

}
