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
public class TBfProvider extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TBfProviderRecord> {

	private static final long serialVersionUID = -550924456;

	/**
	 * The singleton instance of <code>breakfast.t_bf_provider</code>
	 */
	public static final com.breakfast.domain.tables.TBfProvider tBfProvider = new com.breakfast.domain.tables.TBfProvider();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.TBfProviderRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TBfProviderRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_provider.provider_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfProviderRecord, java.lang.String> PROVIDER_ID = createField("provider_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>breakfast.t_bf_provider.provider_name</code>. 供应商名称
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfProviderRecord, java.lang.String> PROVIDER_NAME = createField("provider_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "供应商名称");

	/**
	 * The column <code>breakfast.t_bf_provider.phone</code>. 常用电话
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfProviderRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "常用电话");

	/**
	 * The column <code>breakfast.t_bf_provider.alternative_phone</code>. 备用电话
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfProviderRecord, java.lang.String> ALTERNATIVE_PHONE = createField("alternative_phone", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "备用电话");

	/**
	 * The column <code>breakfast.t_bf_provider.address</code>. 地址
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfProviderRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "地址");

	/**
	 * The column <code>breakfast.t_bf_provider.intro</code>. 描述
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfProviderRecord, java.lang.String> INTRO = createField("intro", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "描述");

	/**
	 * The column <code>breakfast.t_bf_provider.status</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfProviderRecord, java.lang.String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * Create a <code>breakfast.t_bf_provider</code> table reference
	 */
	public TBfProvider() {
		this("t_bf_provider", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_provider</code> table reference
	 */
	public TBfProvider(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.TBfProvider.tBfProvider);
	}

	private TBfProvider(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TBfProviderRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBfProvider(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TBfProviderRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.BREAKFAST, aliased, parameters, "供应商");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TBfProvider as(java.lang.String alias) {
		return new com.breakfast.domain.tables.TBfProvider(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TBfProvider rename(java.lang.String name) {
		return new com.breakfast.domain.tables.TBfProvider(name, null);
	}
}
