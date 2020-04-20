package com.test.util;

import java.util.List;
import java.util.Map;

public class ResultList {
    private Map 基本信息;
    private List 告警信息;
    private Map 站点信息;

    @Override
    public String toString() {
        return "ResultList{" +
                "基本信息=" + 基本信息 +
                ", 告警信息=" + 告警信息 +
                ", 站点信息=" + 站点信息 +
                '}';
    }

    public Map get基本信息() {
        return 基本信息;
    }

    public void set基本信息(Map 基本信息) {
        this.基本信息 = 基本信息;
    }

    public List get告警信息() {
        return 告警信息;
    }

    public void set告警信息(List 告警信息) {
        this.告警信息 = 告警信息;
    }

    public Map get站点信息() {
        return 站点信息;
    }

    public void set站点信息(Map 站点信息) {
        this.站点信息 = 站点信息;
    }
}
