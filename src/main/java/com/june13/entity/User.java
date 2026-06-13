package com.june13.entity;

public class User {

    private int userId;
    private String userName;

    // Default Constructor
    public User() {
    }

    // Parameterized Constructor
    public User(int userId) {
        this.userId = userId;
    }

    // Parameterized Constructor
    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    // Getter
    public int getUserId() {
        return userId;
    }

    // Setter
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter
    public String getUserName() {
        return userName;
    }

    // Setter
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
    // this for merge conflict testing
}
