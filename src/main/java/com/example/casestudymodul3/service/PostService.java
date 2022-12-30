package com.example.casestudymodul3.service;

import com.example.casestudymodul3.DAO.PostDAO;
import com.example.casestudymodul3.model.Post;

import java.util.List;

public class PostService {
    static PostDAO postDAO = new PostDAO();
    public static List<Post> getAll() {
        return postDAO.getAll();
    }

}
