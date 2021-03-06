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
public class TFileRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.TFileRecord> implements org.jooq.Record8<java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = 1523697164;

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
	 * Setter for <code>breakfast.t_bf_file.create_time</code>. 创建时间
	 */
	public void setCreateTime(org.joda.time.DateTime value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.create_time</code>. 创建时间
	 */
	public org.joda.time.DateTime getCreateTime() {
		return (org.joda.time.DateTime) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_file.create_by</code>. 创建人
	 */
	public void setCreateBy(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.create_by</code>. 创建人
	 */
	public java.lang.String getCreateBy() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_file.last_modify_time</code>. 最后修改时间
	 */
	public void setLastModifyTime(org.joda.time.DateTime value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.last_modify_time</code>. 最后修改时间
	 */
	public org.joda.time.DateTime getLastModifyTime() {
		return (org.joda.time.DateTime) getValue(5);
	}

	/**
	 * Setter for <code>breakfast.t_bf_file.last_modify_by</code>. 最后修改人
	 */
	public void setLastModifyBy(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.last_modify_by</code>. 最后修改人
	 */
	public java.lang.String getLastModifyBy() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>breakfast.t_bf_file.opt_time</code>. 操作时间
	 */
	public void setOptTime(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_file.opt_time</code>. 操作时间
	 */
	public java.lang.Long getOptTime() {
		return (java.lang.Long) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.String, org.joda.time.DateTime, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.TFile.File.fileId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.TFile.File.filePath;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.TFile.File.status;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field4() {
		return com.breakfast.domain.tables.TFile.File.createTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.breakfast.domain.tables.TFile.File.createBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field6() {
		return com.breakfast.domain.tables.TFile.File.lastModifyTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.breakfast.domain.tables.TFile.File.lastModifyBy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return com.breakfast.domain.tables.TFile.File.optTime;
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
	public org.joda.time.DateTime value4() {
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
	public org.joda.time.DateTime value6() {
		return getLastModifyTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getLastModifyBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getOptTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFileRecord value1(java.lang.String value) {
		setFileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFileRecord value2(java.lang.String value) {
		setFilePath(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFileRecord value3(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFileRecord value4(org.joda.time.DateTime value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFileRecord value5(java.lang.String value) {
		setCreateBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFileRecord value6(org.joda.time.DateTime value) {
		setLastModifyTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFileRecord value7(java.lang.String value) {
		setLastModifyBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFileRecord value8(java.lang.Long value) {
		setOptTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFileRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, org.joda.time.DateTime value4, java.lang.String value5, org.joda.time.DateTime value6, java.lang.String value7, java.lang.Long value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TFileRecord
	 */
	public TFileRecord() {
		super(com.breakfast.domain.tables.TFile.File);
	}

	/**
	 * Create a detached, initialised TFileRecord
	 */
	public TFileRecord(java.lang.String fileId, java.lang.String filePath, java.lang.String status, org.joda.time.DateTime createTime, java.lang.String createBy, org.joda.time.DateTime lastModifyTime, java.lang.String lastModifyBy, java.lang.Long optTime) {
		super(com.breakfast.domain.tables.TFile.File);

		setValue(0, fileId);
		setValue(1, filePath);
		setValue(2, status);
		setValue(3, createTime);
		setValue(4, createBy);
		setValue(5, lastModifyTime);
		setValue(6, lastModifyBy);
		setValue(7, optTime);
	}
}
