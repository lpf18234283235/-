package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.test.entity.OrderEntity;
import java.util.Date;














public class OrderEntity
{
	private Integer orderId;
	private Integer requirId;
	private Integer userIdA;
	private Integer userIdB;
	private Integer marginMoney;
	private Integer settleMoney;
	private String orderStatus;
	private String createBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	private String remark;
	private String invoiceTag;
	private String invoiceBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date invoiceTime;
	private String invoiceInfo;

	public Integer getOrderId() { return this.orderId; }


	public void setOrderId(Integer orderId) { this.orderId = orderId; }


	public Integer getRequirId() { return this.requirId; }


	public void setRequirId(Integer requirId) { this.requirId = requirId; }


	public Integer getUserIdA() { return this.userIdA; }


	public void setUserIdA(Integer userIdA) { this.userIdA = userIdA; }


	public Integer getUserIdB() { return this.userIdB; }


	public void setUserIdB(Integer userIdB) { this.userIdB = userIdB; }


	public Integer getMarginMoney() { return this.marginMoney; }


	public void setMarginMoney(Integer marginMoney) { this.marginMoney = marginMoney; }


	public Integer getSettleMoney() { return this.settleMoney; }


	public void setSettleMoney(Integer settleMoney) { this.settleMoney = settleMoney; }


	public String getOrderStatus() { return this.orderStatus; }


	public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }


	public String getCreateBy() { return this.createBy; }


	public void setCreateBy(String createBy) { this.createBy = createBy; }


	public Date getCreateTime() { return this.createTime; }


	public void setCreateTime(Date createTime) { this.createTime = createTime; }


	public String getRemark() { return this.remark; }


	public void setRemark(String remark) { this.remark = remark; }


	public String getInvoiceTag() { return this.invoiceTag; }


	public void setInvoiceTag(String invoiceTag) { this.invoiceTag = invoiceTag; }


	public String getInvoiceBy() { return this.invoiceBy; }


	public void setInvoiceBy(String invoiceBy) { this.invoiceBy = invoiceBy; }


	public Date getInvoiceTime() { return this.invoiceTime; }


	public void setInvoiceTime(Date invoiceTime) { this.invoiceTime = invoiceTime; }


	public String getInvoiceInfo() { return this.invoiceInfo; }


	public void setInvoiceInfo(String invoiceInfo) { this.invoiceInfo = invoiceInfo; }



	public String toString() { return "OrderEntity [orderId=" + this.orderId + ", requirId=" + this.requirId + ", userIdA=" + this.userIdA + ", userIdB=" + this.userIdB + ", marginMoney=" + this.marginMoney + ", settleMoney=" + this.settleMoney + ", orderStatus=" + this.orderStatus + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", remark=" + this.remark + ", invoiceTag=" + this.invoiceTag + ", invoiceBy=" + this.invoiceBy + ", invoiceTime=" + this.invoiceTime + ", invoiceInfo=" + this.invoiceInfo + "]"; }
}
