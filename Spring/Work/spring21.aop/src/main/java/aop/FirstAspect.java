package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.ModelProduct;

public class FirstAspect {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    public void before(JoinPoint jp){
        // before : 메서드 호출전에 실행되는 advice
        logger.debug("before -------> 메서드 호출 전");
        logger.debug("before -------> 호출되는 메서드는" + jp.getSignature().getName());
        logger.debug("before -------> 매개변수는" + jp.getArgs().toString());
    }
    public void after(){   
        // after : 메서드 호출후에 실행되는 advice . 반환값이 없는경우
        logger.debug("after -------> 메서드 호출 후");
        logger.debug("after -------> 메서드 호출 후");
        logger.debug("after -------> 메서드 호출 후");
    }
    
    public void afterReturning(JoinPoint jp , ModelProduct product){
        // afterReturning : 메서드 호출후 실행되는 advice.
        //                  반환값이 있는 경우
        logger.debug("afterReturning -------> 메서드 호출 후");
        logger.debug("afterReturning -------> 호출되는 메서드는" + jp.getSignature().getName());
        logger.debug("afterReturning -------> 매개변수는" + jp.getArgs().toString());
        
    }
   
     public Object around(ProceedingJoinPoint jp) throws Throwable{
         // around : 메서드 호출 전과 후에 실행되는 advice
         logger.debug("around -------> 메서드 호출 전");
         logger.debug("around -------> 메서드 호출 전");
         logger.debug("around -------> 메서드 호출 전");
         
         Object p = jp.proceed();
         
         logger.debug("around -------> 메서드 호출 후");
         logger.debug("around -------> 메서드 호출 후");
         logger.debug("around -------> 메서드 호출 후");
         
         return p;
        
    }
    public void afterThrowing(Throwable e){
    // afterThrowing : 메서드 실행중 예외가 발생했을 때
        logger.debug("afterThrowing -------> 메서드 실행중 예외발생");
        logger.debug("afterThrowing -------> exception value" + e.getMessage());
        logger.debug("afterThrowing -------> 메서드 실행중 예외발생");
        
    }
}
