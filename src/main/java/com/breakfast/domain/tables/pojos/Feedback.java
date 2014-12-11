/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * 评价反馈表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Feedback implements java.io.Serializable {

	private static final long serialVersionUID = 1803850789;

	private java.lang.String       feedbackId;
	private java.lang.String       userId;
	private java.lang.String       targetType;
	private java.lang.String       targetId;
	private java.lang.String       content;
	private java.lang.String       status;
	private org.joda.time.DateTime createTime;
	private java.lang.String       createBy;
	private org.joda.time.DateTime lastModifyTime;
	private java.lang.String       lastModifyBy;
	private java.lang.Long         optTime;

	public Feedback() {}

	public Feedback(
		java.lang.String       feedbackId,
		java.lang.String       userId,
		java.lang.String       targetType,
		java.lang.String       targetId,
		java.lang.String       content,
		java.lang.String       status,
		org.joda.time.DateTime createTime,
		java.lang.String       createBy,
		org.joda.time.DateTime lastModifyTime,
		java.lang.String       lastModifyBy,
		java.lang.Long         optTime
	) {
		this.feedbackId = feedbackId;
		this.userId = userId;
		this.targetType = targetType;
		this.targetId = targetId;
		this.content = content;
		this.status = status;
		this.createTime = createTime;
		this.createBy = createBy;
		this.lastModifyTime = lastModifyTime;
		this.lastModifyBy = lastModifyBy;
		this.optTime = optTime;
	}

	public java.lang.String getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(java.lang.String feedbackId) {
		this.feedbackId = feedbackId;
	}

	public java.lang.String getUserId() {
		return this.userId;
	}

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}

	public java.lang.String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(java.lang.String targetType) {
		this.targetType = targetType;
	}

	public java.lang.String getTargetId() {
		return this.targetId;
	}

	public void setTargetId(java.lang.String targetId) {
		this.targetId = targetId;
	}

	public java.lang.String getContent() {
		return this.content;
	}

	public void setContent(java.lang.String content) {
		this.content = content;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public org.joda.time.DateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(org.joda.time.DateTime createTime) {
		this.createTime = createTime;
	}

	public java.lang.String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(java.lang.String createBy) {
		this.createBy = createBy;
	}

	public org.joda.time.DateTime getLastModifyTime() {
		return this.lastModifyTime;
	}

	public void setLastModifyTime(org.joda.time.DateTime lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public java.lang.String getLastModifyBy() {
		return this.lastModifyBy;
	}

	public void setLastModifyBy(java.lang.String lastModifyBy) {
		this.lastModifyBy = lastModifyBy;
	}

	public java.lang.Long getOptTime() {
		return this.optTime;
	}

	public void setOptTime(java.lang.Long optTime) {
		this.optTime = optTime;
	}
}