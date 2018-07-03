package com.wwj.finance.pojo;

import java.io.Serializable;

public class NewsFinanceDTO implements Serializable{
	
	private String reason;
	private NewsFinanceResultDTO result;
	private String error_code;
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public NewsFinanceResultDTO getResult() {
		return result;
	}
	public void setResult(NewsFinanceResultDTO result) {
		this.result = result;
	}
	public String getError_code() {
		return error_code;
	}
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}
	@Override
	public String toString() {
		return "NewsFinanceDTO [reason=" + reason + ", result=" + result + ", error_code=" + error_code + "]";
	}
}
