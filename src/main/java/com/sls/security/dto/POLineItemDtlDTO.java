package com.sls.security.dto;

public class POLineItemDtlDTO {
	
	private long hdrIdDtl;
	private String itemCode;
	private String itemDesc;
	private long reqQuantity;
	private String dept;
	private String uom;
	
	public long getHdrIdDtl() {
		return hdrIdDtl;
	}
	public void setHdrIdDtl(long hdrIdDtl) {
		this.hdrIdDtl = hdrIdDtl;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public long getReqQuantity() {
		return reqQuantity;
	}
	public void setReqQuantity(long reqQuantity) {
		this.reqQuantity = reqQuantity;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	
	

}
