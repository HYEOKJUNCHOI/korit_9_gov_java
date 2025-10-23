//package com.korit.study.ch22_연습.service;
//
//import com.korit.study.ch22_연습.dto.SignupDto;
//import com.korit.study.ch22_연습.entity.User;
//import com.korit.study.ch22_연습.repository.UserRepository;
//import com.korit.study.ch22_연습.repository.UserRepositoryImpl;
//import com.korit.study.ch22_연습.repository.UserRepositoryImpl2;
//
//import java.util.Objects;
//
//public class SignupService {
//    // 1. instance static 변수 정의
//    private static SignupService instance;
//    private UserRepository userRepository;
//
//    private SignupService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public static SignupService getInstance() {
//        if (Objects.isNull(instance)) {
//            instance = new SignupService(UserRepositoryImpl2.getInstance());
//        }
//        return instance;
//    }
//
//    public boolean isValidDuplicatedUsername(String username) {
//        User foundUser = userRepository.findByUsername(username);
//        if (Objects.isNull(foundUser)) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean isValidPassword(String password) {
//        return !Objects.isNull(password) && !password.isBlank();
//    }
//
//    public boolean isValidConfirmPassword(String password, String confirmPassword) {
//        if (Objects.isNull(password) || Objects.isNull(confirmPassword)) {
//            return false;
//        }
//        return password.equals(confirmPassword);
//    }
//
//    public void signup(SignupDto signupDto) {
////        User newUser = new User(0, signupDto.getUsername(), PasswordEncoder.encode(signupDto.getPassword()));
//        userRepository.insert(signupDto.toUser());
//    }
//}