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

	private static final long serialVersionUID = 626183868;

	private java.lang.String   messageId;
	private java.lang.String   userId;
	private java.lang.String   customerServiceId;
	private java.lang.String   content;
	private java.sql.Timestamp createTime;
	private java.lang.String   status;

	public Message() {}

	public Message(
		java.lang.String   messageId,
		java.lang.String   userId,
		java.lang.String   customerServiceId,
		java.lang.String   content,
		java.sql.Timestamp createTime,
		java.lang.String   status
	) {
		this.messageId = messageId;
		this.userId = userId;
		this.customerServiceId = customerServiceId;
		this.content = content;
		this.createTime = createTime;
		this.status = status;
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
