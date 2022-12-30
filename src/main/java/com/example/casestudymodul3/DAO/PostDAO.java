package com.example.casestudymodul3.DAO;

import com.example.casestudymodul3.model.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {
    public List<Post> getAll() {
    List<Post> posts = new ArrayList<>();
    String sql = "Select post.idPost, post.img, post.noidung, Accounts.idAccounts, Accounts.username, post.time from Post join accounts on post.idAccounts = accounts.idaccounts order by time desc;";
    Connection connection = ConnectionMySql.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                String username = resultSet.getString("username");
                String noidung = resultSet.getString("noidung");
                String linkimg = resultSet.getString("img");
                String time = resultSet.getString("time");
                posts.add(new Post(username,linkimg,noidung,time));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }
    public boolean save(Post post) {
        String sql = "INSERT INTO post (idaccounts, img, noidung) VALUES (?, ?, ?);";
        Connection connection = ConnectionMySql.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
