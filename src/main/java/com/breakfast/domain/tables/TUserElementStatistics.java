/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 用户摄入元素统计表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUserElementStatistics extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TUserElementStatisticsRecord> {

	private static final long serialVersionUID = -197086554;

	/**
	 * The singleton instance of <code>breakfast.t_bf_user_element_statistics</code>
	 */
	public static final com.breakfast.domain.tables.TUserElementStatistics UserElementStatistics = new com.breakfast.domain.tables.TUserElementStatistics();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<com.breakfast.domain.tables.records.TUserElementStatisticsRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TUserElementStatisticsRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_user_element_statistics.statistics_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TUserElementStatisticsRecord, String> statisticsId = createField("statistics_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_user_element_statistics.user_id</code>. user_id
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TUserElementStatisticsRecord, String> userId = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "user_id");

	/**
	 * The column <code>breakfast.t_bf_user_element_statistics.element_id</code>. 元素ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TUserElementStatisticsRecord, String> elementId = createField("element_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "元素ID");

	/**
	 * The column <code>breakfast.t_bf_user_element_statistics.quantity</code>. 元素摄入
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TUserElementStatisticsRecord, java.math.BigDecimal> quantity = createField("quantity", org.jooq.impl.SQLDataType.DECIMAL.precision(4, 3), this, "元素摄入");

	/**
	 * The column <code>breakfast.t_bf_user_element_statistics.create_time</code>. 创建时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TUserElementStatisticsRecord, org.joda.time.DateTime> createTime = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_user_element_statistics.create_by</code>. 创建人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TUserElementStatisticsRecord, String> createBy = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "创建人");

	/**
	 * The column <code>breakfast.t_bf_user_element_statistics.last_modify_time</code>. 最后修改时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TUserElementStatisticsRecord, org.joda.time.DateTime> lastModifyTime = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后修改时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_user_element_statistics.last_modify_by</code>. 最后修改人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TUserElementStatisticsRecord, String> lastModifyBy = createField("last_modify_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "最后修改人");

	/**
	 * The column <code>breakfast.t_bf_user_element_statistics.opt_time</code>. 操作时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TUserElementStatisticsRecord, Long> optTime = createField("opt_time", org.jooq.impl.SQLDataType.BIGINT, this, "操作时间");

	/**
	 * Create a <code>breakfast.t_bf_user_element_statistics</code> table reference
	 */
	public TUserElementStatistics() {
		this("t_bf_user_element_statistics", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_user_element_statistics</code> table reference
	 */
	public TUserElementStatistics(String alias) {
		this(alias, com.breakfast.domain.tables.TUserElementStatistics.UserElementStatistics);
	}

	private TUserElementStatistics(String alias, org.jooq.Table<com.breakfast.domain.tables.records.TUserElementStatisticsRecord> aliased) {
		this(alias, aliased, null);
	}

	private TUserElementStatistics(String alias, org.jooq.Table<com.breakfast.domain.tables.records.TUserElementStatisticsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.breakfast, aliased, parameters, "用户摄入元素统计表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.TUserElementStatisticsRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.keyTBfUserElementStatisticsPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TUserElementStatisticsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TUserElementStatisticsRecord>>asList(com.breakfast.domain.Keys.keyTBfUserElementStatisticsPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TUserElementStatistics as(String alias) {
		return new com.breakfast.domain.tables.TUserElementStatistics(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TUserElementStatistics rename(String name) {
		return new com.breakfast.domain.tables.TUserElementStatistics(name, null);
	}
}
