package com.wwj.finance.pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-07-02
 */
public class NewsConfig {
    /**
     * id
     */
    private Long id;

    /**
     * 是否允许展示资讯 0.展示 1.不展示
     */
    private Integer allow;

    /**
     * 单位名称
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAllow() {
        return allow;
    }

    public void setAllow(Integer allow) {
        this.allow = allow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}