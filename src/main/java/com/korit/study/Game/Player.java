package com.korit.study.Game;

///  Player > 재료 구성 넣기

public class Player {

    String job;
    int level;
    int hp;
    int mp;
    String[] items;

    public Player(String job, int level, int hp, int mp, String[] items) {
        this.job = job;
        this.level = level;
        this.hp = hp;
        this.mp = mp;
        this.items = items;
    }

}
