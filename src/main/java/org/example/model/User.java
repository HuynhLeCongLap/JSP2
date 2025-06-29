package org.example.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String username;
    private String password;
    private String role;
    private LocalDateTime createdAt;
    private List<Posts> posts = new ArrayList<>();
    private List<Follow> following = new ArrayList<>();
    private List<Follow> followers = new ArrayList<>();
    private boolean followedByCurrentUser;

    // Các thuộc tính mới
    private int followerCount;  // Số lượng followers
    private int followingCount;  // Số lượng following

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    // Getters và Setters cho các thuộc tính
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }

    public List<Follow> getFollowing() {
        return following;
    }

    public void setFollowing(List<Follow> following) {
        this.following = following;
    }

    public List<Follow> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Follow> followers) {
        this.followers = followers;
    }

    public boolean isFollowedByCurrentUser() {
        return followedByCurrentUser;
    }

    public void setFollowedByCurrentUser(boolean followedByCurrentUser) {
        this.followedByCurrentUser = followedByCurrentUser;
    }

    // Getter và setter cho followerCount và followingCount
    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }
}
