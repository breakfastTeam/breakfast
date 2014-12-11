/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 食品表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TFood extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TFoodRecord> {

	private static final long serialVersionUID = -643257237;

	/**
	 * The singleton instance of <code>breakfast.t_bf_food</code>
	 */
	public static final com.breakfast.domain.tables.TFood Food = new com.breakfast.domain.tables.TFood();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.TFoodRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TFoodRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_food.food_id</code>. 主键
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.String> foodId = createField("food_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "主键");

	/**
	 * The column <code>breakfast.t_bf_food.food_name</code>. 名称
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.String> foodName = createField("food_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "名称");

	/**
	 * The column <code>breakfast.t_bf_food.cost</code>. 成本
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.math.BigDecimal> cost = createField("cost", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 3), this, "成本");

	/**
	 * The column <code>breakfast.t_bf_food.price</code>. 单价
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.math.BigDecimal> price = createField("price", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 3), this, "单价");

	/**
	 * The column <code>breakfast.t_bf_food.unit</code>. 单位
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.String> unit = createField("unit", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "单位");

	/**
	 * The column <code>breakfast.t_bf_food.brief_intro</code>. 简介
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.String> briefIntro = createField("brief_intro", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this, "简介");

	/**
	 * The column <code>breakfast.t_bf_food.status</code>. 状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.String> status = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD");

	/**
	 * The column <code>breakfast.t_bf_food.food_count</code>. 假库存数
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.Integer> foodCount = createField("food_count", org.jooq.impl.SQLDataType.INTEGER, this, "假库存数");

	/**
	 * The column <code>breakfast.t_bf_food.real_food_count</code>. 真实库存
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.Integer> realFoodCount = createField("real_food_count", org.jooq.impl.SQLDataType.INTEGER, this, "真实库存");

	/**
	 * The column <code>breakfast.t_bf_food.small_pic_id</code>. 缩略图
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.String> smallPicId = createField("small_pic_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "缩略图");

	/**
	 * The column <code>breakfast.t_bf_food.orgin_pic_id</code>. 原图
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.String> orginPicId = createField("orgin_pic_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "原图");

	/**
	 * The column <code>breakfast.t_bf_food.support_snap_up</code>. 是否支持抢购
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.Boolean> supportSnapUp = createField("support_snap_up", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否支持抢购");

	/**
	 * The column <code>breakfast.t_bf_food.support_exchange</code>. 是否支持兑换
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.Boolean> supportExchange = createField("support_exchange", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否支持兑换");

	/**
	 * The column <code>breakfast.t_bf_food.exchange_count</code>. 兑换所需黄豆数
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.Integer> exchangeCount = createField("exchange_count", org.jooq.impl.SQLDataType.INTEGER, this, "兑换所需黄豆数");

	/**
	 * The column <code>breakfast.t_bf_food.show_order</code>. 显示顺序
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.Integer> showOrder = createField("show_order", org.jooq.impl.SQLDataType.INTEGER, this, "显示顺序");

	/**
	 * The column <code>breakfast.t_bf_food.sale_time</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.sql.Timestamp> saleTime = createField("sale_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>breakfast.t_bf_food.create_time</code>. 创建时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, org.joda.time.DateTime> createTime = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_food.create_by</code>. 创建人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.String> createBy = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "创建人");

	/**
	 * The column <code>breakfast.t_bf_food.last_modify_time</code>. 最后修改时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, org.joda.time.DateTime> lastModifyTime = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后修改时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_food.last_modify_by</code>. 最后修改人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.String> lastModifyBy = createField("last_modify_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "最后修改人");

	/**
	 * The column <code>breakfast.t_bf_food.opt_time</code>. 操作时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFoodRecord, java.lang.Long> optTime = createField("opt_time", org.jooq.impl.SQLDataType.BIGINT, this, "操作时间");

	/**
	 * Create a <code>breakfast.t_bf_food</code> table reference
	 */
	public TFood() {
		this("t_bf_food", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_food</code> table reference
	 */
	public TFood(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.TFood.Food);
	}

	private TFood(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TFoodRecord> aliased) {
		this(alias, aliased, null);
	}

	private TFood(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TFoodRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.breakfast, aliased, parameters, "食品表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.TFoodRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.keyTBfFoodPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TFoodRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TFoodRecord>>asList(com.breakfast.domain.Keys.keyTBfFoodPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TFood as(java.lang.String alias) {
		return new com.breakfast.domain.tables.TFood(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TFood rename(java.lang.String name) {
		return new com.breakfast.domain.tables.TFood(name, null);
	}
}