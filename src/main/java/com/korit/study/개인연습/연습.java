//package com.korit.study.개인연습;
//
//public class 연습 {
//    class Warrior {  // 전사 클래스
//        String name; // 객체 생성시 전사이름
//        int hp; // 객체 생성시 hp
//
//        void attack(Monster target) { //Monster 타입의 매개변수 target을 받는 attack 메서드
//            System.out.println(name + "이(가) " + target.name + "을 공격했다! ⚔️"); // 발동시 프린트될 내용
//            target.hp -= 10; // 어택 당한 타겟의 체력이 10줄어듬
//        }
//
//        void damaged(int damage) { // 데미지를 받아서 적용받는 데미지드 메서드
//            hp -= damage; // 받은 데미지는 객체의 hp에서 깍인다
//            System.out.println(name + "이(가) " + damage + "의 피해를 입었다! 💢"); // 발동시 프린트될 내용
//        }
//    }
//
//    class Monster {
//        String name;
//        int hp;
//
//        void counterAttack(Warrior target) {
//            System.out.println(name + "이(가) 반격했다! 👊");
//            target.damaged(10);
//        }
//    }
//
//    public class GameMain {
//        public static void main(String[] args) {
//            Warrior w1 = new Warrior();
//            w1.name = "전사A";
//            w1.hp = 100;
//
//            Monster m1 = new Monster();
//            m1.name = "고블린";
//            m1.hp = 30;
//
//            w1.attack(m1);
//            m1.counterAttack(w1);
//        }
//    }
