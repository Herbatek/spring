package com.piotrek.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AllMethodExceptSetAndGetInAccountDaoOrder1 {

    @Before("com.piotrek.aspects.SharePointcuts.allInDAONoGetterSetter()")
    public void DAOWithoutGetterAndSetter3() {
        System.out.println("////////////////// AccountDAO log before for all methods except getters and setters - order 1");
    }
}
