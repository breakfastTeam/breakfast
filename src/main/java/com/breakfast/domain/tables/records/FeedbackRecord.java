/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 评价反馈表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FeedbackRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.FeedbackRecord> implements org.jooq.Record8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = 495032188;

	/**
	 * Setter for <code>breakfast.t_bf_feedback.feedback_id</code>.
	 */
	public void setFeedbackId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_feedback.feedback_id</code>.
	 */
	public java.lang.String getFeedbackId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_feedback.user_id</code>. 反馈人
	 */
	public void setUserId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_feedback.user_id</code>. 反馈人
	 */
	public java.lang.String getUserId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_feedback.target_type</code>. 反馈对象类别
	 */
	public void setTargetType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_feedback.target_type</code>. 反馈对象类别
	 */
	public java.lang.String getTargetType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_feedback.object_id</code>. 反馈对象ID
	 */
	public void setObjectId(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_feedback.object_id</code>. 反馈对象ID
	 */
	public java.lang.String getObjectId() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>breakfast.t_bf_feedback.content</code>. 反馈内容
	 */
	public void setContent(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_feedback.content</code>. 反馈内容
	 */
	public java.lang.String getContent() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>breakfast.t_bf_feedback.create_time</code>. 创建时间
	 */
	public void setCreateTime(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_feedback.create_time</code>. 创建时间
	 */
	public java.sql.Timestamp getCreateTime() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>breakfast.t_bf_feedback.last_modify_time</code>. 更新时间
	 */
	public void setLastModifyTime(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_feedback.last_modify_time</code>. 更新时间
	 */
	public java.sql.Timestamp getLastModifyTime() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>breakfast.t_bf_feedback.状态</code>. 状态
	 */
	public void set状态(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_feedback.状态</code>. 状态
	 */
	public java.lang.String get状态() {
		return (java.lang.String) getValue(7);
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
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.Feedback.Feedback.feedbackId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.Feedback.Feedback.userId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.Feedback.Feedback.targetType;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.breakfast.domain.tables.Feedback.Feedback.objectId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.breakfast.domain.tables.Feedback.Feedback.content;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return com.breakfast.domain.tables.Feedback.Feedback.createTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return com.breakfast.domain.tables.Feedback.Feedback.lastModifyTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.breakfast.domain.tables.Feedback.Feedback.状态;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getFeedbackId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTargetType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getObjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getLastModifyTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return get状态();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FeedbackRecord value1(java.lang.String value) {
		setFeedbackId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FeedbackRecord value2(java.lang.String value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FeedbackRecord value3(java.lang.String value) {
		setTargetType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FeedbackRecord value4(java.lang.String value) {
		setObjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FeedbackRecord value5(java.lang.String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FeedbackRecord value6(java.sql.Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FeedbackRecord value7(java.sql.Timestamp value) {
		setLastModifyTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FeedbackRecord value8(java.lang.String value) {
		set状态(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FeedbackRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.sql.Timestamp value6, java.sql.Timestamp value7, java.lang.String value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FeedbackRecord
	 */
	public FeedbackRecord() {
		super(com.breakfast.domain.tables.Feedback.Feedback);
	}

	/**
	 * Create a detached, initialised FeedbackRecord
	 */
	public FeedbackRecord(java.lang.String feedbackId, java.lang.String userId, java.lang.String targetType, java.lang.String objectId, java.lang.String content, java.sql.Timestamp createTime, java.sql.Timestamp lastModifyTime, java.lang.String 状态) {
		super(com.breakfast.domain.tables.Feedback.Feedback);

		setValue(0, feedbackId);
		setValue(1, userId);
		setValue(2, targetType);
		setValue(3, objectId);
		setValue(4, content);
		setValue(5, createTime);
		setValue(6, lastModifyTime);
		setValue(7, 状态);
	}
}
