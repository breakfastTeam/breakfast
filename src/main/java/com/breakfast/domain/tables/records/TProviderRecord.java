/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 供应商
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProviderRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.TProviderRecord> implements org.jooq.Record12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -1283203884;

	/**
	 * Setter for <code>breakfast.t_bf_provider.provider_id</code>.
	 */
	public void setProviderId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.provider_id</code>.
	 */
	public java.lang.String getProviderId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.provider_name</code>. 供应商名称
	 */
	public void setProviderName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.provider_name</code>. 供应商名称
	 */
	public java.lang.String getProviderName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.phone</code>. 常用电话
	 */
	public void setPhone(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.phone</code>. 常用电话
	 */
	public java.lang.String getPhone() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.alternative_phone</code>. 备用电话
	 */
	public void setAlternativePhone(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.alternative_phone</code>. 备用电话
	 */
	public java.lang.String getAlternativePhone() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.address</code>. 地址
	 */
	public void setAddress(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.address</code>. 地址
	 */
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.intro</code>. 描述
	 */
	public void setIntro(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.intro</code>. 描述
	 */
	public java.lang.String getIntro() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.status</code>. 状态
	 */
	public void setStatus(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.status</code>. 状态
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.create_time</code>. 创建时间
	 */
	public void setCreateTime(org.joda.time.DateTime value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.create_time</code>. 创建时间
	 */
	public org.joda.time.DateTime getCreateTime() {
		return (org.joda.time.DateTime) getValue(7);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.create_by</code>. 创建人
	 */
	public void setCreateBy(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.create_by</code>. 创建人
	 */
	public java.lang.String getCreateBy() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.last_modify_time</code>. 最后修改时间
	 */
	public void setLastModifyTime(org.joda.time.DateTime value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.last_modify_time</code>. 最后修改时间
	 */
	public org.joda.time.DateTime getLastModifyTime() {
		return (org.joda.time.DateTime) getValue(9);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.last_modify_by</code>. 最后修改人
	 */
	public void setLastModifyBy(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.last_modify_by</code>. 最后修改人
	 */
	public java.lang.String getLastModifyBy() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>breakfast.t_bf_provider.opt_time</code>. 操作时间
	 */
	public void setOptTime(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_provider.opt_time</code>. 操作时间
	 */
	public java.lang.Integer getOptTime() {
		return (java.lang.Integer) getValue(11);
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
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.TProvider.Provider.providerId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.TProvider.Provider.providerName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.TProvider.Provider.phone;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.breakfast.domain.tables.TProvider.Provider.alternativePhone;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.breakfast.domain.tables.TProvider.Provider.address;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.breakfast.domain.tables.TProvider.Provider.intro;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.breakfast.domain.tables.TProvider.Provider.status;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field8() {
		return com.breakfast.domain.tables.TProvider.Provider.createTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return com.breakfast.domain.tables.TProvider.Provider.createBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field10() {
		return com.breakfast.domain.tables.TProvider.Provider.lastModifyTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.breakfast.domain.tables.TProvider.Provider.lastModifyBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return com.breakfast.domain.tables.TProvider.Provider.optTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getProviderId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getProviderName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getAlternativePhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getIntro();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value8() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getCreateBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value10() {
		return getLastModifyTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getLastModifyBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getOptTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value1(java.lang.String value) {
		setProviderId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value2(java.lang.String value) {
		setProviderName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value3(java.lang.String value) {
		setPhone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value4(java.lang.String value) {
		setAlternativePhone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value5(java.lang.String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value6(java.lang.String value) {
		setIntro(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value7(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value8(org.joda.time.DateTime value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value9(java.lang.String value) {
		setCreateBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value10(org.joda.time.DateTime value) {
		setLastModifyTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value11(java.lang.String value) {
		setLastModifyBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord value12(java.lang.Integer value) {
		setOptTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TProviderRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, org.joda.time.DateTime value8, java.lang.String value9, org.joda.time.DateTime value10, java.lang.String value11, java.lang.Integer value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TProviderRecord
	 */
	public TProviderRecord() {
		super(com.breakfast.domain.tables.TProvider.Provider);
	}

	/**
	 * Create a detached, initialised TProviderRecord
	 */
	public TProviderRecord(java.lang.String providerId, java.lang.String providerName, java.lang.String phone, java.lang.String alternativePhone, java.lang.String address, java.lang.String intro, java.lang.String status, org.joda.time.DateTime createTime, java.lang.String createBy, org.joda.time.DateTime lastModifyTime, java.lang.String lastModifyBy, java.lang.Integer optTime) {
		super(com.breakfast.domain.tables.TProvider.Provider);

		setValue(0, providerId);
		setValue(1, providerName);
		setValue(2, phone);
		setValue(3, alternativePhone);
		setValue(4, address);
		setValue(5, intro);
		setValue(6, status);
		setValue(7, createTime);
		setValue(8, createBy);
		setValue(9, lastModifyTime);
		setValue(10, lastModifyBy);
		setValue(11, optTime);
	}
}
