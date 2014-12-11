/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * 分享信息表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Share implements java.io.Serializable {

	private static final long serialVersionUID = 1962551120;

	private java.lang.String       shareId;
	private java.lang.String       shareInfo;
	private java.lang.String       userId;
	private java.lang.String       status;
	private java.lang.String       code;
	private java.lang.String       target;
	private org.joda.time.DateTime createTime;
	private java.lang.String       createBy;
	private org.joda.time.DateTime lastModifyTime;
	private java.lang.String       lastModifyBy;
	private java.lang.Long         optTime;

	public Share() {}

	public Share(
		java.lang.String       shareId,
		java.lang.String       shareInfo,
		java.lang.String       userId,
		java.lang.String       status,
		java.lang.String       code,
		java.lang.String       target,
		org.joda.time.DateTime createTime,
		java.lang.String       createBy,
		org.joda.time.DateTime lastModifyTime,
		java.lang.String       lastModifyBy,
		java.lang.Long         optTime
	) {
		this.shareId = shareId;
		this.shareInfo = shareInfo;
		this.userId = userId;
		this.status = status;
		this.code = code;
		this.target = target;
		this.createTime = createTime;
		this.createBy = createBy;
		this.lastModifyTime = lastModifyTime;
		this.lastModifyBy = lastModifyBy;
		this.optTime = optTime;
	}

	public java.lang.String getShareId() {
		return this.shareId;
	}

	public void setShareId(java.lang.String shareId) {
		this.shareId = shareId;
	}

	public java.lang.String getShareInfo() {
		return this.shareInfo;
	}

	public void setShareInfo(java.lang.String shareInfo) {
		this.shareInfo = shareInfo;
	}

	public java.lang.String getUserId() {
		return this.userId;
	}

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getCode() {
		return this.code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getTarget() {
		return this.target;
	}

	public void setTarget(java.lang.String target) {
		this.target = target;
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