package com.simplegame;

public class Player2 extends Player1{

    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.armour = armour;
    }

    @Override
    public void damagedByGun1() {
        if (armour){
            this.health -= 20;
            if (this.health <= 0) this.health=0;
            System.out.println("Armour is on and got hit by Gun 1. Health is reduced by 20. " +
                    "New Health is " + this.health);
        }

        if (!armour){
            this.health -= 30;
            if (this.health <= 0) this.health=0;
            System.out.println("Armour is on and got hit by Gun 1. Health is reduced by 30. " +
                    "New Health is " + this.health);
        }

        if(this.health == 0){
            System.out.println("Player: " + getName() + " is dead");
        }
    }


    @Override
    public void damagedByGun2() {

        if (armour){
            this.health -= 40;
            if (this.health <= 0) this.health=0;
            System.out.println("Armour is on and got hit by Gun 2. Health is reduced by 40. " +
                    "New Health is " + this.health);
        }

        if (!armour){
            this.health -= 50;
            if (this.health <= 0) this.health=0;
            System.out.println("Armour is on and got hit by Gun 2. Health is reduced by 50. " +
                    "New Health is " + this.health);
        }

        if(this.health == 0){
            System.out.println("Player: " + getName() + " is dead");
        }


    }

    @Override
    public void heal() {
        super.heal();
    }

}
