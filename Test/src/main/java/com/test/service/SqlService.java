package com.test.service;


import net.sf.json.JSONObject;

public interface SqlService {


	JSONObject sqlSelect(String sqlName, Object[] parameter);

	JSONObject sqlExec(String sqlName, String[] parameter);
	
	JSONObject SelectByJobName(String jobName);
}
