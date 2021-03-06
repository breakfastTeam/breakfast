/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 客服
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCustomerServiceRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.TCustomerServiceRecord> implements org.jooq.Record6<java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = -1758076310;

	/**
	 * Setter for <code>breakfast.t_bf_customer_service.user_id</code>.
	 */
	public void setUserId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_customer_service.user_id</code>.
	 */
	public java.lang.String getUserId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_customer_service.create_time</code>. 创建时间
	 */
	public void setCreateTime(org.joda.time.DateTime value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_customer_service.create_time</code>. 创建时间
	 */
	public org.joda.time.DateTime getCreateTime() {
		return (org.joda.time.DateTime) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_customer_service.create_by</code>. 创建人
	 */
	public void setCreateBy(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_customer_service.create_by</code>. 创建人
	 */
	public java.lang.String getCreateBy() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_customer_service.last_modify_time</code>. 最后修改时间
	 */
	public void setLastModifyTime(org.joda.time.DateTime value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_customer_service.last_modify_time</code>. 最后修改时间
	 */
	public org.joda.time.DateTime getLastModifyTime() {
		return (org.joda.time.DateTime) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_customer_service.last_modify_by</code>. 最后修改人
	 */
	public void setLastModifyBy(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_customer_service.last_modify_by</code>. 最后修改人
	 */
	public java.lang.String getLastModifyBy() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_customer_service.opt_time</code>. 操作时间
	 */
	public void setOptTime(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_customer_service.opt_time</code>. 操作时间
	 */
	public java.lang.Long getOptTime() {
		return (java.lang.Long) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.TCustomerService.CustomerService.userId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field2() {
		return com.breakfast.domain.tables.TCustomerService.CustomerService.createTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.TCustomerService.CustomerService.createBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field4() {
		return com.breakfast.domain.tables.TCustomerService.CustomerService.lastModifyTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.breakfast.domain.tables.TCustomerService.CustomerService.lastModifyBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return com.breakfast.domain.tables.TCustomerService.CustomerService.optTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getUserId();
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
	public java.lang.String value3() {
		return getCreateBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value4() {
		return getLastModifyTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getLastModifyBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getOptTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCustomerServiceRecord value1(java.lang.String value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCustomerServiceRecord value2(org.joda.time.DateTime value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCustomerServiceRecord value3(java.lang.String value) {
		setCreateBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCustomerServiceRecord value4(org.joda.time.DateTime value) {
		setLastModifyTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCustomerServiceRecord value5(java.lang.String value) {
		setLastModifyBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCustomerServiceRecord value6(java.lang.Long value) {
		setOptTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCustomerServiceRecord values(java.lang.String value1, org.joda.time.DateTime value2, java.lang.String value3, org.joda.time.DateTime value4, java.lang.String value5, java.lang.Long value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TCustomerServiceRecord
	 */
	public TCustomerServiceRecord() {
		super(com.breakfast.domain.tables.TCustomerService.CustomerService);
	}

	/**
	 * Create a detached, initialised TCustomerServiceRecord
	 */
	public TCustomerServiceRecord(java.lang.String userId, org.joda.time.DateTime createTime, java.lang.String createBy, org.joda.time.DateTime lastModifyTime, java.lang.String lastModifyBy, java.lang.Long optTime) {
		super(com.breakfast.domain.tables.TCustomerService.CustomerService);

		setValue(0, userId);
		setValue(1, createTime);
		setValue(2, createBy);
		setValue(3, lastModifyTime);
		setValue(4, lastModifyBy);
		setValue(5, optTime);
	}
}
