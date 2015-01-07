/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * 用户摄入元素统计表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserElementStatistics implements java.io.Serializable {

	private static final long serialVersionUID = -200019799;

	private String       statisticsId;
	private String       userId;
	private String       elementId;
	private java.math.BigDecimal   quantity;
	private org.joda.time.DateTime statisticsStartTime;
	private org.joda.time.DateTime statisticsEndTime;
	private org.joda.time.DateTime createTime;
	private String       createBy;
	private org.joda.time.DateTime lastModifyTime;
	private String       lastModifyBy;
	private Long         optTime;

	public UserElementStatistics() {}

	public UserElementStatistics(
		String       statisticsId,
		String       userId,
		String       elementId,
		java.math.BigDecimal   quantity,
		org.joda.time.DateTime statisticsStartTime,
		org.joda.time.DateTime statisticsEndTime,
		org.joda.time.DateTime createTime,
		String       createBy,
		org.joda.time.DateTime lastModifyTime,
		String       lastModifyBy,
		Long         optTime
	) {
		this.statisticsId = statisticsId;
		this.userId = userId;
		this.elementId = elementId;
		this.quantity = quantity;
		this.statisticsStartTime = statisticsStartTime;
		this.statisticsEndTime = statisticsEndTime;
		this.createTime = createTime;
		this.createBy = createBy;
		this.lastModifyTime = lastModifyTime;
		this.lastModifyBy = lastModifyBy;
		this.optTime = optTime;
	}

	public String getStatisticsId() {
		return this.statisticsId;
	}

	public void setStatisticsId(String statisticsId) {
		this.statisticsId = statisticsId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getElementId() {
		return this.elementId;
	}

	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	public java.math.BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(java.math.BigDecimal quantity) {
		this.quantity = quantity;
	}

	public org.joda.time.DateTime getStatisticsStartTime() {
		return this.statisticsStartTime;
	}

	public void setStatisticsStartTime(org.joda.time.DateTime statisticsStartTime) {
		this.statisticsStartTime = statisticsStartTime;
	}

	public org.joda.time.DateTime getStatisticsEndTime() {
		return this.statisticsEndTime;
	}

	public void setStatisticsEndTime(org.joda.time.DateTime statisticsEndTime) {
		this.statisticsEndTime = statisticsEndTime;
	}

	public org.joda.time.DateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(org.joda.time.DateTime createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public org.joda.time.DateTime getLastModifyTime() {
		return this.lastModifyTime;
	}

	public void setLastModifyTime(org.joda.time.DateTime lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getLastModifyBy() {
		return this.lastModifyBy;
	}

	public void setLastModifyBy(String lastModifyBy) {
		this.lastModifyBy = lastModifyBy;
	}

	public Long getOptTime() {
		return this.optTime;
	}

	public void setOptTime(Long optTime) {
		this.optTime = optTime;
	}
}