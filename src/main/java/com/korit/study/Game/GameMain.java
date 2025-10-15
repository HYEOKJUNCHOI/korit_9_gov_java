package com.korit.study.Game;

/// 객체 생성 + 배열로 묶기 + 반복문으로 출력

public class GameMain {
    public static void main(String[] args) {
        // 1. 객체생성 //  Player 전사 = new Player("전사", 10, 100, new String[]{"칼,", "방패"});
        Player 전사 = new Player("전사", 1, 150, 20, new String[] {"칼," , "방패"});
        Player 마법사 = new Player("마법사", 19, 80, 100, new String[] {"지팡이," , "MP물약"});
        Player 궁수 = new Player("궁수", 25, 100, 30, new String[] {"활," , "화살"});

        //2. 배열로 묶기 Player[] party = {};
        Player[] party = {전사,마법사,궁수};

        //3. 반복문으로 출력
        // (int i = 0; i < party.length; i++) {
        //    Player p = party[i];
        for (int i = 0; i < party.length; i++) {
            Player p = party[i];
            GamePrintService.printplayer(p);
        }
    }
}
