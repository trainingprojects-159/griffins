package com.mphasis.griffin.configurations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AscpectHelper {
    @Before("execution(* com.mphasis.griffin.*.*.*(..))")   
	public void beforeMethods(JoinPoint joinpoint) {
        // class name and method name	
    	System.out.println("before"+joinpoint.getSignature());
      // only method name
    	System.out.println(joinpoint.getSignature().getName());
  
    }
    @After("execution(* com.mphasis.griffin.*.*.*(..))")   
   	public void afterMethods(JoinPoint joinpoint) {
           // class name and method name	
       	System.out.println("after"+joinpoint.getSignature());
         // only method name
       	System.out.println(joinpoint.getSignature().getName());
           }
    }  

