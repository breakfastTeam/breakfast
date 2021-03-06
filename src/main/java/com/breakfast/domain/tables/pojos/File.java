/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * 文件表
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class File implements java.io.Serializable {

	private static final long serialVersionUID = 1980820851;

	private java.lang.String       fileId;
	private java.lang.String       filePath;
	private java.lang.String       status;
	private org.joda.time.DateTime createTime;
	private java.lang.String       createBy;
	private org.joda.time.DateTime lastModifyTime;
	private java.lang.String       lastModifyBy;
	private java.lang.Long         optTime;

	public File() {}

	public File(
		java.lang.String       fileId,
		java.lang.String       filePath,
		java.lang.String       status,
		org.joda.time.DateTime createTime,
		java.lang.String       createBy,
		org.joda.time.DateTime lastModifyTime,
		java.lang.String       lastModifyBy,
		java.lang.Long         optTime
	) {
		this.fileId = fileId;
		this.filePath = filePath;
		this.status = status;
		this.createTime = createTime;
		this.createBy = createBy;
		this.lastModifyTime = lastModifyTime;
		this.lastModifyBy = lastModifyBy;
		this.optTime = optTime;
	}

	public java.lang.String getFileId() {
		return this.fileId;
	}

	public void setFileId(java.lang.String fileId) {
		this.fileId = fileId;
	}

	public java.lang.String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(java.lang.String filePath) {
		this.filePath = filePath;
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
