package com.korit.study.Exercise.싱글톤연습;

public class GameConfigManager {

    // 🟩 싱글톤 인스턴스 저장용 필드 추가
    private static GameConfigManager instance;

    // 설정 정보 필드
    private int soundVolume = 50;           // 기본값 50
    private String resolution = "1280x720"; // 기본 해상도

 ///TODO   // 🟩 외부에서 new 못 하도록 private 생성자 추가
    private GameConfigManager() {
    }

 ///TODO   // 🟩 인스턴스 반환 메서드 (싱글톤)
    public static GameConfigManager getInstance() { // 프라이빗이니까 겟터사용
        if (instance == null) {                   // 🟩 처음 접근 시 한 번만 생성
            instance = new GameConfigManager();
        }
        return instance;                          // 🟩 항상 같은 객체 반환
    }

    // Getter/Setter (문제에 이미 포함되어 있던 부분)
    public void setSoundVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.soundVolume = volume;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public String getConfigInfo() {
        return String.format("Sound: %d, Resolution: %s", soundVolume, resolution);
    }
}
