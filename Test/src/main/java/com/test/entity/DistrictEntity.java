package com.test.entity;

import com.test.entity.BaseEntity;
import com.test.entity.DistrictEntity;

public class DistrictEntity
        extends BaseEntity {
    private Integer id;
    private String parent;

    public String toString() { return "District [id=" + this.id + ", parent=" + this.parent + ", code=" + this.code + ", name=" + this.name + "]"; }
    private String code; private String name;

    public Integer getId() { return this.id; }


    public void setId(Integer id) { this.id = id; }


    public String getParent() { return this.parent; }


    public void setParent(String parent) { this.parent = parent; }


    public String getCode() { return this.code; }


    public void setCode(String code) { this.code = code; }


    public String getName() { return this.name; }


    public void setName(String name) { this.name = name; }
}
