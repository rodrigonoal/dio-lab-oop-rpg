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
    public int attack(Item weapon) {
        if (this.hidden) {
            this.hidden  = false;
            System.out.printf("%s strikes from the shadows!", this.getName());
            return (this.getAttackPower() * 2) + weapon.getPower();
        } else {
            System.out.printf("%s attacks!", this.getName());
            return this.getAttackPower() + weapon.getPower();
        }
    };
}
