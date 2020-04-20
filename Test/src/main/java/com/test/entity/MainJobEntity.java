package com.test.entity;

import com.test.entity.BaseEntity;
import com.test.entity.MainJobEntity;


public class MainJobEntity
		extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String jobName;
	private Integer jobId;
	private Integer mainId;

	public String toString() { return "JobMain [id=" + this.id + ", jobName=" + this.jobName + ", jobId=" + this.jobId + ", mainId=" + this.mainId + "]"; }


	public Integer getId() { return this.id; }


	public void setId(Integer id) { this.id = id; }


	public String getJobName() { return this.jobName; }


	public void setJobName(String jobName) { this.jobName = jobName; }


	public Integer getJobId() { return this.jobId; }


	public void setJobId(Integer jobId) { this.jobId = jobId; }


	public Integer getMainId() { return this.mainId; }


	public void setMainId(Integer mainId) { this.mainId = mainId; }
}
