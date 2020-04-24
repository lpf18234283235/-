package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.test.entity.BaseEntity;
import com.test.entity.FreemanEntity;






































public class FreemanEntity
		extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String name;
	private String sex;
	private String phone;
	private String email;
	private String education;
	private Integer salaryExpectation;
	private String userImage;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private String birthday;
	private Integer workingLife;
	private String address;
	private String educationExperience;
	private String workExperience;
	private String personalIntroduction;
	private Integer addressCode;
	private Integer postId;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public FreemanEntity setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
		return this;
	}

	private Integer userStatus;

	public Integer getPostId() {
		return postId;
	}

	public FreemanEntity setPostId(Integer postId) {
		this.postId = postId;
		return this;
	}

	public Integer getAddressCode() {
		return this.addressCode;
	}


	public FreemanEntity setAddressCode(Integer addressCode) {
		this.addressCode = addressCode;
		return this;
	}


	public Integer getUserId() {
		return this.userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return this.sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getPhone() {
		return this.phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return this.email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEducation() {
		return this.education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public Integer getSalaryExpectation() {
		return this.salaryExpectation;
	}


	public void setSalaryExpectation(Integer salaryExpectation) {
		this.salaryExpectation = salaryExpectation;
	}


	public String getUserImage() {
		return this.userImage;
	}


	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}


	public String getBirthday() {
		return this.birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public Integer getWorkingLife() {
		return this.workingLife;
	}


	public void setWorkingLife(Integer workingLife) {
		this.workingLife = workingLife;
	}


	public String getAddress() {
		return this.address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEducationExperience() {
		return this.educationExperience;
	}


	public void setEducationExperience(String educationExperience) {
		this.educationExperience = educationExperience;
	}


	public String getWorkExperience() {
		return this.workExperience;
	}


	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}


	public String getPersonalIntroduction() {
		return this.personalIntroduction;
	}


	public void setPersonalIntroduction(String personalIntroduction) {
		this.personalIntroduction = personalIntroduction;
	}


	public static long getSerialversionuid() {
		return 1L;
	}

	@Override
	public String toString() {
		return "FreemanEntity{" +
				"userId=" + userId +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", education='" + education + '\'' +
				", salaryExpectation=" + salaryExpectation +
				", userImage='" + userImage + '\'' +
				", birthday='" + birthday + '\'' +
				", workingLife=" + workingLife +
				", address='" + address + '\'' +
				", educationExperience='" + educationExperience + '\'' +
				", workExperience='" + workExperience + '\'' +
				", personalIntroduction='" + personalIntroduction + '\'' +
				", addressCode=" + addressCode +
				", postId=" + postId +
				", userStatus=" + userStatus +
				'}';
	}
}





