/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 分发红包表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TSendCouponRecord extends org.jooq.impl.UpdatableRecordImpl<TSendCouponRecord> implements org.jooq.Record13<String, org.joda.time.DateTime, org.joda.time.DateTime, java.math.BigDecimal, String, String, String, Integer, String, String, org.joda.time.DateTime, String, Long> {

	private static final long serialVersionUID = -1394677528;

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.send_coupon_id</code>.
	 */
	public void setSendCouponId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.send_coupon_id</code>.
	 */
	public String getSendCouponId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.create_time</code>. 发放时间
	 */
	public void setCreateTime(org.joda.time.DateTime value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.create_time</code>. 发放时间
	 */
	public org.joda.time.DateTime getCreateTime() {
		return (org.joda.time.DateTime) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.end_time</code>. 截止日期
	 */
	public void setEndTime(org.joda.time.DateTime value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.end_time</code>. 截止日期
	 */
	public org.joda.time.DateTime getEndTime() {
		return (org.joda.time.DateTime) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.price</code>. 价值
	 */
	public void setPrice(java.math.BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.price</code>. 价值
	 */
	public java.math.BigDecimal getPrice() {
		return (java.math.BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.source</code>. 发放人
	 */
	public void setSource(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.source</code>. 发放人
	 */
	public String getSource() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.status</code>. 状态
	 */
	public void setStatus(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.status</code>. 状态
	 */
	public String getStatus() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.brief_intro</code>. 简介
	 */
	public void setBriefIntro(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.brief_intro</code>. 简介
	 */
	public String getBriefIntro() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.num</code>.
	 */
	public void setNum(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.num</code>.
	 */
	public Integer getNum() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.url</code>.
	 */
	public void setUrl(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.url</code>.
	 */
	public String getUrl() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.create_by</code>. 创建人
	 */
	public void setCreateBy(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.create_by</code>. 创建人
	 */
	public String getCreateBy() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.last_modify_time</code>. 最后修改时间
	 */
	public void setLastModifyTime(org.joda.time.DateTime value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.last_modify_time</code>. 最后修改时间
	 */
	public org.joda.time.DateTime getLastModifyTime() {
		return (org.joda.time.DateTime) getValue(10);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.last_modify_by</code>. 最后修改人
	 */
	public void setLastModifyBy(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.last_modify_by</code>. 最后修改人
	 */
	public String getLastModifyBy() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>breakfast.t_bf_send_coupon.opt_time</code>. 操作时间
	 */
	public void setOptTime(Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_send_coupon.opt_time</code>. 操作时间
	 */
	public Long getOptTime() {
		return (Long) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<String, org.joda.time.DateTime, org.joda.time.DateTime, java.math.BigDecimal, String, String, String, Integer, String, String, org.joda.time.DateTime, String, Long> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<String, org.joda.time.DateTime, org.joda.time.DateTime, java.math.BigDecimal, String, String, String, Integer, String, String, org.joda.time.DateTime, String, Long> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field1() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.sendCouponId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field2() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.createTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field3() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.endTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.price;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field5() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.source;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field6() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.status;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field7() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.briefIntro;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field8() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.num;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field9() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.url;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field10() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.createBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field11() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.lastModifyTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field12() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.lastModifyBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Long> field13() {
		return com.breakfast.domain.tables.TSendCoupon.SendCoupon.optTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getSendCouponId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value2() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value3() {
		return getEndTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value4() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getSource();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getBriefIntro();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getCreateBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value11() {
		return getLastModifyTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getLastModifyBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value13() {
		return getOptTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value1(String value) {
		setSendCouponId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value2(org.joda.time.DateTime value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value3(org.joda.time.DateTime value) {
		setEndTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value4(java.math.BigDecimal value) {
		setPrice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value5(String value) {
		setSource(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value6(String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value7(String value) {
		setBriefIntro(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value8(Integer value) {
		setNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value9(String value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value10(String value) {
		setCreateBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value11(org.joda.time.DateTime value) {
		setLastModifyTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value12(String value) {
		setLastModifyBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord value13(Long value) {
		setOptTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSendCouponRecord values(String value1, org.joda.time.DateTime value2, org.joda.time.DateTime value3, java.math.BigDecimal value4, String value5, String value6, String value7, Integer value8, String value9, String value10, org.joda.time.DateTime value11, String value12, Long value13) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TSendCouponRecord
	 */
	public TSendCouponRecord() {
		super(com.breakfast.domain.tables.TSendCoupon.SendCoupon);
	}

	/**
	 * Create a detached, initialised TSendCouponRecord
	 */
	public TSendCouponRecord(String sendCouponId, org.joda.time.DateTime createTime, org.joda.time.DateTime endTime, java.math.BigDecimal price, String source, String status, String briefIntro, Integer num, String url, String createBy, org.joda.time.DateTime lastModifyTime, String lastModifyBy, Long optTime) {
		super(com.breakfast.domain.tables.TSendCoupon.SendCoupon);

		setValue(0, sendCouponId);
		setValue(1, createTime);
		setValue(2, endTime);
		setValue(3, price);
		setValue(4, source);
		setValue(5, status);
		setValue(6, briefIntro);
		setValue(7, num);
		setValue(8, url);
		setValue(9, createBy);
		setValue(10, lastModifyTime);
		setValue(11, lastModifyBy);
		setValue(12, optTime);
	}
}