/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 地址表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AddressRecord extends org.jooq.impl.UpdatableRecordImpl<com.breakfast.domain.tables.records.AddressRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 2037516892;

	/**
	 * Setter for <code>breakfast.t_bf_address.adddress_id</code>.
	 */
	public void setAdddressId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_address.adddress_id</code>.
	 */
	public java.lang.String getAdddressId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>breakfast.t_bf_address.address_name</code>. 地址名
	 */
	public void setAddressName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_address.address_name</code>. 地址名
	 */
	public java.lang.String getAddressName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>breakfast.t_bf_address.address</code>. 地址详情
	 */
	public void setAddress(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_address.address</code>. 地址详情
	 */
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>breakfast.t_bf_address.status</code>. 状态
	 */
	public void setStatus(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>breakfast.t_bf_address.status</code>. 状态
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.breakfast.domain.tables.Address.Address.adddressId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.breakfast.domain.tables.Address.Address.addressName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.breakfast.domain.tables.Address.Address.address;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.breakfast.domain.tables.Address.Address.status;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAdddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAddressName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value1(java.lang.String value) {
		setAdddressId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value2(java.lang.String value) {
		setAddressName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value3(java.lang.String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value4(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AddressRecord
	 */
	public AddressRecord() {
		super(com.breakfast.domain.tables.Address.Address);
	}

	/**
	 * Create a detached, initialised AddressRecord
	 */
	public AddressRecord(java.lang.String adddressId, java.lang.String addressName, java.lang.String address, java.lang.String status) {
		super(com.breakfast.domain.tables.Address.Address);

		setValue(0, adddressId);
		setValue(1, addressName);
		setValue(2, address);
		setValue(3, status);
	}
}
