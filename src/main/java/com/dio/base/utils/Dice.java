package com.dio.base.utils;

import java.util.Random;

public class Dice {
    Random generator = new Random();

    int roll(int faces) {
        return generator.nextInt(faces) + 1;
    }
}
