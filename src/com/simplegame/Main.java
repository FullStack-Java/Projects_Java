package com.simplegame;

public class Main {
    public static void main(String[] args) {

        Player1 player1 = new Player1("Santa", "sword", 100);

//        System.out.println(player1.getName());
//        System.out.println(player1.getWeapon());
//        System.out.println(player1.getHealth());

        player1.damagedByGun1();
        System.out.println(player1.getHealth());
        player1.heal();


    }
}
