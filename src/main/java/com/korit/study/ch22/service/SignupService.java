package com.korit.study.ch22.service;


import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;


import java.util.Objects;

public class SignupService {
    // 1. instance static 변수 정의
    private static SignupService instance; // 필드선언이; 으로 끝나면 null이 대입됨 / 기본값이 : null ,int면 0
    private UserRepository userRepository; // 소문자로 시작했으니까 변수명 / 대문자는 자료형명

    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SignupService getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SignupService(UserRepository.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = UserRepository.getInstance().findByUsername(username);
        if (Objects.isNull(foundUser)) {
            return true;
        }
        return false;
    }
//    return Objects.isNull(foundUser); 위와 같은내용 / 리팩토링..

    public boolean isValidPassword(String password) {
        return !Objects.isNull(password) && !password.isBlank();
    }

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (Objects.isNull(password) || Objects.isNull(confirmPassword)) {
            return false;
        }
        return password.equals(confirmPassword);
    }

    public void signup(SignupDto signupDto) {
//        User newUser = new User(0, signupDto.getUsername(), PasswordEncoder.encode(signupDto.getPassword()));
        userRepository.insert(signupDto.toUser());

//        UserRepository.getInstance().insert(signupDto.toUser()); ★이렇게 써도된다..?
    }
}