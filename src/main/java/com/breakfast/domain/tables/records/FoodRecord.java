/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 食品表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoodRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.FoodRecord> implements org.jooq.Record14<java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte, java.lang.Integer> {

	private static final long serialVersionUID = -81702666;

	/**
	 * Setter for <code>breakfast.t_bf_food.food_id</code>. 主键
	 */
	public void setFoodId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.food_id</code>. 主键
	 */
	public java.lang.String getFoodId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.food_name</code>. 名称
	 */
	public void setFoodName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.food_name</code>. 名称
	 */
	public java.lang.String getFoodName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.cost</code>. 成本
	 */
	public void setCost(java.math.BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.cost</code>. 成本
	 */
	public java.math.BigDecimal getCost() {
		return (java.math.BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.price</code>. 单价
	 */
	public void setPrice(java.math.BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.price</code>. 单价
	 */
	public java.math.BigDecimal getPrice() {
		return (java.math.BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.unit</code>. 单位
	 */
	public void setUnit(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.unit</code>. 单位
	 */
	public java.lang.String getUnit() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.brief_intro</code>. 简介
	 */
	public void setBriefIntro(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.brief_intro</code>. 简介
	 */
	public java.lang.String getBriefIntro() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.status</code>. 状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD
	 */
	public void setStatus(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.status</code>. 状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.food_count</code>. 假库存数
	 */
	public void setFoodCount(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.food_count</code>. 假库存数
	 */
	public java.lang.Integer getFoodCount() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.real_food_count</code>. 真实库存
	 */
	public void setRealFoodCount(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.real_food_count</code>. 真实库存
	 */
	public java.lang.Integer getRealFoodCount() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.small_pic_id</code>. 缩略图
	 */
	public void setSmallPicId(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.small_pic_id</code>. 缩略图
	 */
	public java.lang.String getSmallPicId() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.orgin_pic_id</code>. 原图
	 */
	public void setOrginPicId(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.orgin_pic_id</code>. 原图
	 */
	public java.lang.String getOrginPicId() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.support_snap_up</code>. 是否支持抢购
	 */
	public void setSupportSnapUp(java.lang.Byte value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.support_snap_up</code>. 是否支持抢购
	 */
	public java.lang.Byte getSupportSnapUp() {
		return (java.lang.Byte) getValue(11);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.support_exchange</code>. 是否支持兑换
	 */
	public void setSupportExchange(java.lang.Byte value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.support_exchange</code>. 是否支持兑换
	 */
	public java.lang.Byte getSupportExchange() {
		return (java.lang.Byte) getValue(12);
	}

	/**
	 * Setter for <code>breakfast.t_bf_food.exchange_count</code>. 兑换所需黄豆数
	 */
	public void setExchangeCount(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_food.exchange_count</code>. 兑换所需黄豆数
	 */
	public java.lang.Integer getExchangeCount() {
		return (java.lang.Integer) getValue(13);
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
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte, java.lang.Integer> valuesRow() {
		return (org.jooq.Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.Food.Food.foodId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.Food.Food.foodName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return com.breakfast.domain.tables.Food.Food.cost;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return com.breakfast.domain.tables.Food.Food.price;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.breakfast.domain.tables.Food.Food.unit;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.breakfast.domain.tables.Food.Food.briefIntro;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.breakfast.domain.tables.Food.Food.status;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return com.breakfast.domain.tables.Food.Food.foodCount;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return com.breakfast.domain.tables.Food.Food.realFoodCount;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.breakfast.domain.tables.Food.Food.smallPicId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.breakfast.domain.tables.Food.Food.orginPicId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field12() {
		return com.breakfast.domain.tables.Food.Food.supportSnapUp;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field13() {
		return com.breakfast.domain.tables.Food.Food.supportExchange;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field14() {
		return com.breakfast.domain.tables.Food.Food.exchangeCount;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getFoodId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFoodName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value3() {
		return getCost();
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
	public java.lang.String value5() {
		return getUnit();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getBriefIntro();
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
	public java.lang.Integer value8() {
		return getFoodCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getRealFoodCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getSmallPicId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getOrginPicId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value12() {
		return getSupportSnapUp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value13() {
		return getSupportExchange();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value14() {
		return getExchangeCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value1(java.lang.String value) {
		setFoodId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value2(java.lang.String value) {
		setFoodName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value3(java.math.BigDecimal value) {
		setCost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value4(java.math.BigDecimal value) {
		setPrice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value5(java.lang.String value) {
		setUnit(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value6(java.lang.String value) {
		setBriefIntro(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value7(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value8(java.lang.Integer value) {
		setFoodCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value9(java.lang.Integer value) {
		setRealFoodCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value10(java.lang.String value) {
		setSmallPicId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value11(java.lang.String value) {
		setOrginPicId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value12(java.lang.Byte value) {
		setSupportSnapUp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value13(java.lang.Byte value) {
		setSupportExchange(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord value14(java.lang.Integer value) {
		setExchangeCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodRecord values(java.lang.String value1, java.lang.String value2, java.math.BigDecimal value3, java.math.BigDecimal value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Integer value8, java.lang.Integer value9, java.lang.String value10, java.lang.String value11, java.lang.Byte value12, java.lang.Byte value13, java.lang.Integer value14) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FoodRecord
	 */
	public FoodRecord() {
		super(com.breakfast.domain.tables.Food.Food);
	}

	/**
	 * Create a detached, initialised FoodRecord
	 */
	public FoodRecord(java.lang.String foodId, java.lang.String foodName, java.math.BigDecimal cost, java.math.BigDecimal price, java.lang.String unit, java.lang.String briefIntro, java.lang.String status, java.lang.Integer foodCount, java.lang.Integer realFoodCount, java.lang.String smallPicId, java.lang.String orginPicId, java.lang.Byte supportSnapUp, java.lang.Byte supportExchange, java.lang.Integer exchangeCount) {
		super(com.breakfast.domain.tables.Food.Food);

		setValue(0, foodId);
		setValue(1, foodName);
		setValue(2, cost);
		setValue(3, price);
		setValue(4, unit);
		setValue(5, briefIntro);
		setValue(6, status);
		setValue(7, foodCount);
		setValue(8, realFoodCount);
		setValue(9, smallPicId);
		setValue(10, orginPicId);
		setValue(11, supportSnapUp);
		setValue(12, supportExchange);
		setValue(13, exchangeCount);
	}
}
