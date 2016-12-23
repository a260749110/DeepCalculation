package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextUtil {
private static final AppContextUtil instance=new AppContextUtil();
private static ApplicationContext context;
private AppContextUtil()
{
	
	context=(new ClassPathXmlApplicationContext("resource/spring.xml"));
	
	}
public static ApplicationContext getContext() {
	return context;
}


}
