package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.Book;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    /*
    @Pointcut("execution( * org.example.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary(){

    }

    @Pointcut("execution( * org.example.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary(){

    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()" )
    private void allGetAndReturnMethods(){

    }



    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice 1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice 2");

    }

    @Before("allGetAndReturnMethods()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice 3");

    }


     */



    @Before("org.example.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);
        System.out.println(methodSignature.getMethod());
        System.out.println(methodSignature.getReturnType());
        System.out.println(methodSignature.getName());
        if(methodSignature.getName().equals("addBook")){
            Object [] arguments=joinPoint.getArgs();
            for(Object object: arguments){
                if(object instanceof Book){
                    Book myBook = (Book) object;
                    System.out.println(myBook.getAuthor()+" "+myBook.getName()+" "+ myBook.getYear());
                } else if(object instanceof  String){
                    System.out.println(object);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice get book");
    }

}
