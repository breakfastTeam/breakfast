/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 评价反馈表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Feedback extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.FeedbackRecord> {

	private static final long serialVersionUID = 374540496;

	/**
	 * The singleton instance of <code>breakfast.feedback</code>
	 */
	public static final com.breakfast.domain.tables.Feedback Feedback = new com.breakfast.domain.tables.Feedback();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.FeedbackRecord> getRecordType() {
		return com.breakfast.domain.tables.records.FeedbackRecord.class;
	}

	/**
	 * The column <code>breakfast.feedback.feedback_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.FeedbackRecord, java.lang.String> FEEDBACK_ID = createField("feedback_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.feedback.user_id</code>. 反馈人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.FeedbackRecord, java.lang.String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "反馈人");

	/**
	 * The column <code>breakfast.feedback.target_type</code>. 反馈对象类别
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.FeedbackRecord, java.lang.String> TARGET_TYPE = createField("target_type", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "反馈对象类别");

	/**
	 * The column <code>breakfast.feedback.object_id</code>. 反馈对象ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.FeedbackRecord, java.lang.String> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "反馈对象ID");

	/**
	 * The column <code>breakfast.feedback.content</code>. 反馈内容
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.FeedbackRecord, java.lang.String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "反馈内容");

	/**
	 * The column <code>breakfast.feedback.create_time</code>. 创建时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.FeedbackRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

	/**
	 * The column <code>breakfast.feedback.last_modify_time</code>. 更新时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.FeedbackRecord, java.sql.Timestamp> LAST_MODIFY_TIME = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

	/**
	 * The column <code>breakfast.feedback.状态</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.FeedbackRecord, java.lang.String> 状态 = createField("状态", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * Create a <code>breakfast.feedback</code> table reference
	 */
	public Feedback() {
		this("feedback", null);
	}

	/**
	 * Create an aliased <code>breakfast.feedback</code> table reference
	 */
	public Feedback(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.Feedback.Feedback);
	}

	private Feedback(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.FeedbackRecord> aliased) {
		this(alias, aliased, null);
	}

	private Feedback(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.FeedbackRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.BREAKFAST, aliased, parameters, "评价反馈表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.FeedbackRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.KEY_FEEDBACK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.FeedbackRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.FeedbackRecord>>asList(com.breakfast.domain.Keys.KEY_FEEDBACK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.Feedback as(java.lang.String alias) {
		return new com.breakfast.domain.tables.Feedback(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.Feedback rename(java.lang.String name) {
		return new com.breakfast.domain.tables.Feedback(name, null);
	}
}
