package com.example.casestudymodul3.service;

import com.example.casestudymodul3.DAO.RegisterDAO;
import com.example.casestudymodul3.model.Account;

public class RegisterSevice {
    RegisterDAO registerDAO = new RegisterDAO();
    public boolean Adduser(Account account){
        return registerDAO.Adduser(account);
    }
    public boolean checkacc(String username) {
        return registerDAO.checkacc(username);
    }

    public boolean checkusername(String username){
        if(username.length() >= 6){
            return true;
        }
        else return false;
    }

    public boolean checkpass(String password){
        if (password.length() >= 6 && password.length() <=20){
            return true;
        }else return false;
    }

    public boolean checkemail(String email) {
        return registerDAO.checkemail(email);
    }

    public boolean checkphonenumber(String phonenumber) {
        return registerDAO.checkphonenumber(phonenumber);
    }




}
