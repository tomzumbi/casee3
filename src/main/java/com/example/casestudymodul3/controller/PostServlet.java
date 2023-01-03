package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Post;
import com.example.casestudymodul3.service.PostService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/post")
public class PostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.setAttribute("account", session.getAttribute("account"));
        request.setAttribute("posts", PostService.getAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/feed.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
