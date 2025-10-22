package com.korit.study.ch22_연습.repositrory;

import com.korit.study.ch22_연습.entity.User;

import java.util.Arrays;
import java.util.Objects;

public class UserRepository {

    private static UserRepository instance; // 인스턴스 필드선언

    private User[] users; // 유저배열 필드선언

    private int autoIncermentId; // 오토인썰먼트아이디 필드선언

    private UserRepository() {
        users = new User[0];
        autoIncermentId = 1;
    }

    private static UserRepository getInstance() { //
        if (Objects.isNull(instance)) {
            instance = new UserRepository();
        }
        return instance;
    }

    public void insert(User user) { // 인서트 유저
        User[] temp = Arrays.copyOf(users, users.length + 1); // Arrays.copyOf(원본배열, 새로운배열길이)
        user.setId(autoIncermentId++);
        temp[temp.length - 1] = user;
        users = temp;

    }
}
