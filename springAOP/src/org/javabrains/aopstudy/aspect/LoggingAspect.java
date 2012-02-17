package org.javabrains.aopstudy.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import common.Logger;

@Aspect
public class LoggingAspect {
	Logger log = Logger.getLogger(LoggingAspect.class);
	
	@Before("execution(public String getName())")
    public void loggingAdvice(){
    	log.info("loggingAdvice is called : ---added by me");
    }
}
