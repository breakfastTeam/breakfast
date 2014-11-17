/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 套餐食品
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBfSetFoods extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TBfSetFoodsRecord> {

	private static final long serialVersionUID = 248708184;

	/**
	 * The singleton instance of <code>breakfast.t_bf_set_foods</code>
	 */
	public static final com.breakfast.domain.tables.TBfSetFoods tBfSetFoods = new com.breakfast.domain.tables.TBfSetFoods();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.TBfSetFoodsRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TBfSetFoodsRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_set_foods.set_foods_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfSetFoodsRecord, java.lang.String> SET_FOODS_ID = createField("set_foods_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_set_foods.set_meal_id</code>. 套餐ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfSetFoodsRecord, java.lang.String> SET_MEAL_ID = createField("set_meal_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "套餐ID");

	/**
	 * The column <code>breakfast.t_bf_set_foods.food_id</code>. 食品Id
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfSetFoodsRecord, java.lang.String> FOOD_ID = createField("food_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "食品Id");

	/**
	 * The column <code>breakfast.t_bf_set_foods.food_count</code>. 食品数量
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfSetFoodsRecord, java.lang.Integer> FOOD_COUNT = createField("food_count", org.jooq.impl.SQLDataType.INTEGER, this, "食品数量");

	/**
	 * Create a <code>breakfast.t_bf_set_foods</code> table reference
	 */
	public TBfSetFoods() {
		this("t_bf_set_foods", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_set_foods</code> table reference
	 */
	public TBfSetFoods(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.TBfSetFoods.tBfSetFoods);
	}

	private TBfSetFoods(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TBfSetFoodsRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBfSetFoods(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TBfSetFoodsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.BREAKFAST, aliased, parameters, "套餐食品");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfSetFoodsRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.KEY_T_BF_SET_FOODS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfSetFoodsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfSetFoodsRecord>>asList(com.breakfast.domain.Keys.KEY_T_BF_SET_FOODS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TBfSetFoods as(java.lang.String alias) {
		return new com.breakfast.domain.tables.TBfSetFoods(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TBfSetFoods rename(java.lang.String name) {
		return new com.breakfast.domain.tables.TBfSetFoods(name, null);
	}
}
