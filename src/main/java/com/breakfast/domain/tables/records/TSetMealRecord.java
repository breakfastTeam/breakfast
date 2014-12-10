/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 套餐表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TSetMealRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.TSetMealRecord> implements org.jooq.Record22<java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = 2071054801;

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.set_meal_id</code>.
	 */
	public void setSetMealId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.set_meal_id</code>.
	 */
	public java.lang.String getSetMealId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.set_name</code>. 套餐名称
	 */
	public void setSetName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.set_name</code>. 套餐名称
	 */
	public java.lang.String getSetName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.introduce</code>. 套餐说明
	 */
	public void setIntroduce(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.introduce</code>. 套餐说明
	 */
	public java.lang.String getIntroduce() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.start_time</code>. 套餐开始日期
	 */
	public void setStartTime(org.joda.time.DateTime value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.start_time</code>. 套餐开始日期
	 */
	public org.joda.time.DateTime getStartTime() {
		return (org.joda.time.DateTime) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.end_time</code>. 套餐结束日期
	 */
	public void setEndTime(org.joda.time.DateTime value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.end_time</code>. 套餐结束日期
	 */
	public org.joda.time.DateTime getEndTime() {
		return (org.joda.time.DateTime) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.price</code>. 套餐价格
	 */
	public void setPrice(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.price</code>. 套餐价格
	 */
	public java.math.BigDecimal getPrice() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.privilege</code>. 套餐优惠
	 */
	public void setPrivilege(java.math.BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.privilege</code>. 套餐优惠
	 */
	public java.math.BigDecimal getPrivilege() {
		return (java.math.BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.status</code>. 状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD
	 */
	public void setStatus(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.status</code>. 状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.food_count</code>. 假库存数
	 */
	public void setFoodCount(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.food_count</code>. 假库存数
	 */
	public java.lang.Integer getFoodCount() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.real_food_count</code>. 真实库存
	 */
	public void setRealFoodCount(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.real_food_count</code>. 真实库存
	 */
	public java.lang.Integer getRealFoodCount() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.small_pic_id</code>. 缩略图
	 */
	public void setSmallPicId(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.small_pic_id</code>. 缩略图
	 */
	public java.lang.String getSmallPicId() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.orgin_pic_id</code>. 原图
	 */
	public void setOrginPicId(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.orgin_pic_id</code>. 原图
	 */
	public java.lang.String getOrginPicId() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.support_snap_up</code>. 是否支持抢购
	 */
	public void setSupportSnapUp(java.lang.Byte value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.support_snap_up</code>. 是否支持抢购
	 */
	public java.lang.Byte getSupportSnapUp() {
		return (java.lang.Byte) getValue(12);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.support_exchange</code>. 是否支持兑换
	 */
	public void setSupportExchange(java.lang.Byte value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.support_exchange</code>. 是否支持兑换
	 */
	public java.lang.Byte getSupportExchange() {
		return (java.lang.Byte) getValue(13);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.exchange_count</code>. 兑换所需黄豆数
	 */
	public void setExchangeCount(java.lang.Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.exchange_count</code>. 兑换所需黄豆数
	 */
	public java.lang.Integer getExchangeCount() {
		return (java.lang.Integer) getValue(14);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.show_order</code>. 显示顺序
	 */
	public void setShowOrder(java.lang.Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.show_order</code>. 显示顺序
	 */
	public java.lang.Integer getShowOrder() {
		return (java.lang.Integer) getValue(15);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.sale_time</code>.
	 */
	public void setSaleTime(java.sql.Timestamp value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.sale_time</code>.
	 */
	public java.sql.Timestamp getSaleTime() {
		return (java.sql.Timestamp) getValue(16);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.create_time</code>. 创建时间
	 */
	public void setCreateTime(org.joda.time.DateTime value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.create_time</code>. 创建时间
	 */
	public org.joda.time.DateTime getCreateTime() {
		return (org.joda.time.DateTime) getValue(17);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.create_by</code>. 创建人
	 */
	public void setCreateBy(java.lang.String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.create_by</code>. 创建人
	 */
	public java.lang.String getCreateBy() {
		return (java.lang.String) getValue(18);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.last_modify_time</code>. 最后修改时间
	 */
	public void setLastModifyTime(org.joda.time.DateTime value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.last_modify_time</code>. 最后修改时间
	 */
	public org.joda.time.DateTime getLastModifyTime() {
		return (org.joda.time.DateTime) getValue(19);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.last_modify_by</code>. 最后修改人
	 */
	public void setLastModifyBy(java.lang.String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.last_modify_by</code>. 最后修改人
	 */
	public java.lang.String getLastModifyBy() {
		return (java.lang.String) getValue(20);
	}

	/**
	 * Setter for <code>breakfast.t_bf_set_meal.opt_time</code>. 操作时间
	 */
	public void setOptTime(java.lang.Long value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_set_meal.opt_time</code>. 操作时间
	 */
	public java.lang.Long getOptTime() {
		return (java.lang.Long) getValue(21);
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
	// Record22 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row22) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row22) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.setMealId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.setName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.introduce;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field4() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.startTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field5() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.endTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.price;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field7() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.privilege;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.status;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.foodCount;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.realFoodCount;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.smallPicId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.orginPicId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field13() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.supportSnapUp;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field14() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.supportExchange;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field15() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.exchangeCount;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field16() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.showOrder;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field17() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.saleTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field18() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.createTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field19() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.createBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field20() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.lastModifyTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field21() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.lastModifyBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field22() {
		return com.breakfast.domain.tables.TSetMeal.SetMeal.optTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getSetMealId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getSetName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getIntroduce();
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
		return getEndTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value7() {
		return getPrivilege();
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
	public java.lang.Integer value9() {
		return getFoodCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getRealFoodCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getSmallPicId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getOrginPicId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value13() {
		return getSupportSnapUp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value14() {
		return getSupportExchange();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value15() {
		return getExchangeCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value16() {
		return getShowOrder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value17() {
		return getSaleTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value18() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value19() {
		return getCreateBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value20() {
		return getLastModifyTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value21() {
		return getLastModifyBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value22() {
		return getOptTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value1(java.lang.String value) {
		setSetMealId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value2(java.lang.String value) {
		setSetName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value3(java.lang.String value) {
		setIntroduce(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value4(org.joda.time.DateTime value) {
		setStartTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value5(org.joda.time.DateTime value) {
		setEndTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value6(java.math.BigDecimal value) {
		setPrice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value7(java.math.BigDecimal value) {
		setPrivilege(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value8(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value9(java.lang.Integer value) {
		setFoodCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value10(java.lang.Integer value) {
		setRealFoodCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value11(java.lang.String value) {
		setSmallPicId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value12(java.lang.String value) {
		setOrginPicId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value13(java.lang.Byte value) {
		setSupportSnapUp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value14(java.lang.Byte value) {
		setSupportExchange(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value15(java.lang.Integer value) {
		setExchangeCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value16(java.lang.Integer value) {
		setShowOrder(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value17(java.sql.Timestamp value) {
		setSaleTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value18(org.joda.time.DateTime value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value19(java.lang.String value) {
		setCreateBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value20(org.joda.time.DateTime value) {
		setLastModifyTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value21(java.lang.String value) {
		setLastModifyBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord value22(java.lang.Long value) {
		setOptTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSetMealRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, org.joda.time.DateTime value4, org.joda.time.DateTime value5, java.math.BigDecimal value6, java.math.BigDecimal value7, java.lang.String value8, java.lang.Integer value9, java.lang.Integer value10, java.lang.String value11, java.lang.String value12, java.lang.Byte value13, java.lang.Byte value14, java.lang.Integer value15, java.lang.Integer value16, java.sql.Timestamp value17, org.joda.time.DateTime value18, java.lang.String value19, org.joda.time.DateTime value20, java.lang.String value21, java.lang.Long value22) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TSetMealRecord
	 */
	public TSetMealRecord() {
		super(com.breakfast.domain.tables.TSetMeal.SetMeal);
	}

	/**
	 * Create a detached, initialised TSetMealRecord
	 */
	public TSetMealRecord(java.lang.String setMealId, java.lang.String setName, java.lang.String introduce, org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, java.math.BigDecimal price, java.math.BigDecimal privilege, java.lang.String status, java.lang.Integer foodCount, java.lang.Integer realFoodCount, java.lang.String smallPicId, java.lang.String orginPicId, java.lang.Byte supportSnapUp, java.lang.Byte supportExchange, java.lang.Integer exchangeCount, java.lang.Integer showOrder, java.sql.Timestamp saleTime, org.joda.time.DateTime createTime, java.lang.String createBy, org.joda.time.DateTime lastModifyTime, java.lang.String lastModifyBy, java.lang.Long optTime) {
		super(com.breakfast.domain.tables.TSetMeal.SetMeal);

		setValue(0, setMealId);
		setValue(1, setName);
		setValue(2, introduce);
		setValue(3, startTime);
		setValue(4, endTime);
		setValue(5, price);
		setValue(6, privilege);
		setValue(7, status);
		setValue(8, foodCount);
		setValue(9, realFoodCount);
		setValue(10, smallPicId);
		setValue(11, orginPicId);
		setValue(12, supportSnapUp);
		setValue(13, supportExchange);
		setValue(14, exchangeCount);
		setValue(15, showOrder);
		setValue(16, saleTime);
		setValue(17, createTime);
		setValue(18, createBy);
		setValue(19, lastModifyTime);
		setValue(20, lastModifyBy);
		setValue(21, optTime);
	}
}
