/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables;

/**
 * This class is generated by jOOQ.
 *
 * 元素含量表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TElementContent extends org.jooq.impl.TableImpl<com.breakfast.domain.tables.records.TElementContentRecord> {

	private static final long serialVersionUID = -1732538106;

	/**
	 * The singleton instance of <code>breakfast.t_bf_element_content</code>
	 */
	public static final com.breakfast.domain.tables.TElementContent ElementContent = new com.breakfast.domain.tables.TElementContent();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<com.breakfast.domain.tables.records.TElementContentRecord> getRecordType() {
		return com.breakfast.domain.tables.records.TElementContentRecord.class;
	}

	/**
	 * The column <code>breakfast.t_bf_element_content.id</code>.
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, String> id = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>breakfast.t_bf_element_content.element_id</code>. 元素ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, String> elementId = createField("element_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "元素ID");

	/**
	 * The column <code>breakfast.t_bf_element_content.object_id</code>. 对象ID
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, String> objectId = createField("object_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "对象ID");

	/**
	 * The column <code>breakfast.t_bf_element_content.object_type</code>. 对象类型
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, String> objectType = createField("object_type", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "对象类型");

	/**
	 * The column <code>breakfast.t_bf_element_content.quantity</code>. 元素含量
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, java.math.BigDecimal> quantity = createField("quantity", org.jooq.impl.SQLDataType.DECIMAL.precision(4, 3), this, "元素含量");

	/**
	 * The column <code>breakfast.t_bf_element_content.create_time</code>. 创建时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, org.joda.time.DateTime> createTime = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_element_content.create_by</code>. 创建人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, String> createBy = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "创建人");

	/**
	 * The column <code>breakfast.t_bf_element_content.last_modify_time</code>. 最后修改时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, org.joda.time.DateTime> lastModifyTime = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后修改时间", new com.breakfast.provider.DateTimeConverter());

	/**
	 * The column <code>breakfast.t_bf_element_content.last_modify_by</code>. 最后修改人
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, String> lastModifyBy = createField("last_modify_by", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "最后修改人");

	/**
	 * The column <code>breakfast.t_bf_element_content.opt_time</code>. 操作时间
	 */
	public final org.jooq.TableField<com.breakfast.domain.tables.records.TElementContentRecord, Long> optTime = createField("opt_time", org.jooq.impl.SQLDataType.BIGINT, this, "操作时间");

	/**
	 * Create a <code>breakfast.t_bf_element_content</code> table reference
	 */
	public TElementContent() {
		this("t_bf_element_content", null);
	}

	/**
	 * Create an aliased <code>breakfast.t_bf_element_content</code> table reference
	 */
	public TElementContent(String alias) {
		this(alias, com.breakfast.domain.tables.TElementContent.ElementContent);
	}

	private TElementContent(String alias, org.jooq.Table<com.breakfast.domain.tables.records.TElementContentRecord> aliased) {
		this(alias, aliased, null);
	}

	private TElementContent(String alias, org.jooq.Table<com.breakfast.domain.tables.records.TElementContentRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.breakfast.domain.Breakfast.breakfast, aliased, parameters, "元素含量表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.breakfast.domain.tables.records.TElementContentRecord> getPrimaryKey() {
		return com.breakfast.domain.Keys.keyTBfElementContentPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TElementContentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.breakfast.domain.tables.records.TElementContentRecord>>asList(com.breakfast.domain.Keys.keyTBfElementContentPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.breakfast.domain.tables.TElementContent as(String alias) {
		return new com.breakfast.domain.tables.TElementContent(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.breakfast.domain.tables.TElementContent rename(String name) {
		return new com.breakfast.domain.tables.TElementContent(name, null);
	}
}