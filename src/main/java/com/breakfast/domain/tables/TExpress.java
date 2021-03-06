/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 订单配送表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExpress extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TExpressRecord> {

	private static final long serialVersionUID = 1484599403;

	/**
	 * The singleton instance of <code>breakfast.t_bf_express</code>
	 */
	public static final com.breakfast.domain.tables.TExpress Express = new com.breakfast.domain.tables.TExpress();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.TExpressRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TExpressRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_express.express_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, java.lang.String> expressId = createField("express_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_express.order_id</code>. 订单ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, java.lang.String> orderId = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "订单ID");

	/**
	 * The column <code>breakfast.t_bf_express.courier_id</code>. 快递员ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, java.lang.String> courierId = createField("courier_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "快递员ID");

	/**
	 * The column <code>breakfast.t_bf_express.start_time</code>. 起送时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, org.joda.time.DateTime> startTime = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "起送时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_express.finish_time</code>. 送达时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, org.joda.time.DateTime> finishTime = createField("finish_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "送达时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_express.longitude</code>. 经度
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, java.lang.String> longitude = createField("longitude", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "经度");

	/**
	 * The column <code>breakfast.t_bf_express.latitude</code>. 纬度
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, java.lang.String> latitude = createField("latitude", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "纬度");

	/**
	 * The column <code>breakfast.t_bf_express.status</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, java.lang.String> status = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * The column <code>breakfast.t_bf_express.create_time</code>. 创建时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, org.joda.time.DateTime> createTime = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_express.create_by</code>. 创建人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, java.lang.String> createBy = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "创建人");

	/**
	 * The column <code>breakfast.t_bf_express.last_modify_time</code>. 最后修改时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, org.joda.time.DateTime> lastModifyTime = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后修改时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_express.last_modify_by</code>. 最后修改人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, java.lang.String> lastModifyBy = createField("last_modify_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "最后修改人");

	/**
	 * The column <code>breakfast.t_bf_express.opt_time</code>. 操作时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TExpressRecord, java.lang.Long> optTime = createField("opt_time", org.jooq.impl.SQLDataType.BIGINT, this, "操作时间");

	/**
	 * Create a <code>breakfast.t_bf_express</code> table reference
	 */
	public TExpress() {
		this("t_bf_express", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_express</code> table reference
	 */
	public TExpress(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.TExpress.Express);
	}

	private TExpress(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TExpressRecord> aliased) {
		this(alias, aliased, null);
	}

	private TExpress(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TExpressRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.breakfast, aliased, parameters, "订单配送表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.TExpressRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.keyTBfExpressPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TExpressRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TExpressRecord>>asList(com.breakfast.domain.Keys.keyTBfExpressPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TExpress as(java.lang.String alias) {
		return new com.breakfast.domain.tables.TExpress(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TExpress rename(java.lang.String name) {
		return new com.breakfast.domain.tables.TExpress(name, null);
	}
}
