package com.dio.base.characters;

import com.dio.base.*;

public class Rogue extends Char {
    Boolean hidden;

    @Override
    public void special() {
        this.hidden = true;
        System.out.printf("%s disappears into the darkness...", this.getName());
    }

    @Override
    public void attack(Item weapon, Char enemy) {
        int damage;

        if (this.hidden) {
            this.hidden = false;
            System.out.printf("%s strikes from the shadows!!!", this.getName());
            damage = this.getAttackPower() * 2 + weapon.getPower();
        } else {
            System.out.printf("%s attacks!", this.getName());
            damage = this.getAttackPower() + weapon.getPower();
        }
        enemy.takesDamage(damage);
    };

    @Override
    public void takesDamage(int damage) {
        if(this.hidden) {
            System.out.printf("%s can't be seen anywhere...", this.getName());
        } else {
            System.out.printf("%s has been hit!", this.getName());
            this.setHp(getHp() - damage);
        }
    }
}
