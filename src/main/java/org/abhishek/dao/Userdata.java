package org.abhishek.dao;

import org.abhishek.model.User;

import java.util.ArrayList;
import java.util.List;

public class Userdata {
    static List<User> listofuser = new ArrayList<>();
    static{
    listofuser.add(new User("abhi","12345"));
    listofuser.add(new User("aman","123456"));
    }
    public Userdata() {

    }

}
