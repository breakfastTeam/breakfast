/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * 代金券表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Coupon implements java.io.Serializable {

	private static final long serialVersionUID = -1512008660;

	private java.lang.String       couponId;
	private java.lang.String       userId;
	private org.joda.time.DateTime startTime;
	private org.joda.time.DateTime endTime;
	private java.math.BigDecimal   price;
	private java.lang.String       source;
	private java.lang.String       status;
	private java.lang.String       briefIntro;
	private org.joda.time.DateTime createTime;
	private java.lang.String       createBy;
	private org.joda.time.DateTime lastModifyTime;
	private java.lang.String       lastModifyBy;
	private java.lang.Long         optTime;

	public Coupon() {}

	public Coupon(
		java.lang.String       couponId,
		java.lang.String       userId,
		org.joda.time.DateTime startTime,
		org.joda.time.DateTime endTime,
		java.math.BigDecimal   price,
		java.lang.String       source,
		java.lang.String       status,
		java.lang.String       briefIntro,
		org.joda.time.DateTime createTime,
		java.lang.String       createBy,
		org.joda.time.DateTime lastModifyTime,
		java.lang.String       lastModifyBy,
		java.lang.Long         optTime
	) {
		this.couponId = couponId;
		this.userId = userId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.price = price;
		this.source = source;
		this.status = status;
		this.briefIntro = briefIntro;
		this.createTime = createTime;
		this.createBy = createBy;
		this.lastModifyTime = lastModifyTime;
		this.lastModifyBy = lastModifyBy;
		this.optTime = optTime;
	}

	public java.lang.String getCouponId() {
		return this.couponId;
	}

	public void setCouponId(java.lang.String couponId) {
		this.couponId = couponId;
	}

	public java.lang.String getUserId() {
		return this.userId;
	}

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}

	public org.joda.time.DateTime getStartTime() {
		return this.startTime;
	}

	public void setStartTime(org.joda.time.DateTime startTime) {
		this.startTime = startTime;
	}

	public org.joda.time.DateTime getEndTime() {
		return this.endTime;
	}

	public void setEndTime(org.joda.time.DateTime endTime) {
		this.endTime = endTime;
	}

	public java.math.BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(java.math.BigDecimal price) {
		this.price = price;
	}

	public java.lang.String getSource() {
		return this.source;
	}

	public void setSource(java.lang.String source) {
		this.source = source;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getBriefIntro() {
		return this.briefIntro;
	}

	public void setBriefIntro(java.lang.String briefIntro) {
		this.briefIntro = briefIntro;
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

	public java.lang.Long getOptTime() {
		return this.optTime;
	}

	public void setOptTime(java.lang.Long optTime) {
		this.optTime = optTime;
	}
}
