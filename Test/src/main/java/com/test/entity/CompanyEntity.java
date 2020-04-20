package com.test.entity;

import com.test.entity.BaseEntity;
import com.test.entity.CompanyEntity;























public class CompanyEntity
        extends BaseEntity
{
    private static final long serialVersionUID = 1L;
    private Integer userId;
    private String teamName;
    private String name;
    private String sex;
    private String phone;
    private String email;
    private String userImage;
    private String address;
    private String introduce;
    private String license;
    private Integer addressCode;

    public Integer getAddressCode() { return this.addressCode; }


    public CompanyEntity setAddressCode(Integer addressCode) {
        this.addressCode = addressCode;
        return this;
    }







    public void setUserId(Integer userId) { this.userId = userId; }




    public Integer getUserId() { return this.userId; }



    public void setTeamName(String teamName) { this.teamName = teamName; }




    public String getTeamName() { return this.teamName; }



    public void setName(String name) { this.name = name; }




    public String getName() { return this.name; }



    public void setSex(String sex) { this.sex = sex; }




    public String getSex() { return this.sex; }



    public void setPhone(String phone) { this.phone = phone; }




    public String getPhone() { return this.phone; }



    public void setEmail(String email) { this.email = email; }




    public String getEmail() { return this.email; }



    public void setUserImage(String userImage) { this.userImage = userImage; }




    public String getUserImage() { return this.userImage; }



    public void setAddress(String address) { this.address = address; }




    public String getAddress() { return this.address; }



    public void setIntroduce(String introduce) { this.introduce = introduce; }




    public String getIntroduce() { return this.introduce; }



    public void setLicense(String license) { this.license = license; }




    public String getLicense() { return this.license; }





    public String toString() { return "CompanyEntity{userId=" + this.userId + ", teamName='" + this.teamName + '\'' + ", name='" + this.name + '\'' + ", sex='" + this.sex + '\'' + ", phone='" + this.phone + '\'' + ", email='" + this.email + '\'' + ", userImage='" + this.userImage + '\'' + ", address='" + this.address + '\'' + ", introduce='" + this.introduce + '\'' + ", license='" + this.license + '\'' + ", addressCode=" + this.addressCode + '}'; }
}
