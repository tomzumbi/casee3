package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Post;
import com.example.casestudymodul3.service.PostService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/editpost")
public class EditPostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idposts"));
        Post post = PostService.findPostById(id);
        request.setAttribute("edit", post);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/myprofile.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idPost"));
        String content = request.getParameter("content");
        String img = request.getParameter("img");
        PostService.edit(new Post(id,img,content));
        response.sendRedirect("/myposts");
    }
}
