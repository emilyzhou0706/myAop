package com.javainuse.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

    @Before(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
    public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
        System.out.println("Before method:" + joinPoint.getSignature());

        System.out.println("Creating Employee with name - " + name + " and id - " + empId);
    }

    //各种返回值，所有的修饰符，所有的method,所有的参数类型
    @After(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
    public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
        System.out.println("After method:" + joinPoint.getSignature());

        System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
    }

    //各种返回值，所有的修饰符，所有的method,所有的参数类型
    @AfterReturning(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)", returning="result")
    public void afterReturning(JoinPoint joinPoint, String name, String empId,Object result) {
        System.out.println("AfterReturning method:" + joinPoint.getSignature().getName());
        System.out.println("result="+result);
        System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
    }
}
