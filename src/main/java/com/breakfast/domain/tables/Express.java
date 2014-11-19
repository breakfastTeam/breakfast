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
public class Express extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.ExpressRecord> {

	private static final long serialVersionUID = -916061286;

	/**
	 * The singleton instance of <code>breakfast.express</code>
	 */
	public static final com.breakfast.domain.tables.Express Express = new com.breakfast.domain.tables.Express();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.ExpressRecord> getRecordType() {
		return com.breakfast.domain.tables.records.ExpressRecord.class;
	}

	/**
	 * The column <code>breakfast.express.express_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.ExpressRecord, java.lang.String> EXPRESS_ID = createField("express_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.express.订单ID</code>. 订单ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.ExpressRecord, java.lang.String> 订单ID = createField("订单ID", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "订单ID");

	/**
	 * The column <code>breakfast.express.courier_id</code>. 快递员ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.ExpressRecord, java.lang.String> COURIER_ID = createField("courier_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "快递员ID");

	/**
	 * The column <code>breakfast.express.start_time</code>. 起送时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.ExpressRecord, java.sql.Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "起送时间");

	/**
	 * The column <code>breakfast.express.finish_time</code>. 送达时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.ExpressRecord, java.sql.Timestamp> FINISH_TIME = createField("finish_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "送达时间");

	/**
	 * The column <code>breakfast.express.longitude</code>. 经度
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.ExpressRecord, java.lang.String> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "经度");

	/**
	 * The column <code>breakfast.express.latitude</code>. 纬度
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.ExpressRecord, java.lang.String> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "纬度");

	/**
	 * The column <code>breakfast.express.status</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.ExpressRecord, java.lang.String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * Create a <code>breakfast.express</code> table reference
	 */
	public Express() {
		this("express", null);
	}

	/**
	 * Create an aliased <code>breakfast.express</code> table reference
	 */
	public Express(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.Express.Express);
	}

	private Express(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.ExpressRecord> aliased) {
		this(alias, aliased, null);
	}

	private Express(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.ExpressRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.BREAKFAST, aliased, parameters, "订单配送表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.ExpressRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.KEY_EXPRESS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.ExpressRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.ExpressRecord>>asList(com.breakfast.domain.Keys.KEY_EXPRESS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.Express as(java.lang.String alias) {
		return new com.breakfast.domain.tables.Express(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.Express rename(java.lang.String name) {
		return new com.breakfast.domain.tables.Express(name, null);
	}
}
