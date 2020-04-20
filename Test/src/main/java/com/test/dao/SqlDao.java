package com.test.dao;


import java.util.List;

import com.test.entity.TSql;



public interface SqlDao {

    String querySqlByName(String sqlName);
    List sqlSelect(String sql, Object[] parameter);
    Integer sqlExec(String sql, String[] parameter);
    
}

