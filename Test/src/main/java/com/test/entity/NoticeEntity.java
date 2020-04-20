package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.test.entity.BaseEntity;
import com.test.entity.NoticeEntity;
import java.util.Date;








public class NoticeEntity
		extends BaseEntity
{
	private Integer noticeId;
	private Integer inviteId;
	private Integer beInvitedId;
	private String noticeType;
	private String noticeInfo;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date insertTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Integer readStatus;
	private Date readTime;

	public Integer getNoticeId() { return this.noticeId; }


	public void setNoticeId(Integer noticeId) { this.noticeId = noticeId; }


	public Integer getInviteId() { return this.inviteId; }


	public void setInviteId(Integer inviteId) { this.inviteId = inviteId; }


	public Integer getBeInvitedId() { return this.beInvitedId; }


	public void setBeInvitedId(Integer beInvitedId) { this.beInvitedId = beInvitedId; }


	public String getNoticeType() { return this.noticeType; }


	public void setNoticeType(String noticeType) { this.noticeType = noticeType; }



	public Date getInsertTime() { return this.insertTime; }


	public void setInsertTime(Date insertTime) { this.insertTime = insertTime; }


	public Integer getReadStatus() { return this.readStatus; }


	public void setReadStatus(Integer readStatus) { this.readStatus = readStatus; }


	public Date getReadTime() { return this.readTime; }


	public void setReadTime(Date readTime) { this.readTime = readTime; }


	public String getNoticeInfo() { return this.noticeInfo; }


	public NoticeEntity setNoticeInfo(String noticeInfo) {
		this.noticeInfo = noticeInfo;
		return this;
	}



	public String toString() { return "NoticeEntity{noticeId=" + this.noticeId + ", inviteId=" + this.inviteId + ", beInvitedId=" + this.beInvitedId + ", noticeType='" + this.noticeType + '\'' + ", noticeInfo='" + this.noticeInfo + '\'' + ", insertTime=" + this.insertTime + ", readStatus=" + this.readStatus + ", readTime=" + this.readTime + '}'; }
}
