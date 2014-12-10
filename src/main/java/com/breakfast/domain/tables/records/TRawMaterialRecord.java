/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 原材料表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRawMaterialRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.TRawMaterialRecord> implements org.jooq.Record11<java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 1430894356;

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.raw_material_id</code>.
	 */
	public void setRawMaterialId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.raw_material_id</code>.
	 */
	public java.lang.String getRawMaterialId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.raw_material_name</code>. 原材料名称
	 */
	public void setRawMaterialName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.raw_material_name</code>. 原材料名称
	 */
	public java.lang.String getRawMaterialName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.price</code>. 原材料价格
	 */
	public void setPrice(java.math.BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.price</code>. 原材料价格
	 */
	public java.math.BigDecimal getPrice() {
		return (java.math.BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.provider_id</code>. 供应商ID
	 */
	public void setProviderId(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.provider_id</code>. 供应商ID
	 */
	public java.lang.String getProviderId() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.unit</code>. 单位
	 */
	public void setUnit(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.unit</code>. 单位
	 */
	public java.lang.String getUnit() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.status</code>. 状态
	 */
	public void setStatus(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.status</code>. 状态
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.create_time</code>. 创建时间
	 */
	public void setCreateTime(org.joda.time.DateTime value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.create_time</code>. 创建时间
	 */
	public org.joda.time.DateTime getCreateTime() {
		return (org.joda.time.DateTime) getValue(6);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.create_by</code>. 创建人
	 */
	public void setCreateBy(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.create_by</code>. 创建人
	 */
	public java.lang.String getCreateBy() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.last_modify_time</code>. 最后修改时间
	 */
	public void setLastModifyTime(org.joda.time.DateTime value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.last_modify_time</code>. 最后修改时间
	 */
	public org.joda.time.DateTime getLastModifyTime() {
		return (org.joda.time.DateTime) getValue(8);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.last_modify_by</code>. 最后修改人
	 */
	public void setLastModifyBy(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.last_modify_by</code>. 最后修改人
	 */
	public java.lang.String getLastModifyBy() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>breakfast.t_bf_raw_material.opt_time</code>. 操作时间
	 */
	public void setOptTime(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_raw_material.opt_time</code>. 操作时间
	 */
	public java.lang.Integer getOptTime() {
		return (java.lang.Integer) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.rawMaterialId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.rawMaterialName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.price;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.providerId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.unit;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.status;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field7() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.createTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.createBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field9() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.lastModifyTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.lastModifyBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return com.breakfast.domain.tables.TRawMaterial.RawMaterial.optTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getRawMaterialId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getRawMaterialName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value3() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getProviderId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getUnit();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value7() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getCreateBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value9() {
		return getLastModifyTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getLastModifyBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getOptTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value1(java.lang.String value) {
		setRawMaterialId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value2(java.lang.String value) {
		setRawMaterialName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value3(java.math.BigDecimal value) {
		setPrice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value4(java.lang.String value) {
		setProviderId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value5(java.lang.String value) {
		setUnit(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value6(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value7(org.joda.time.DateTime value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value8(java.lang.String value) {
		setCreateBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value9(org.joda.time.DateTime value) {
		setLastModifyTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value10(java.lang.String value) {
		setLastModifyBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord value11(java.lang.Integer value) {
		setOptTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TRawMaterialRecord values(java.lang.String value1, java.lang.String value2, java.math.BigDecimal value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, org.joda.time.DateTime value7, java.lang.String value8, org.joda.time.DateTime value9, java.lang.String value10, java.lang.Integer value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TRawMaterialRecord
	 */
	public TRawMaterialRecord() {
		super(com.breakfast.domain.tables.TRawMaterial.RawMaterial);
	}

	/**
	 * Create a detached, initialised TRawMaterialRecord
	 */
	public TRawMaterialRecord(java.lang.String rawMaterialId, java.lang.String rawMaterialName, java.math.BigDecimal price, java.lang.String providerId, java.lang.String unit, java.lang.String status, org.joda.time.DateTime createTime, java.lang.String createBy, org.joda.time.DateTime lastModifyTime, java.lang.String lastModifyBy, java.lang.Integer optTime) {
		super(com.breakfast.domain.tables.TRawMaterial.RawMaterial);

		setValue(0, rawMaterialId);
		setValue(1, rawMaterialName);
		setValue(2, price);
		setValue(3, providerId);
		setValue(4, unit);
		setValue(5, status);
		setValue(6, createTime);
		setValue(7, createBy);
		setValue(8, lastModifyTime);
		setValue(9, lastModifyBy);
		setValue(10, optTime);
	}
}
