package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Post;
import com.example.casestudymodul3.service.PostService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/createpost")
public class CreatePostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String img = request.getParameter("linkimg");
        String content = request.getParameter("content");
        PostService.save(new Post("hiep",img,content));
        request.setAttribute("posts",PostService.getAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/feed.jsp");
        dispatcher.forward(request,response);
    }
}
