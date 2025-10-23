//package com.korit.study.ch22_연습.repository;
//
//import com.korit.study.ch22_연습.entity.User;
//
//import java.util.Arrays;
//import java.util.Objects;
//
//public class UserRepositoryImpl implements UserRepository {
//    private static UserRepositoryImpl instance;
//    private User[] users;
//    private int autoIncrementId;
//
//    private UserRepositoryImpl() {
//        users = new User[0];
//        autoIncrementId = 1;
//    }
//
//    public static UserRepositoryImpl getInstance() {
//        if (Objects.isNull(instance)) {
//            instance = new UserRepositoryImpl();
//        }
//        return instance;
//    }
//
//    public void insert(User user) {
//        User[] temp = Arrays.copyOf(users, users.length + 1);
//        user.setId(autoIncrementId++);
//        temp[temp.length - 1] = user;
//        users = temp;
//    }
//
//    public User findByUsername(String username) {
//        for (User user : users) {
//            if (user.getUsername().equals(username)) {
//                return user;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("User 배열: [ ");
//        for (int i = 0; i < users.length; i++) {
//            stringBuilder.append(users[i]);
//            if (i != users.length - 1) {
//                stringBuilder.append(", ");
//            }
//        }
//        stringBuilder.append(" ]");
//
//        return stringBuilder.toString();
//    }
//}