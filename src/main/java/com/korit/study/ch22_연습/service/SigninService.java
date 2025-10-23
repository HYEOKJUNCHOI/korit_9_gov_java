package com.korit.study.ch22_연습.service;

import com.korit.study.ch22_연습.dto.SigninDto;

public interface SigninService {
    void signin(SigninDto signinDto);
    boolean isEmpty(String str);    //공백을 포함하면 안됨
}