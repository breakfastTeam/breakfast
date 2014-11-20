/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 评分详情表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Grade extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.GradeRecord> {

	private static final long serialVersionUID = 2041896117;

	/**
	 * The singleton instance of <code>breakfast.t_bf_grade</code>
	 */
	public static final com.breakfast.domain.tables.Grade Grade = new com.breakfast.domain.tables.Grade();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.GradeRecord> getRecordType() {
		return com.breakfast.domain.tables.records.GradeRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_grade.grade_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.GradeRecord, java.lang.String> gradeId = createField("grade_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_grade.user_id</code>. 评分人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.GradeRecord, java.lang.String> userId = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "评分人");

	/**
	 * The column <code>breakfast.t_bf_grade.target_type</code>. 评分对象类别
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.GradeRecord, java.lang.String> targetType = createField("target_type", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "评分对象类别");

	/**
	 * The column <code>breakfast.t_bf_grade.object_id</code>. 评分对象ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.GradeRecord, java.lang.String> objectId = createField("object_id", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "评分对象ID");

	/**
	 * The column <code>breakfast.t_bf_grade.grade</code>. 评分
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.GradeRecord, java.lang.Integer> grade = createField("grade", org.jooq.impl.SQLDataType.INTEGER, this, "评分");

	/**
	 * The column <code>breakfast.t_bf_grade.create_time</code>. 创建时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.GradeRecord, java.sql.Timestamp> createTime = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

	/**
	 * The column <code>breakfast.t_bf_grade.last_modify_time</code>. 更新时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.GradeRecord, java.sql.Timestamp> lastModifyTime = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

	/**
	 * The column <code>breakfast.t_bf_grade.状态</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.GradeRecord, java.lang.String> 状态 = createField("状态", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * Create a <code>breakfast.t_bf_grade</code> table reference
	 */
	public Grade() {
		this("t_bf_grade", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_grade</code> table reference
	 */
	public Grade(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.Grade.Grade);
	}

	private Grade(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.GradeRecord> aliased) {
		this(alias, aliased, null);
	}

	private Grade(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.GradeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.breakfast, aliased, parameters, "评分详情表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.GradeRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.keyTBfGradePrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.GradeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.GradeRecord>>asList(com.breakfast.domain.Keys.keyTBfGradePrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.Grade as(java.lang.String alias) {
		return new com.breakfast.domain.tables.Grade(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.Grade rename(java.lang.String name) {
		return new com.breakfast.domain.tables.Grade(name, null);
	}
}
