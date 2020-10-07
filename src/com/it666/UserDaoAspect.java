package com.it666;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserDaoAspect {
    @Before(value = "execution(* com.it666.UserDaoImpl.delete(..) )")
    public void check(){
        System.out.println("È¨ÏÞ¼ì²é");
    }
}
