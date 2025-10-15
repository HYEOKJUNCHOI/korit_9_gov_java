package com.korit.study.Game;

///  어떤식으로 출력할건지

// System.out.println("직업 : " + player.job);
public class GamePrintService {
    public static void printplayer(Player player) {
        System.out.println("직업 : " + player.job);
        System.out.println("레벨 : " + player.level);
        System.out.println("체력 : " + player.hp);
        System.out.println("마력 : " + player.mp);

        System.out.print("인벤토리 : ");
            for (int i = 0 ; i < player.items.length; i++){
                System.out.print(player.items[i] + "");
            }
        System.out.println("\n");
    }

}
