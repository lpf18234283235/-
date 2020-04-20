package com.test.controller;



import com.test.exception.StatusNotAllowException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.test.exception.ServiceException;
import com.test.exception.UpdateException;
import com.test.exception.UserIllegalException;
import com.test.util.JsonResult;


/**
 * 控制器类的基类
 * @author soft01
 *
 */
public abstract class BaseController {
	
	//声明一个常量,表示成功的状态码
	public static final int SUCCESS=0;
	
	
	
      //该注解是出现括号内对应的异常的子异常
	@ExceptionHandler({RuntimeException.class,ServiceException.class})
	public JsonResult<Void> HandlerException(Throwable ex){
		//此处使用jsonResult的构造方法在创建对象时就调用
		//该构造方法的参数列表为方法体中的异常基类，但在构造方法
		//中给jsonResult对象的message属性进行了赋值
		JsonResult<Void> jsonResult=new JsonResult<>(ex);
		if(ex instanceof UserIllegalException) {
			//状态码表示客户端出现一系列错误
			//用户注册异常  
			jsonResult.setState(1000);
		}else if(ex instanceof UpdateException) {
			//登录时用户名未找到异常
			jsonResult.setState(1001);
		}else if (ex instanceof StatusNotAllowException) {
           //用戶狀態異常
			jsonResult.setState(1002);
		}
		return jsonResult;
	}
}
