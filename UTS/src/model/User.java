package model;

import java.util.ArrayList;

public class User {
    private String userId;
    private String username;
    private String password;
    private String bio;
    private ArrayList<Post> posts = new ArrayList<Post>();

    public User() {

    }

    public User(String userId, String username, String password, String bio, ArrayList<Post> posts) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.posts = posts;
    }

    public String getBio() {
        return bio;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
    public String toString(){
        return "User ID : "+userId+"\nUsername : "+username+"\nPassword : "+password+"\nBio : "+bio+"\nPosts : "+posts;
    }
}
