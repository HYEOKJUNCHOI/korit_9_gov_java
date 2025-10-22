package com.korit.study.ch22_연습.dto;

import com.korit.study.ch22.service.SignupService;

public class SigninDto {
    // 디티오 구성 = 필드선언 > 생성자 > 게터/세터

    private String username;
    private  String password;

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

    public SigninDto(String username, String password) {
        this.username = username;
        this.password = password;


    }
}
