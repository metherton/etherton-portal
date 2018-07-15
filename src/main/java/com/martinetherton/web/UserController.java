package com.martinetherton.web;

import com.martinetherton.models.User;
import com.martinetherton.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 09/07/18.
 */
@Controller
public class UserController {


    @Autowired
    private UserDao userDao;

    /**
     * GET /get-by-email  --> Return the id for the user having the passed
     * email.
     */
//    @RequestMapping("/get-by-email")
//    @ResponseBody
//    public String getByEmail(String email) {
//        String userId = "";
//        try {
//            User user = userDao.findByEmail(email);
//            userId = String.valueOf(user.getId());
//        }
//        catch (Exception ex) {
//            return "User not found";
//        }
//        return "The user id is: " + userId;
//    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> getUsers() {
//        List<User> users = new ArrayList<>();
        try {
  //          userDao.findAll().forEach(e -> users.add(e));
   //         return users;
            return userDao.findAll();
        }
        catch (Exception ex) {
     //       return users;
            return null;
        }
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String create(User user) {
        String userId = "";
        try {
            userDao.save(user);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + userId;
    }


}
