package com.main;

import java.awt.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sql.dao.TestDao;
import com.sql.domain.TestPo;
import com.util.AppContextUtil;

public class MainCalculation {
	
public static int threadSize=10;	
public static int[] result={0,0,0,0,0,0,0};
public static int beforSize=30;
public static int behindSize=30;
public static void main(String[] args) {

	TestDao dao=AppContextUtil.getContext().getBean(TestDao.class);
	System.err.println("ggaa");
}

}
