/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.pojos;

import java.util.List;
import java.util.Map;

/**
 * This class is generated by jOOQ.
 *
 * 订单表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Order implements java.io.Serializable {

	private static final long serialVersionUID = -151179973;

	private java.lang.String       orderId;
	private java.lang.String       customerId;
	private java.lang.String       orderNo;
	private java.lang.String       orderType;
	private java.lang.String       status;
	private java.lang.String       consigneeName;
	private java.lang.String       consigneeAddress;
	private java.lang.String       consigneeMobile;
	private java.math.BigDecimal   orderPrice;
	private java.lang.Integer      exccreaditCount;
	private java.lang.String       usedCoupons;
	private java.lang.String       comments;
	private org.joda.time.DateTime    preSendDate;
	private String preSendTime;
	private org.joda.time.DateTime createTime;
	private java.lang.String       createBy;
	private org.joda.time.DateTime lastModifyTime;
	private java.lang.String       lastModifyBy;
	private java.lang.Integer      optTime;

	private List<OrderDetail> orderDetails;
	private Map<String, Object> extMap;
	private String couponPrice;
	private String preSendDateStr;
	public Order() {}

	public Order(
		java.lang.String       orderId,
		java.lang.String       customerId,
		java.lang.String       orderNo,
		java.lang.String       orderType,
		java.lang.String       status,
		java.lang.String       consigneeName,
		java.lang.String       consigneeAddress,
		java.lang.String       consigneeMobile,
		java.math.BigDecimal   orderPrice,
		java.lang.Integer      exccreaditCount,
		java.lang.String       usedCoupons,
		java.lang.String       comments,
		org.joda.time.DateTime     preSendDate,
		String preSendTime,
		org.joda.time.DateTime createTime,
		java.lang.String       createBy,
		org.joda.time.DateTime lastModifyTime,
		java.lang.String       lastModifyBy,
		java.lang.Integer      optTime
	) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderNo = orderNo;
		this.orderType = orderType;
		this.status = status;
		this.consigneeName = consigneeName;
		this.consigneeAddress = consigneeAddress;
		this.consigneeMobile = consigneeMobile;
		this.orderPrice = orderPrice;
		this.exccreaditCount = exccreaditCount;
		this.usedCoupons = usedCoupons;
		this.comments = comments;
		this.preSendDate = preSendDate;
		this.preSendTime = preSendTime;
		this.createTime = createTime;
		this.createBy = createBy;
		this.lastModifyTime = lastModifyTime;
		this.lastModifyBy = lastModifyBy;
		this.optTime = optTime;
	}

	public java.lang.String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(java.lang.String orderId) {
		this.orderId = orderId;
	}

	public java.lang.String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(java.lang.String customerId) {
		this.customerId = customerId;
	}

	public java.lang.String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(java.lang.String orderNo) {
		this.orderNo = orderNo;
	}

	public java.lang.String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(java.lang.String orderType) {
		this.orderType = orderType;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getConsigneeName() {
		return this.consigneeName;
	}

	public void setConsigneeName(java.lang.String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public java.lang.String getConsigneeAddress() {
		return this.consigneeAddress;
	}

	public void setConsigneeAddress(java.lang.String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	public java.lang.String getConsigneeMobile() {
		return this.consigneeMobile;
	}

	public void setConsigneeMobile(java.lang.String consigneeMobile) {
		this.consigneeMobile = consigneeMobile;
	}

	public java.math.BigDecimal getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(java.math.BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	public java.lang.Integer getExccreaditCount() {
		return this.exccreaditCount;
	}

	public void setExccreaditCount(java.lang.Integer exccreaditCount) {
		this.exccreaditCount = exccreaditCount;
	}

	public java.lang.String getUsedCoupons() {
		return this.usedCoupons;
	}

	public void setUsedCoupons(java.lang.String usedCoupons) {
		this.usedCoupons = usedCoupons;
	}

	public java.lang.String getComments() {
		return this.comments;
	}

	public void setComments(java.lang.String comments) {
		this.comments = comments;
	}

	public org.joda.time.DateTime getPreSendDate() {
		return this.preSendDate;
	}

	public void setPreSendDate(org.joda.time.DateTime preSendDate) {
		this.preSendDate = preSendDate;
	}

	public String getPreSendTime() {
		return this.preSendTime;
	}

	public void setPreSendTime(String preSendTime) {
		this.preSendTime = preSendTime;
	}

	public org.joda.time.DateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(org.joda.time.DateTime createTime) {
		this.createTime = createTime;
	}

	public java.lang.String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(java.lang.String createBy) {
		this.createBy = createBy;
	}

	public org.joda.time.DateTime getLastModifyTime() {
		return this.lastModifyTime;
	}

	public void setLastModifyTime(org.joda.time.DateTime lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public java.lang.String getLastModifyBy() {
		return this.lastModifyBy;
	}

	public void setLastModifyBy(java.lang.String lastModifyBy) {
		this.lastModifyBy = lastModifyBy;
	}

	public java.lang.Integer getOptTime() {
		return this.optTime;
	}

	public void setOptTime(java.lang.Integer optTime) {
		this.optTime = optTime;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Map<String, Object> getExtMap() {
		return extMap;
	}

	public void setExtMap(Map<String, Object> extMap) {
		this.extMap = extMap;
	}

	public String getCouponPrice() {
		return couponPrice;
	}

	public void setCouponPrice(String couponPrice) {
		this.couponPrice = couponPrice;
	}

	public String getPreSendDateStr() {
		return preSendDateStr;
	}

	public void setPreSendDateStr(String preSendDateStr) {
		this.preSendDateStr = preSendDateStr;
	}
}
