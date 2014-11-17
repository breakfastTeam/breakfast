/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 文件表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBfFileRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.TBfFileRecord> implements org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = 1664659918;

	/**
	 * Setter for <code>breakfast.t_bf_file.file_id</code>.
	 */
	public void setFileId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.file_id</code>.
	 */
	public java.lang.String getFileId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_file.file_path</code>. 文件路径
	 */
	public void setFilePath(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.file_path</code>. 文件路径
	 */
	public java.lang.String getFilePath() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_file.status</code>. 状态
	 */
	public void setStatus(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.status</code>. 状态
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_file.create_time</code>. 上传日期
	 */
	public void setCreateTime(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.create_time</code>. 上传日期
	 */
	public java.sql.Timestamp getCreateTime() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_file.create_by</code>. 上传人
	 */
	public void setCreateBy(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.create_by</code>. 上传人
	 */
	public java.lang.String getCreateBy() {
		return (java.lang.String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.TBfFile.tBfFile.FILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.TBfFile.tBfFile.FILE_PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.TBfFile.tBfFile.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return com.breakfast.domain.tables.TBfFile.tBfFile.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.breakfast.domain.tables.TBfFile.tBfFile.CREATE_BY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getFileId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFilePath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getCreateBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfFileRecord value1(java.lang.String value) {
		setFileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfFileRecord value2(java.lang.String value) {
		setFilePath(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfFileRecord value3(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfFileRecord value4(java.sql.Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfFileRecord value5(java.lang.String value) {
		setCreateBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBfFileRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.sql.Timestamp value4, java.lang.String value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBfFileRecord
	 */
	public TBfFileRecord() {
		super(com.breakfast.domain.tables.TBfFile.tBfFile);
	}

	/**
	 * Create a detached, initialised TBfFileRecord
	 */
	public TBfFileRecord(java.lang.String fileId, java.lang.String filePath, java.lang.String status, java.sql.Timestamp createTime, java.lang.String createBy) {
		super(com.breakfast.domain.tables.TBfFile.tBfFile);

		setValue(0, fileId);
		setValue(1, filePath);
		setValue(2, status);
		setValue(3, createTime);
		setValue(4, createBy);
	}
}
