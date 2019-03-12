package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.bean.User;
import com.rest.dao.UserDao;
import com.rest.service.UserService;



/**
 * 
* Title: UserServiceImpl
* Description:
* 用户操作实现类 
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    
    
    public boolean addUser(User user) {
        boolean flag=false;
        try{
            userDao.addUser(user);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean updateUser(User user) {
        boolean flag=false;
        try{
            userDao.updateUser(user);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean deleteUser(int id) {
        boolean flag=false;
        try{
            userDao.deleteUser(id);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public List<User> findUserByName(String userName) {
        return userDao.findByName(userName);
    }

    public User findUserById(int userId) {
        return userDao.findById(userId);
    }

    public User findUserByAge(int userAge) {
        return userDao.findByAge(userAge);
    }
}
