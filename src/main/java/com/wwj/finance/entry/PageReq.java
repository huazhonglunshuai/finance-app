package com.wwj.finance.entry;

/**
 * Created by txkj on 2018/7/3.
 */
public class PageReq {

    private Long id;

    private Integer page;

    private Integer rows;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
