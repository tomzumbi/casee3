package com.example.casestudymodul3.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/feed")
public class Feed extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        req.setAttribute("account", session.getAttribute("account"));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/feed.jsp");
        dispatcher.forward(req,resp);
    }
}
