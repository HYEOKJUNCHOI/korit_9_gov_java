package com.korit.study.ch14;

public class SigninDto {
    private String username;
    private String password;

    public SigninDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "SigninDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
