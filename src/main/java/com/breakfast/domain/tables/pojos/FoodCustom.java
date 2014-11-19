/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * 用户定制表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoodCustom implements java.io.Serializable {

	private static final long serialVersionUID = 1126581948;

	private java.lang.String     foodCustomId;
	private java.lang.String     customOrderName;
	private java.lang.String     customerId;
	private java.lang.String     foodId;
	private java.lang.Integer    foodCount;
	private java.math.BigDecimal price;
	private java.sql.Timestamp   createTime;
	private java.lang.String     status;

	public FoodCustom() {}

	public FoodCustom(
		java.lang.String     foodCustomId,
		java.lang.String     customOrderName,
		java.lang.String     customerId,
		java.lang.String     foodId,
		java.lang.Integer    foodCount,
		java.math.BigDecimal price,
		java.sql.Timestamp   createTime,
		java.lang.String     status
	) {
		this.foodCustomId = foodCustomId;
		this.customOrderName = customOrderName;
		this.customerId = customerId;
		this.foodId = foodId;
		this.foodCount = foodCount;
		this.price = price;
		this.createTime = createTime;
		this.status = status;
	}

	public java.lang.String getFoodCustomId() {
		return this.foodCustomId;
	}

	public void setFoodCustomId(java.lang.String foodCustomId) {
		this.foodCustomId = foodCustomId;
	}

	public java.lang.String getCustomOrderName() {
		return this.customOrderName;
	}

	public void setCustomOrderName(java.lang.String customOrderName) {
		this.customOrderName = customOrderName;
	}

	public java.lang.String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(java.lang.String customerId) {
		this.customerId = customerId;
	}

	public java.lang.String getFoodId() {
		return this.foodId;
	}

	public void setFoodId(java.lang.String foodId) {
		this.foodId = foodId;
	}

	public java.lang.Integer getFoodCount() {
		return this.foodCount;
	}

	public void setFoodCount(java.lang.Integer foodCount) {
		this.foodCount = foodCount;
	}

	public java.math.BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(java.math.BigDecimal price) {
		this.price = price;
	}

	public java.sql.Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}
}
