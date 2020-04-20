package com.test.entity;

public class PostEntity extends  BaseEntity{
    //岗位id
    private Integer postId;
    //岗位名称
    private String postName;

    public Integer getPostId() {
        return postId;
    }

    public PostEntity setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    @Override
    public String toString() {
        return "PostEntity{" +
                "postId=" + postId +
                ", postName='" + postName + '\'' +
                '}';
    }

    public String getPostName() {
        return postName;
    }

    public PostEntity setPostName(String postName) {
        this.postName = postName;
        return this;
    }
}
