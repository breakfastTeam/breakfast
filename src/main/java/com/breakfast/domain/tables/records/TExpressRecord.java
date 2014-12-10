/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 订单配送表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExpressRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.TExpressRecord> implements org.jooq.Record13<java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = 765306889;

	/**
	 * Setter for <code>breakfast.t_bf_express.express_id</code>.
	 */
	public void setExpressId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.express_id</code>.
	 */
	public java.lang.String getExpressId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.order_id</code>. 订单ID
	 */
	public void setOrderId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.order_id</code>. 订单ID
	 */
	public java.lang.String getOrderId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.courier_id</code>. 快递员ID
	 */
	public void setCourierId(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.courier_id</code>. 快递员ID
	 */
	public java.lang.String getCourierId() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.start_time</code>. 起送时间
	 */
	public void setStartTime(org.joda.time.DateTime value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.start_time</code>. 起送时间
	 */
	public org.joda.time.DateTime getStartTime() {
		return (org.joda.time.DateTime) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.finish_time</code>. 送达时间
	 */
	public void setFinishTime(org.joda.time.DateTime value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.finish_time</code>. 送达时间
	 */
	public org.joda.time.DateTime getFinishTime() {
		return (org.joda.time.DateTime) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.longitude</code>. 经度
	 */
	public void setLongitude(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.longitude</code>. 经度
	 */
	public java.lang.String getLongitude() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.latitude</code>. 纬度
	 */
	public void setLatitude(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.latitude</code>. 纬度
	 */
	public java.lang.String getLatitude() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.status</code>. 状态
	 */
	public void setStatus(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.status</code>. 状态
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.create_time</code>. 创建时间
	 */
	public void setCreateTime(org.joda.time.DateTime value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.create_time</code>. 创建时间
	 */
	public org.joda.time.DateTime getCreateTime() {
		return (org.joda.time.DateTime) getValue(8);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.create_by</code>. 创建人
	 */
	public void setCreateBy(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.create_by</code>. 创建人
	 */
	public java.lang.String getCreateBy() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.last_modify_time</code>. 最后修改时间
	 */
	public void setLastModifyTime(org.joda.time.DateTime value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.last_modify_time</code>. 最后修改时间
	 */
	public org.joda.time.DateTime getLastModifyTime() {
		return (org.joda.time.DateTime) getValue(10);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.last_modify_by</code>. 最后修改人
	 */
	public void setLastModifyBy(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.last_modify_by</code>. 最后修改人
	 */
	public java.lang.String getLastModifyBy() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>breakfast.t_bf_express.opt_time</code>. 操作时间
	 */
	public void setOptTime(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_express.opt_time</code>. 操作时间
	 */
	public java.lang.Long getOptTime() {
		return (java.lang.Long) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.TExpress.Express.expressId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.TExpress.Express.orderId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.TExpress.Express.courierId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field4() {
		return com.breakfast.domain.tables.TExpress.Express.startTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field5() {
		return com.breakfast.domain.tables.TExpress.Express.finishTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.breakfast.domain.tables.TExpress.Express.longitude;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.breakfast.domain.tables.TExpress.Express.latitude;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.breakfast.domain.tables.TExpress.Express.status;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field9() {
		return com.breakfast.domain.tables.TExpress.Express.createTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.breakfast.domain.tables.TExpress.Express.createBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field11() {
		return com.breakfast.domain.tables.TExpress.Express.lastModifyTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return com.breakfast.domain.tables.TExpress.Express.lastModifyBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field13() {
		return com.breakfast.domain.tables.TExpress.Express.optTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getExpressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getOrderId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getCourierId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value4() {
		return getStartTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value5() {
		return getFinishTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getLongitude();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getLatitude();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value9() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
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
	public java.lang.String value12() {
		return getLastModifyBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value13() {
		return getOptTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value1(java.lang.String value) {
		setExpressId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value2(java.lang.String value) {
		setOrderId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value3(java.lang.String value) {
		setCourierId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value4(org.joda.time.DateTime value) {
		setStartTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value5(org.joda.time.DateTime value) {
		setFinishTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value6(java.lang.String value) {
		setLongitude(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value7(java.lang.String value) {
		setLatitude(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value8(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value9(org.joda.time.DateTime value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value10(java.lang.String value) {
		setCreateBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value11(org.joda.time.DateTime value) {
		setLastModifyTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value12(java.lang.String value) {
		setLastModifyBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord value13(java.lang.Long value) {
		setOptTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExpressRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, org.joda.time.DateTime value4, org.joda.time.DateTime value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, org.joda.time.DateTime value9, java.lang.String value10, org.joda.time.DateTime value11, java.lang.String value12, java.lang.Long value13) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TExpressRecord
	 */
	public TExpressRecord() {
		super(com.breakfast.domain.tables.TExpress.Express);
	}

	/**
	 * Create a detached, initialised TExpressRecord
	 */
	public TExpressRecord(java.lang.String expressId, java.lang.String orderId, java.lang.String courierId, org.joda.time.DateTime startTime, org.joda.time.DateTime finishTime, java.lang.String longitude, java.lang.String latitude, java.lang.String status, org.joda.time.DateTime createTime, java.lang.String createBy, org.joda.time.DateTime lastModifyTime, java.lang.String lastModifyBy, java.lang.Long optTime) {
		super(com.breakfast.domain.tables.TExpress.Express);

		setValue(0, expressId);
		setValue(1, orderId);
		setValue(2, courierId);
		setValue(3, startTime);
		setValue(4, finishTime);
		setValue(5, longitude);
		setValue(6, latitude);
		setValue(7, status);
		setValue(8, createTime);
		setValue(9, createBy);
		setValue(10, lastModifyTime);
		setValue(11, lastModifyBy);
		setValue(12, optTime);
	}
}
