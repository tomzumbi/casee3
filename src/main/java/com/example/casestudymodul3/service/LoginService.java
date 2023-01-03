package com.example.casestudymodul3.service;

import com.example.casestudymodul3.DAO.LoginDAO;
import com.example.casestudymodul3.model.Account;

public class LoginService {
    LoginDAO loginDAO = new LoginDAO();
    public Account checklogin(String username){
        return loginDAO.checklogin(username);
    }

    public String checkpass(String username){
        return loginDAO.checkpass(username);
    }


}
