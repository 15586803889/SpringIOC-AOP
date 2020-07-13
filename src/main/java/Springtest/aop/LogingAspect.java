package Springtest.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Aspect
public class LogingAspect {

    /***
     * 切点表达式
     */
    @Pointcut("execution(* CalculatorImpl.*(..))")
    public void getPoint(){}


    /***
     * 前置通知
     * @param jp
     */
    @Before("getPoint()")
    public void beforeMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        List<Object> args = Arrays.asList(jp.getArgs());
        System.out.println("The method "+ methodName+" begins with "+ args);
    }

    /***
     * 后置通知
     * @param joinPoint
     */
    @After("getPoint()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method "+ methodName+" ends");

    }


    /***
     * 返回通知
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "getPoint()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();

        System.out.println("The method "+ methodName+" ends with "+result);

    }

    /***
     * 异常通知
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "getPoint()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e){
        String methodName = joinPoint.getSignature().getName();

        System.out.println("The method "+ methodName+" occurs with "+e);
    }


    /***
     * 环绕通知
     * @param proceedingJoinPoint
     * @return
     */
//    @Around("getPoint()")
//    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
//
//        Object result = null;
//        String methodName = proceedingJoinPoint.getSignature().getName();
//        List<Object> args = Arrays.asList(proceedingJoinPoint.getArgs());
//
//        try {
//            //前置通知
//            System.out.println("The method " + methodName + " begins with " + args);
//
//            result = proceedingJoinPoint.proceed();
//
//            //返回通知
//            System.out.println("The method ends with "+ result);
//        } catch (Throwable throwable) {
//            //异常通知
//            System.out.println("The method occurs with " + throwable );
//            throw new RuntimeException();
//        }
//
//        //后置通知
//        System.out.println("The method "+ methodName +" ends");
//
//        return result;
//
//    }
}
