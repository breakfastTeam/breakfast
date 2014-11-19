/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 人员表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.UserRecord> {

	private static final long serialVersionUID = -1672384209;

	/**
	 * The singleton instance of <code>breakfast.user</code>
	 */
	public static final com.breakfast.domain.tables.User User = new com.breakfast.domain.tables.User();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.UserRecord> getRecordType() {
		return com.breakfast.domain.tables.records.UserRecord.class;
	}

	/**
	 * The column <code>breakfast.user.user_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.lang.String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.user.login_name</code>. 用户名
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.lang.String> LOGIN_NAME = createField("login_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "用户名");

	/**
	 * The column <code>breakfast.user.password</code>. 密码
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "密码");

	/**
	 * The column <code>breakfast.user.status</code>. 状态
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.lang.String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "状态");

	/**
	 * The column <code>breakfast.user.user_name</code>. 姓名
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.lang.String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "姓名");

	/**
	 * The column <code>breakfast.user.mobile</code>. 手机号
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.lang.String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "手机号");

	/**
	 * The column <code>breakfast.user.weixin</code>. 微信号
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.lang.String> WEIXIN = createField("weixin", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "微信号");

	/**
	 * The column <code>breakfast.user.qq</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.lang.String> QQ = createField("qq", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>breakfast.user.create_time</code>. 注册日期
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "注册日期");

	/**
	 * The column <code>breakfast.user.create_way</code>. 注册方式
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserRecord, java.lang.String> CREATE_WAY = createField("create_way", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "注册方式");

	/**
	 * Create a <code>breakfast.user</code> table reference
	 */
	public User() {
		this("user", null);
	}

	/**
	 * Create an aliased <code>breakfast.user</code> table reference
	 */
	public User(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.User.User);
	}

	private User(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.UserRecord> aliased) {
		this(alias, aliased, null);
	}

	private User(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.UserRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.BREAKFAST, aliased, parameters, "人员表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.UserRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.KEY_USER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.UserRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.UserRecord>>asList(com.breakfast.domain.Keys.KEY_USER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.User as(java.lang.String alias) {
		return new com.breakfast.domain.tables.User(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.User rename(java.lang.String name) {
		return new com.breakfast.domain.tables.User(name, null);
	}
}
