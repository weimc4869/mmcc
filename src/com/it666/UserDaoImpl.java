package com.it666;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void delete() {
        System.out.println("从数据库中删除数据");
    }
}
