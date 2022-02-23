package com.dio.base.characters;

import com.dio.base.*;
import com.dio.base.utils.*;

public class Paladin extends Char {
    int bonus = 0;

    @Override
    public void special() {
        int diceroll = Dice.roll(6);

        System.out.printf("%s calls for the graces of the Divines!!!", this.getName());

        if(diceroll < 4){
            bonus = -1 * (diceroll);
            System.out.printf("%s is shielded by holy light", this.getName());
        } else {
            bonus = diceroll;
            System.out.printf("%s weapon glows with the power of the gods!", this.getName());
        }
    }

}
