package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.test.entity.OrderEntity;
import java.util.Date;



public class OrderEntity extends BaseEntity
{
	private Integer orderId;
	private Integer requirId;

	public String getOrderName() {
		return orderName;
	}

	public OrderEntity setOrderName(String orderName) {
		this.orderName = orderName;
		return this;
	}

	private String orderName;
	private Integer userIdA;
	private String aUsername;
	private Integer userIdB;
	private String bUsername;
	private Integer marginMoney;
	private Integer settleMoney;
	private String orderStatus;
	private Integer createBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date aCreateTime;//甲方创建时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date bGetTime;//乙方接单时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date bFinishTime;//乙方完工时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date aConfirmTime;//甲方确认乙方完工时间
	private String remark;
	private String invoiceTag;
	private String invoiceBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date invoiceTime;
	private String invoiceInfo;
	//平台向乙方支付状态
	private  Integer  pay;


	//平台向乙方结算时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private  Date  payTime;
	//保证金状态
	private Integer marginStatus;
	//甲方评论乙方星级
	private Integer aEvaluateStar;
	//乙方评论甲方星级
	private Integer bEvaluateStar;
	//甲方评价
	private Integer aEvaluate;
	//乙方评价
	private Integer bEvaluate;
    //灵活支付金额
	private Integer flexibleMoney;

	public Date getPayTime() {
		return payTime;
	}

	public OrderEntity setPayTime(Date payTime) {
		this.payTime = payTime;
		return this;
	}

	public String getaUsername() {
		return aUsername;
	}

	public OrderEntity setaUsername(String aUsername) {
		this.aUsername = aUsername;
		return this;
	}

	public String getbUsername() {
		return bUsername;
	}

	public OrderEntity setbUsername(String bUsername) {
		this.bUsername = bUsername;
		return this;
	}


	public Integer getOrderId() {
		return orderId;
	}

	public OrderEntity setOrderId(Integer orderId) {
		this.orderId = orderId;
		return this;
	}

	public Integer getRequirId() {
		return requirId;
	}

	public OrderEntity setRequirId(Integer requirId) {
		this.requirId = requirId;
		return this;
	}

	public Integer getUserIdA() {
		return userIdA;
	}

	public OrderEntity setUserIdA(Integer userIdA) {
		this.userIdA = userIdA;
		return this;
	}

	public Integer getUserIdB() {
		return userIdB;
	}

	public OrderEntity setUserIdB(Integer userIdB) {
		this.userIdB = userIdB;
		return this;
	}

	public Integer getMarginMoney() {
		return marginMoney;
	}

	public OrderEntity setMarginMoney(Integer marginMoney) {
		this.marginMoney = marginMoney;
		return this;
	}

	public Integer getSettleMoney() {
		return settleMoney;
	}

	public OrderEntity setSettleMoney(Integer settleMoney) {
		this.settleMoney = settleMoney;
		return this;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public OrderEntity setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
		return this;
	}

	public Integer getCreateBy() {
		return createBy;
	}

	public OrderEntity setCreateBy(Integer createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getaCreateTime() {
		return aCreateTime;
	}

	public OrderEntity setaCreateTime(Date aCreateTime) {
		this.aCreateTime = aCreateTime;
		return this;
	}

	public Date getbGetTime() {
		return bGetTime;
	}

	public OrderEntity setbGetTime(Date bGetTime) {
		this.bGetTime = bGetTime;
		return this;
	}

	public Date getbFinishTime() {
		return bFinishTime;
	}

	public OrderEntity setbFinishTime(Date bFinishTime) {
		this.bFinishTime = bFinishTime;
		return this;
	}

	public Date getaConfirmTime() {
		return aConfirmTime;
	}

	public OrderEntity setaConfirmTime(Date aConfirmTime) {
		this.aConfirmTime = aConfirmTime;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public OrderEntity setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	public String getInvoiceTag() {
		return invoiceTag;
	}

	public OrderEntity setInvoiceTag(String invoiceTag) {
		this.invoiceTag = invoiceTag;
		return this;
	}

	public String getInvoiceBy() {
		return invoiceBy;
	}

	public OrderEntity setInvoiceBy(String invoiceBy) {
		this.invoiceBy = invoiceBy;
		return this;
	}

	public Date getInvoiceTime() {
		return invoiceTime;
	}

	public OrderEntity setInvoiceTime(Date invoiceTime) {
		this.invoiceTime = invoiceTime;
		return this;
	}

	public String getInvoiceInfo() {
		return invoiceInfo;
	}

	public OrderEntity setInvoiceInfo(String invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
		return this;
	}

	public Integer getPay() {
		return pay;
	}

	public OrderEntity setPay(Integer pay) {
		this.pay = pay;
		return this;
	}

	public Integer getMarginStatus() {
		return marginStatus;
	}

	public OrderEntity setMarginStatus(Integer marginStatus) {
		this.marginStatus = marginStatus;
		return this;
	}

	public Integer getaEvaluateStar() {
		return aEvaluateStar;
	}

	public OrderEntity setaEvaluateStar(Integer aEvaluateStar) {
		this.aEvaluateStar = aEvaluateStar;
		return this;
	}

	public Integer getbEvaluateStar() {
		return bEvaluateStar;
	}

	public OrderEntity setbEvaluateStar(Integer bEvaluateStar) {
		this.bEvaluateStar = bEvaluateStar;
		return this;
	}

	public Integer getaEvaluate() {
		return aEvaluate;
	}

	public OrderEntity setaEvaluate(Integer aEvaluate) {
		this.aEvaluate = aEvaluate;
		return this;
	}

	public Integer getbEvaluate() {
		return bEvaluate;
	}

	public OrderEntity setbEvaluate(Integer bEvaluate) {
		this.bEvaluate = bEvaluate;
		return this;
	}

	public Integer getFlexibleMoney() {
		return flexibleMoney;
	}

	public OrderEntity setFlexibleMoney(Integer flexibleMoney) {
		this.flexibleMoney = flexibleMoney;
		return this;
	}


	@Override
	public String toString() {
		return "OrderEntity{" +
				"orderId=" + orderId +
				", requirId=" + requirId +
				", orderName='" + orderName + '\'' +
				", userIdA=" + userIdA +
				", aUsername='" + aUsername + '\'' +
				", userIdB=" + userIdB +
				", bUsername='" + bUsername + '\'' +
				", marginMoney=" + marginMoney +
				", settleMoney=" + settleMoney +
				", orderStatus='" + orderStatus + '\'' +
				", createBy='" + createBy + '\'' +
				", aCreateTime=" + aCreateTime +
				", bGetTime=" + bGetTime +
				", bFinishTime=" + bFinishTime +
				", aConfirmTime=" + aConfirmTime +
				", remark='" + remark + '\'' +
				", invoiceTag='" + invoiceTag + '\'' +
				", invoiceBy='" + invoiceBy + '\'' +
				", invoiceTime=" + invoiceTime +
				", invoiceInfo='" + invoiceInfo + '\'' +
				", pay=" + pay +
				", payTime=" + payTime +
				", marginStatus=" + marginStatus +
				", aEvaluateStar=" + aEvaluateStar +
				", bEvaluateStar=" + bEvaluateStar +
				", aEvaluate=" + aEvaluate +
				", bEvaluate=" + bEvaluate +
				", flexibleMoney=" + flexibleMoney +
				'}';
	}
}
