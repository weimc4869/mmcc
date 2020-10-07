package com.it666;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class UserAspectTest {

    @Resource(name="userDao")
     private  UserDao userDao;
    @Test
    public void test(){
        userDao.delete();
        }

}
