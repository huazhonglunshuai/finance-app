package com.wwj.finance.pojo;

import java.io.Serializable;
import java.util.List;

public class NewsFinanceResultDTO implements Serializable {
	private String stat;
	private List<NewsFinanceDateDTO> data;
	
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public List<NewsFinanceDateDTO> getData() {
		return data;
	}
	public void setData(List<NewsFinanceDateDTO> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "NewsFinanceResultDTO [stat=" + stat + ", data=" + data + "]";
	}
	
}
