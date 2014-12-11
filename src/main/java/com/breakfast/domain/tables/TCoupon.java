/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 代金券表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCoupon extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TCouponRecord> {

	private static final long serialVersionUID = 946960126;

	/**
	 * The singleton instance of <code>breakfast.t_bf_coupon</code>
	 */
	public static final com.breakfast.domain.tables.TCoupon Coupon = new com.breakfast.domain.tables.TCoupon();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.TCouponRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TCouponRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_coupon.coupon_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, java.lang.String> couponId = createField("coupon_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_coupon.user_id</code>. 发放对象ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, java.lang.String> userId = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发放对象ID");

	/**
	 * The column <code>breakfast.t_bf_coupon.start_time</code>. 发放时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, org.joda.time.DateTime> startTime = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "发放时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_coupon.end_time</code>. 截止日期
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, org.joda.time.DateTime> endTime = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "截止日期", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_coupon.price</code>. 价值
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, java.math.BigDecimal> price = createField("price", org.jooq.impl.SQLDataType.DECIMAL.precision(8, 3), this, "价值");

	/**
	 * The column <code>breakfast.t_bf_coupon.source</code>. 发放人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, java.lang.String> source = createField("source", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发放人");

	/**
	 * The column <code>breakfast.t_bf_coupon.status</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, java.lang.String> status = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * The column <code>breakfast.t_bf_coupon.brief_intro</code>. 简介
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, java.lang.String> briefIntro = createField("brief_intro", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "简介");

	/**
	 * The column <code>breakfast.t_bf_coupon.create_time</code>. 创建时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, org.joda.time.DateTime> createTime = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_coupon.create_by</code>. 创建人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, java.lang.String> createBy = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "创建人");

	/**
	 * The column <code>breakfast.t_bf_coupon.last_modify_time</code>. 最后修改时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, org.joda.time.DateTime> lastModifyTime = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后修改时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_coupon.last_modify_by</code>. 最后修改人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, java.lang.String> lastModifyBy = createField("last_modify_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "最后修改人");

	/**
	 * The column <code>breakfast.t_bf_coupon.opt_time</code>. 操作时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TCouponRecord, java.lang.Long> optTime = createField("opt_time", org.jooq.impl.SQLDataType.BIGINT, this, "操作时间");

	/**
	 * Create a <code>breakfast.t_bf_coupon</code> table reference
	 */
	public TCoupon() {
		this("t_bf_coupon", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_coupon</code> table reference
	 */
	public TCoupon(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.TCoupon.Coupon);
	}

	private TCoupon(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TCouponRecord> aliased) {
		this(alias, aliased, null);
	}

	private TCoupon(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TCouponRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.breakfast, aliased, parameters, "代金券表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.TCouponRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.keyTBfCouponPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TCouponRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TCouponRecord>>asList(com.breakfast.domain.Keys.keyTBfCouponPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TCoupon as(java.lang.String alias) {
		return new com.breakfast.domain.tables.TCoupon(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TCoupon rename(java.lang.String name) {
		return new com.breakfast.domain.tables.TCoupon(name, null);
	}
}