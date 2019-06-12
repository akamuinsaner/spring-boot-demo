package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class AopExample {

    @Pointcut("execution(* com.example.controller.GreetingController.greeting(..))")
    public void performance() {}

    @Before("performance()")
    public void aopBefore() {
        System.out.println("Before");
    }

    @After("performance()")
    public void aopAfter() {
        System.out.println("After");
    }

    @Around("performance()")
    public Object aopAround(ProceedingJoinPoint jp) throws Throwable {
        try {
            System.out.println("Around before");
            Object o = jp.proceed();
            System.out.println("Around after");
            return o;
        } catch (Throwable e) {
            System.out.println("fuck");
            return "";
        }
    }

    @AfterReturning("performance()")
    public void aopAfterReturning() {
        System.out.println("AfterReturning");
    }

    @AfterThrowing("performance()")
    public void aopAfterThrowing() {
        System.out.println("AfterThrowing");
    }


}