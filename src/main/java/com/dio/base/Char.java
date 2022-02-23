package com.dio.base;

import lombok.Getter;
import lombok.Setter;

public abstract class Char {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int hp;
    @Getter @Setter
    private int attackPower;

    public void attack(Item weapon, Char enemy){
        System.out.printf("%s attacks!", this.name);
        enemy.hp -= this.attackPower + weapon.getPower();
    };
    public void takesDamage(int damage) {
        this.hp -= damage;
    }
    public void heal(Item item) {
        System.out.printf("%s heals! %s", this.name, item.usePhrase(this));
        this.hp += item.getPower();
    };

    public abstract void special();
}
