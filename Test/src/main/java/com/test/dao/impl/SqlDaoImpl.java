package com.test.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.dao.SqlDao;
import com.test.entity.TSql;


@Repository
public class SqlDaoImpl implements SqlDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String querySqlByName(String sqlName) {
        List<TSql> result = jdbcTemplate.query("SELECT sqltext FROM t_sql WHERE sqlname = ?",new Object[]{sqlName},new BeanPropertyRowMapper(TSql.class));
        System.out.println(result);
        if(result.size()>0){
            return result.get(0).getSqlText();
        }else{
            return null;
        }
    }
    @Override
    public List sqlSelect(String sql, Object[] parameter) {

        List list = jdbcTemplate.queryForList(sql,parameter);

        if(list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    @Override
    public Integer sqlExec(String sql, String[] parameter) {

        Integer result = jdbcTemplate.update(sql,parameter);
        return result;
    }

}
