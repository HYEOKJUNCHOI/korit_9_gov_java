package com.korit.study.ch17;

public interface GrantedAuthority {  // 사용자 계정 권한 줄때 사용

    public String getAuthority(); // 기본적으로 인터페이스에는 public이 붙어있음 붙여도됨

}
