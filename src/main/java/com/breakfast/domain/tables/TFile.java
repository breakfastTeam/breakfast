/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 文件表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TFile extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TFileRecord> {

	private static final long serialVersionUID = 1025815315;

	/**
	 * The singleton instance of <code>breakfast.t_bf_file</code>
	 */
	public static final com.breakfast.domain.tables.TFile File = new com.breakfast.domain.tables.TFile();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.TFileRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TFileRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_file.file_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFileRecord, java.lang.String> fileId = createField("file_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_file.file_path</code>. 文件路径
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFileRecord, java.lang.String> filePath = createField("file_path", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "文件路径");

	/**
	 * The column <code>breakfast.t_bf_file.status</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFileRecord, java.lang.String> status = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * The column <code>breakfast.t_bf_file.create_time</code>. 创建时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFileRecord, org.joda.time.DateTime> createTime = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_file.create_by</code>. 创建人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFileRecord, java.lang.String> createBy = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "创建人");

	/**
	 * The column <code>breakfast.t_bf_file.last_modify_time</code>. 最后修改时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFileRecord, org.joda.time.DateTime> lastModifyTime = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后修改时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_file.last_modify_by</code>. 最后修改人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFileRecord, java.lang.String> lastModifyBy = createField("last_modify_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "最后修改人");

	/**
	 * The column <code>breakfast.t_bf_file.opt_time</code>. 操作时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TFileRecord, java.lang.Long> optTime = createField("opt_time", org.jooq.impl.SQLDataType.BIGINT, this, "操作时间");

	/**
	 * Create a <code>breakfast.t_bf_file</code> table reference
	 */
	public TFile() {
		this("t_bf_file", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_file</code> table reference
	 */
	public TFile(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.TFile.File);
	}

	private TFile(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TFileRecord> aliased) {
		this(alias, aliased, null);
	}

	private TFile(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TFileRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.breakfast, aliased, parameters, "文件表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.TFileRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.keyTBfFilePrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TFileRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TFileRecord>>asList(com.breakfast.domain.Keys.keyTBfFilePrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TFile as(java.lang.String alias) {
		return new com.breakfast.domain.tables.TFile(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TFile rename(java.lang.String name) {
		return new com.breakfast.domain.tables.TFile(name, null);
	}
}
