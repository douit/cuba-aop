package com.company.aop.core;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class ModelSampleAspect {

    private static Logger log = LoggerFactory.getLogger(ModelSampleAspect.class);

    @Before("modelMethod() && publicMethod()")
    public void beforeModelAdvie() {
        log.info("ModelSampleAspect before advice");
    }

    @Pointcut("@annotation(com.company.aop.entity.Model)")
    public void modelMethod() {
    }

    @Pointcut("execution(public * *(..))")
    public void publicMethod() {
    }
}
