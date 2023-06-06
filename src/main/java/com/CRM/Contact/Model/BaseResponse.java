package com.CRM.Contact.Model;

import java.io.Serializable;
import java.util.List;

public class BaseResponse<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private String status;
	private String reasonCode;
	private String reasonText;
	private T responseObject;
	private Integer totalRecords;
	private List<T> responseListObject;

	public BaseResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonText() {
		return reasonText;
	}

	public void setReasonText(String reasonText) {
		this.reasonText = reasonText;
	}

	public T getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(T responseObject) {
		this.responseObject = responseObject;
	}

	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public List<T> getResponseListObject() {
		return responseListObject;
	}

	public void setResponseListObject(List<T> responseListObject) {
		this.responseListObject = responseListObject;
	}

	@Override
	public String toString() {
		return "BaseResponse [status=" + status + ", reasonCode=" + reasonCode + ", reasonText=" + reasonText
				+ ", responseObject=" + responseObject + ", totalRecords=" + totalRecords + ", responseListObject="
				+ responseListObject + "]";
	}

}
