/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 供应商
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProvider extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TProviderRecord> {

	private static final long serialVersionUID = 616947341;

	/**
	 * The singleton instance of <code>breakfast.t_bf_provider</code>
	 */
	public static final com.breakfast.domain.tables.TProvider Provider = new com.breakfast.domain.tables.TProvider();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.TProviderRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TProviderRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_provider.provider_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.String> providerId = createField("provider_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_provider.provider_name</code>. 供应商名称
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.String> providerName = createField("provider_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "供应商名称");

	/**
	 * The column <code>breakfast.t_bf_provider.phone</code>. 常用电话
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.String> phone = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "常用电话");

	/**
	 * The column <code>breakfast.t_bf_provider.alternative_phone</code>. 备用电话
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.String> alternativePhone = createField("alternative_phone", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "备用电话");

	/**
	 * The column <code>breakfast.t_bf_provider.address</code>. 地址
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.String> address = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "地址");

	/**
	 * The column <code>breakfast.t_bf_provider.intro</code>. 描述
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.String> intro = createField("intro", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "描述");

	/**
	 * The column <code>breakfast.t_bf_provider.status</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.String> status = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * The column <code>breakfast.t_bf_provider.create_time</code>. 创建时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, org.joda.time.DateTime> createTime = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_provider.create_by</code>. 创建人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.String> createBy = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "创建人");

	/**
	 * The column <code>breakfast.t_bf_provider.last_modify_time</code>. 最后修改时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, org.joda.time.DateTime> lastModifyTime = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后修改时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_provider.last_modify_by</code>. 最后修改人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.String> lastModifyBy = createField("last_modify_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "最后修改人");

	/**
	 * The column <code>breakfast.t_bf_provider.opt_time</code>. 操作时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TProviderRecord, java.lang.Integer> optTime = createField("opt_time", org.jooq.impl.SQLDataType.INTEGER, this, "操作时间");

	/**
	 * Create a <code>breakfast.t_bf_provider</code> table reference
	 */
	public TProvider() {
		this("t_bf_provider", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_provider</code> table reference
	 */
	public TProvider(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.TProvider.Provider);
	}

	private TProvider(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TProviderRecord> aliased) {
		this(alias, aliased, null);
	}

	private TProvider(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TProviderRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.breakfast, aliased, parameters, "供应商");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.TProviderRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.keyTBfProviderPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TProviderRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TProviderRecord>>asList(com.breakfast.domain.Keys.keyTBfProviderPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TProvider as(java.lang.String alias) {
		return new com.breakfast.domain.tables.TProvider(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TProvider rename(java.lang.String name) {
		return new com.breakfast.domain.tables.TProvider(name, null);
	}
}
