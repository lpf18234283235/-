package  com.test.service;

import com.test.entity.MainEntity;
import com.test.util.JsonResult;
import net.sf.json.JSONObject;

public interface MainService {
	JSONObject sqlExec(String paramString, String[] paramArrayOfString);

	void login(MainEntity mainEntity);

	Integer findIdByOpenId(String openId);

	void replaceById(MainEntity mainEntity);

	String findUsernameByOpenId(String openId);

	String findStatusByOpenId(String openId);

	String getStatusByOpenId(String openId);

	JsonResult<Void> getUserByOpenId(String openId);

	MainEntity findMainByOpenId(String openId);

	void changeStatusByMainId(Integer status);

	MainEntity findMainByMainId(Integer mainId);
}
