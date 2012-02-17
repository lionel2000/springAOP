package org.javabrains.aopstudy;


import org.javabrains.aopstudy.service.ShapeService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.Logger;

public class AppMain {
    public static Logger log = Logger.getLogger(AppMain.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		log.info("initiall the context");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//	context.registerShutdownHook();
		ShapeService shapeService =(ShapeService) context.getBean("shapeService");
		log.info(shapeService.getCircle().getName());
	}

}
