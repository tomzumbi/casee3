package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Account;
import com.example.casestudymodul3.service.ForgotService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/resetpass")
public class ResetPass extends HttpServlet {
    ForgotService forgotService = new ForgotService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mess = req.getParameter("mess");
        if (mess != null) {
            switch (mess) {
                case "error1":
                    mess = "Account does not exist";
                    req.setAttribute("mess", mess);
                    break;
                case "error2":
                    mess = "Password does not match";
                    req.setAttribute("mess", mess);
                    break;
            }
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/resetpass.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String repass = req.getParameter("repass");
        Account account = forgotService.finduser(username);
        if (account == null) {
            resp.sendRedirect("/resetpass?mess=error1");
        } else if (password.equals(repass)) {
            forgotService.updatepass(new Account(username, password));
            resp.sendRedirect("/login");
        } else {
            resp.sendRedirect("/resetpass?mess=error2");
        }
    }
}
