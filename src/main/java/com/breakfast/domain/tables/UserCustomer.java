/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 用户详情
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCustomer extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.UserCustomerRecord> {

	private static final long serialVersionUID = 227210000;

	/**
	 * The singleton instance of <code>breakfast.user_customer</code>
	 */
	public static final com.breakfast.domain.tables.UserCustomer UserCustomer = new com.breakfast.domain.tables.UserCustomer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.breakfast.domain.tables.records.UserCustomerRecord> getRecordType() {
		return com.breakfast.domain.tables.records.UserCustomerRecord.class;
	}

	/**
	 * The column <code>breakfast.user_customer.user_id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserCustomerRecord, java.lang.String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.user_customer.customer_level</code>. 客户等级
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserCustomerRecord, java.lang.String> CUSTOMER_LEVEL = createField("customer_level", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "客户等级");

	/**
	 * The column <code>breakfast.user_customer.credits</code>. 小黄豆数量
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserCustomerRecord, java.lang.Integer> CREDITS = createField("credits", org.jooq.impl.SQLDataType.INTEGER, this, "小黄豆数量");

	/**
	 * The column <code>breakfast.user_customer.referrer</code>. 推荐人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserCustomerRecord, java.lang.String> REFERRER = createField("referrer", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "推荐人");

	/**
	 * The column <code>breakfast.user_customer.recommend_time</code>. 推荐时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserCustomerRecord, java.sql.Timestamp> RECOMMEND_TIME = createField("recommend_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "推荐时间");

	/**
	 * The column <code>breakfast.user_customer.address1</code>. 常用地址1
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserCustomerRecord, java.lang.String> ADDRESS1 = createField("address1", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "常用地址1");

	/**
	 * The column <code>breakfast.user_customer.address2</code>. 常用地址2
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserCustomerRecord, java.lang.String> ADDRESS2 = createField("address2", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "常用地址2");

	/**
	 * The column <code>breakfast.user_customer.address3</code>. 常用地址3
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.UserCustomerRecord, java.lang.String> ADDRESS3 = createField("address3", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "常用地址3");

	/**
	 * Create a <code>breakfast.user_customer</code> table reference
	 */
	public UserCustomer() {
		this("user_customer", null);
	}

	/**
	 * Create an aliased <code>breakfast.user_customer</code> table reference
	 */
	public UserCustomer(java.lang.String alias) {
		this(alias, com.breakfast.domain.tables.UserCustomer.UserCustomer);
	}

	private UserCustomer(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.UserCustomerRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserCustomer(java.lang.String alias, org.jooq.Table<com.breakfast.domain.tables.records.UserCustomerRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.BREAKFAST, aliased, parameters, "用户详情");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.UserCustomerRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.KEY_USER_CUSTOMER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.UserCustomerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.UserCustomerRecord>>asList(com.breakfast.domain.Keys.KEY_USER_CUSTOMER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.UserCustomer as(java.lang.String alias) {
		return new com.breakfast.domain.tables.UserCustomer(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.UserCustomer rename(java.lang.String name) {
		return new com.breakfast.domain.tables.UserCustomer(name, null);
	}
}
