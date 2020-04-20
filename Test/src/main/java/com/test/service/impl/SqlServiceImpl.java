package com.test.service.impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.SqlDao;
import com.test.entity.MainJobEntity;
import com.test.mapper.CompanyMapper;
import com.test.mapper.MainJobMapper;
import com.test.service.SqlService;
import com.test.util.Gson.Gsons;

import net.sf.json.JSONArray;
import net.sf.json.JSONNull;
import net.sf.json.JSONObject;

@Service
public class SqlServiceImpl implements SqlService {

    @Autowired
    private SqlDao sqlDao;
	@Autowired
	MainJobMapper mainJobMapper;
	@Autowired
	CompanyMapper companyMapper;
    @Override
    public JSONObject sqlSelect(String sqlName, Object[] parameter) {
        JSONObject json=new JSONObject();
        String sql=sqlDao.querySqlByName(sqlName);
        if(sql==null) {
            json.put("status", 1);
            json.put("msg", "查询失败-传入参数错误");
            JSONObject data = Gsons.data(json);
            return data;
        }

        List<?> list =  sqlDao.sqlSelect(sql,parameter);
        if (list==null){
            json.put("status", 1);
            json.put("msg", "查询失败");
        }else {
            json.put("status", 0);
            json.put("msg", "查询成功");
            json.put("data",list);
        }
        JSONObject data = Gsons.data(json);
        JSONObject data2=filterNull(data);
        return data2;
    }

    @Override
    public JSONObject sqlExec(String sqlName, String[] parameter) {
        JSONObject json=new JSONObject();
        String sql=sqlDao.querySqlByName(sqlName);
        if(sql==null) {
            json.put("status", 1);
            json.put("msg", "查询失败-传入参数错误");
            JSONObject data = Gsons.data(json);
            return data;
        }
        Integer ret =  sqlDao.sqlExec(sql,parameter);
        if (ret==1){
            json.put("status", 0);
            json.put("msg", "执行成功");
        }else {
            json.put("status", 1);
            json.put("msg", "执行失败");
        }
        JSONObject data = Gsons.data(json);

        return data;

    }

    /**
     * 将json对象中包含的null和JSONNull属性修改成""
     *
     * @param jsonObj
     */
    public JSONObject filterNull(JSONObject jsonObj) {
        Iterator<String> it = jsonObj.keys();
        Object obj = null;
        String key = null;
        while (it.hasNext()) {
            key = it.next();
            obj = jsonObj.get(key);
            if (obj instanceof JSONObject) {
                filterNull((JSONObject) obj);
            }
            if (obj instanceof JSONArray) {
                JSONArray objArr = (JSONArray) obj;
                for (int i = 0; i < objArr.size(); i++) {
                    filterNull(objArr.getJSONObject(i));
                }
            }
            if (obj == null || obj instanceof JSONNull) {
                jsonObj.put(key, "");
            }
            if (obj.equals(null)) {
                jsonObj.put(key, "");
            }
        }
        return jsonObj;
    }

	@Override
	public JSONObject SelectByJobName(String jobName) {
		 JSONObject json=new JSONObject();
		List<MainJobEntity> list=mainJobMapper.findJobByName(jobName);
		List<Integer> l=new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			Integer a=list.get(i).getMainId();
			l.add(a);
		}
		  List<?> l2 = companyMapper.findCompanyByIds(l);
		  if (l2==null){
	            json.put("status", 1);
	            json.put("msg", "查询失败");
	        }else {
	            json.put("status", 0);
	            json.put("msg", "查询成功");
	            json.put("data",list);
	        }
	        JSONObject data = Gsons.data(json);
	        JSONObject data2=filterNull(data);
	        return data2;
	}

}
