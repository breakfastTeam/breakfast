/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 用户定制详情
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomOrderDetail extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.CustomOrderDetailRecord> {

	private static final long serialVersionUID = -467544592;

	/**
	 * The singleton instance of <code>breakfast.t_bf_custom_order_detail</code>
	 */
	public static final com.breakfast.domain.tables.CustomOrderDetail CustomOrderDetail = new com.breakfast.domain.tables.CustomOrderDetail();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.CustomOrderDetailRecord> getRecordType() {
		return com.breakfast.domain.tables.records.CustomOrderDetailRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_custom_order_detail.detail_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.CustomOrderDetailRecord, java.lang.String> detailId = createField("detail_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_custom_order_detail.food_custom_id</code>. 定制表ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.CustomOrderDetailRecord, java.lang.String> foodCustomId = createField("food_custom_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "定制表ID");

	/**
	 * The column <code>breakfast.t_bf_custom_order_detail.food_id</code>. 食品数量
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.CustomOrderDetailRecord, java.lang.String> foodId = createField("food_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "食品数量");

	/**
	 * The column <code>breakfast.t_bf_custom_order_detail.food_count</code>. 食品数量
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.CustomOrderDetailRecord, java.lang.Integer> foodCount = createField("food_count", org.jooq.impl.SQLDataType.INTEGER, this, "食品数量");

	/**
	 * Create a <code>breakfast.t_bf_custom_order_detail</code> table reference
	 */
	public CustomOrderDetail() {
		this("t_bf_custom_order_detail", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_custom_order_detail</code> table reference
	 */
	public CustomOrderDetail(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.CustomOrderDetail.CustomOrderDetail);
	}

	private CustomOrderDetail(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.CustomOrderDetailRecord> aliased) {
		this(alias, aliased, null);
	}

	private CustomOrderDetail(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.CustomOrderDetailRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.breakfast, aliased, parameters, "用户定制详情");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.CustomOrderDetailRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.keyTBfCustomOrderDetailPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.CustomOrderDetailRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.CustomOrderDetailRecord>>asList(com.breakfast.domain.Keys.keyTBfCustomOrderDetailPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.CustomOrderDetail as(java.lang.String alias) {
		return new com.breakfast.domain.tables.CustomOrderDetail(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.CustomOrderDetail rename(java.lang.String name) {
		return new com.breakfast.domain.tables.CustomOrderDetail(name, null);
	}
}
