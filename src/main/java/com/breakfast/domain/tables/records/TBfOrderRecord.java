/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 订单表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBfOrderRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.TBfOrderRecord> implements org.jooq.Record9<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -910177842;

	/**
	 * Setter for <code>breakfast.t_bf_order.order_id</code>.
	 */
	public void setOrderId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_order.order_id</code>.
	 */
	public java.lang.String getOrderId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_order.customer_id</code>. 客户ID
	 */
	public void setCustomerId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_order.customer_id</code>. 客户ID
	 */
	public java.lang.String getCustomerId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_order.type</code>. 类别
	 */
	public void setType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_order.type</code>. 类别
	 */
	public java.lang.String getType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_order.status</code>. 状态
	 */
	public void setStatus(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_order.status</code>. 状态
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_order.consignee_name</code>. 收货人姓名
	 */
	public void setConsigneeName(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_order.consignee_name</code>. 收货人姓名
	 */
	public java.lang.String getConsigneeName() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_order.consignee_address</code>. 收货人地址
	 */
	public void setConsigneeAddress(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_order.consignee_address</code>. 收货人地址
	 */
	public java.lang.String getConsigneeAddress() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>breakfast.t_bf_order.consignee_mobile</code>. 收货人手机号
	 */
	public void setConsigneeMobile(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_order.consignee_mobile</code>. 收货人手机号
	 */
	public java.lang.String getConsigneeMobile() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>breakfast.t_bf_order.order_price</code>. 订单金额
	 */
	public void setOrderPrice(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_order.order_price</code>. 订单金额
	 */
	public java.lang.Integer getOrderPrice() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>breakfast.t_bf_order.exccreadit_count</code>. 消耗黄豆数
	 */
	public void setExccreaditCount(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_order.exccreadit_count</code>. 消耗黄豆数
	 */
	public java.lang.Integer getExccreaditCount() {
		return (java.lang.Integer) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.TBfOrder.tBfOrder.ORDER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.TBfOrder.tBfOrder.CUSTOMER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.TBfOrder.tBfOrder.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.breakfast.domain.tables.TBfOrder.tBfOrder.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.breakfast.domain.tables.TBfOrder.tBfOrder.CONSIGNEE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.breakfast.domain.tables.TBfOrder.tBfOrder.CONSIGNEE_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.breakfast.domain.tables.TBfOrder.tBfOrder.CONSIGNEE_MOBILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return com.breakfast.domain.tables.TBfOrder.tBfOrder.ORDER_PRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return com.breakfast.domain.tables.TBfOrder.tBfOrder.EXCCREADIT_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getOrderId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCustomerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getConsigneeName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getConsigneeAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getConsigneeMobile();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getOrderPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getExccreaditCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord value1(java.lang.String value) {
		setOrderId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord value2(java.lang.String value) {
		setCustomerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord value3(java.lang.String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord value4(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord value5(java.lang.String value) {
		setConsigneeName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord value6(java.lang.String value) {
		setConsigneeAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord value7(java.lang.String value) {
		setConsigneeMobile(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord value8(java.lang.Integer value) {
		setOrderPrice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord value9(java.lang.Integer value) {
		setExccreaditCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfOrderRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Integer value8, java.lang.Integer value9) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBfOrderRecord
	 */
	public TBfOrderRecord() {
		super(com.breakfast.domain.tables.TBfOrder.tBfOrder);
	}

	/**
	 * Create a detached, initialised TBfOrderRecord
	 */
	public TBfOrderRecord(java.lang.String orderId, java.lang.String customerId, java.lang.String type, java.lang.String status, java.lang.String consigneeName, java.lang.String consigneeAddress, java.lang.String consigneeMobile, java.lang.Integer orderPrice, java.lang.Integer exccreaditCount) {
		super(com.breakfast.domain.tables.TBfOrder.tBfOrder);

		setValue(0, orderId);
		setValue(1, customerId);
		setValue(2, type);
		setValue(3, status);
		setValue(4, consigneeName);
		setValue(5, consigneeAddress);
		setValue(6, consigneeMobile);
		setValue(7, orderPrice);
		setValue(8, exccreaditCount);
	}
}
