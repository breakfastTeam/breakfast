/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 用户定制详情
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBfCustomOrderDetailRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.TBfCustomOrderDetailRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -224597306;

	/**
	 * Setter for <code>breakfast.t_bf_custom_order_detail.detail_id</code>.
	 */
	public void setDetailId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_custom_order_detail.detail_id</code>.
	 */
	public java.lang.String getDetailId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_custom_order_detail.food_custom_id</code>. 定制表ID
	 */
	public void setFoodCustomId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_custom_order_detail.food_custom_id</code>. 定制表ID
	 */
	public java.lang.String getFoodCustomId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_custom_order_detail.food_id</code>. 食品数量
	 */
	public void setFoodId(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_custom_order_detail.food_id</code>. 食品数量
	 */
	public java.lang.String getFoodId() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_custom_order_detail.food_count</code>. 食品数量
	 */
	public void setFoodCount(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_custom_order_detail.food_count</code>. 食品数量
	 */
	public java.lang.Integer getFoodCount() {
		return (java.lang.Integer) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.TBfCustomOrderDetail.tBfCustomOrderDetail.DETAIL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.TBfCustomOrderDetail.tBfCustomOrderDetail.FOOD_CUSTOM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.TBfCustomOrderDetail.tBfCustomOrderDetail.FOOD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.breakfast.domain.tables.TBfCustomOrderDetail.tBfCustomOrderDetail.FOOD_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getDetailId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFoodCustomId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getFoodId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getFoodCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfCustomOrderDetailRecord value1(java.lang.String value) {
		setDetailId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfCustomOrderDetailRecord value2(java.lang.String value) {
		setFoodCustomId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfCustomOrderDetailRecord value3(java.lang.String value) {
		setFoodId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfCustomOrderDetailRecord value4(java.lang.Integer value) {
		setFoodCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfCustomOrderDetailRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBfCustomOrderDetailRecord
	 */
	public TBfCustomOrderDetailRecord() {
		super(com.breakfast.domain.tables.TBfCustomOrderDetail.tBfCustomOrderDetail);
	}

	/**
	 * Create a detached, initialised TBfCustomOrderDetailRecord
	 */
	public TBfCustomOrderDetailRecord(java.lang.String detailId, java.lang.String foodCustomId, java.lang.String foodId, java.lang.Integer foodCount) {
		super(com.breakfast.domain.tables.TBfCustomOrderDetail.tBfCustomOrderDetail);

		setValue(0, detailId);
		setValue(1, foodCustomId);
		setValue(2, foodId);
		setValue(3, foodCount);
	}
}
