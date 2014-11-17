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
public class TBfFile extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TBfFileRecord> {

	private static final long serialVersionUID = -1735589597;

	/**
	 * The singleton instance of <code>breakfast.t_bf_file</code>
	 */
	public static final com.breakfast.domain.tables.TBfFile tBfFile = new com.breakfast.domain.tables.TBfFile();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.TBfFileRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TBfFileRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_file.file_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfFileRecord, java.lang.String> FILE_ID = createField("file_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_file.file_path</code>. 文件路径
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfFileRecord, java.lang.String> FILE_PATH = createField("file_path", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "文件路径");

	/**
	 * The column <code>breakfast.t_bf_file.status</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfFileRecord, java.lang.String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * The column <code>breakfast.t_bf_file.create_time</code>. 上传日期
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfFileRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "上传日期");

	/**
	 * The column <code>breakfast.t_bf_file.create_by</code>. 上传人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TBfFileRecord, java.lang.String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "上传人");

	/**
	 * Create a <code>breakfast.t_bf_file</code> table reference
	 */
	public TBfFile() {
		this("t_bf_file", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_file</code> table reference
	 */
	public TBfFile(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.TBfFile.tBfFile);
	}

	private TBfFile(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TBfFileRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBfFile(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.TBfFileRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.BREAKFAST, aliased, parameters, "文件表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFileRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.KEY_T_BF_FILE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFileRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFileRecord>>asList(com.breakfast.domain.Keys.KEY_T_BF_FILE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TBfFile as(java.lang.String alias) {
		return new com.breakfast.domain.tables.TBfFile(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TBfFile rename(java.lang.String name) {
		return new com.breakfast.domain.tables.TBfFile(name, null);
	}
}
