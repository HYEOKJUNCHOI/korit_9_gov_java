package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.Arrays;
import java.util.Objects;

public class UserRepository {
    private static UserRepository instance;
    private User[] users;
    private int autoIncrementId;

    private UserRepository() {
        users = new User[0];
        autoIncrementId = 1;
    }

    public static UserRepository getInstance() { // ★★★ getInstance()로 정의?
        if (Objects.isNull(instance)) { // is has 붙으면 리턴값이 불리언이다. // 클래스명. 쩜찍으면 무조건 스태틱이다.
            instance = new UserRepository(); // 첫생성값이 null이니까 , instance를 넣겟다.
        }
        return instance;
    }

    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);
        user.setId(autoIncrementId++);
        temp[temp.length - 1] = user;
        users = temp;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private int generateId() {
        return users[users.length].getId() + 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User 배열: [ ");
        for (int i = 0; i < users.length; i++) {
            stringBuilder.append(users[i]); // toString 생략되어있음
            if (i != users.length - 1) { // 끝이 아니라면 쉼표를 찍어
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }
}

