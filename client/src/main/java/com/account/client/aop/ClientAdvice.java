/**
* Dev space by Mayu... 
**/
package com.account.client.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ClientAdvice {
	
	private static final Log LOG = LogFactory.getLog(ClientAdvice.class);
	
	
	@Before("execution(* *.com.account.client.controller.ClientController.*(..))")
	public void traceBeforeControllerMethods(JoinPoint joinpoint) {
		LOG.debug(" Entered inside : " + joinpoint.getSignature());
	}

	@After("execution(* *.com.account.client.controller.ClientController.*(..))")
	public void traceAfterControllerMethods(JoinPoint joinpoint) {
		LOG.debug(" Finished : " + joinpoint.getSignature());
	}

}
