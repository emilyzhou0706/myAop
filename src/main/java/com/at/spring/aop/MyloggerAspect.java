/*
package com.at.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Component
@Aspect
public class MyloggerAspect {
    //切入点表达式，@Before将方法制定为前置通知，必须设置value,其值为切入点表达式
    @Before(value="execute(public int com.at.spring.aop.MathImpl.add(int, int))")
    public void beforeMethod(){
        System.out.println("方法执行之前");
    }
    

}
*/
