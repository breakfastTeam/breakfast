/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * 聊天信息表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Message implements java.io.Serializable {

	private static final long serialVersionUID = 907899496;

	private java.lang.String       messageId;
	private java.lang.String       userId;
	private java.lang.String       customerServiceId;
	private java.lang.String       content;
	private java.lang.String       status;
	private org.joda.time.DateTime createTime;
	private java.lang.String       createBy;
	private org.joda.time.DateTime lastModifyTime;
	private java.lang.String       lastModifyBy;
	private java.lang.Integer      optTime;

	public Message() {}

	public Message(
		java.lang.String       messageId,
		java.lang.String       userId,
		java.lang.String       customerServiceId,
		java.lang.String       content,
		java.lang.String       status,
		org.joda.time.DateTime createTime,
		java.lang.String       createBy,
		org.joda.time.DateTime lastModifyTime,
		java.lang.String       lastModifyBy,
		java.lang.Integer      optTime
	) {
		this.messageId = messageId;
		this.userId = userId;
		this.customerServiceId = customerServiceId;
		this.content = content;
		this.status = status;
		this.createTime = createTime;
		this.createBy = createBy;
		this.lastModifyTime = lastModifyTime;
		this.lastModifyBy = lastModifyBy;
		this.optTime = optTime;
	}

	public java.lang.String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(java.lang.String messageId) {
		this.messageId = messageId;
	}

	public java.lang.String getUserId() {
		return this.userId;
	}

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}

	public java.lang.String getCustomerServiceId() {
		return this.customerServiceId;
	}

	public void setCustomerServiceId(java.lang.String customerServiceId) {
		this.customerServiceId = customerServiceId;
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

	public java.lang.Integer getOptTime() {
		return this.optTime;
	}

	public void setOptTime(java.lang.Integer optTime) {
		this.optTime = optTime;
	}
}
