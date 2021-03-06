package com.sunaniya.hardaani.bean;

public class Response {

	private int responseCode;
	private String responseMessage;
//	private String responseToken;
	private ResponseMarker responseData;

	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public ResponseMarker getResponseData() {
		return responseData;
	}
	public void setResponseData(ResponseMarker responseData) {
		this.responseData = responseData;
	}
	
	
	@Override
	public String toString() {
		return "{ responseCode=" + responseCode + ", responseMessage=" + responseMessage
				+ ", responseData=" + responseData + "}";
	}
	
	
	

	
	
}
