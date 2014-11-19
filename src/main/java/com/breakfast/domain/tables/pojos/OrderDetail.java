/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * 订单详情表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderDetail implements java.io.Serializable {

	private static final long serialVersionUID = 1555281451;

	private java.lang.String  detailId;
	private java.lang.String  orderId;
	private java.lang.String  foodId;
	private java.lang.Integer foodCount;

	public OrderDetail() {}

	public OrderDetail(
		java.lang.String  detailId,
		java.lang.String  orderId,
		java.lang.String  foodId,
		java.lang.Integer foodCount
	) {
		this.detailId = detailId;
		this.orderId = orderId;
		this.foodId = foodId;
		this.foodCount = foodCount;
	}

	public java.lang.String getDetailId() {
		return this.detailId;
	}

	public void setDetailId(java.lang.String detailId) {
		this.detailId = detailId;
	}

	public java.lang.String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(java.lang.String orderId) {
		this.orderId = orderId;
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
}
