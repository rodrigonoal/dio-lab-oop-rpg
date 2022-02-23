package com.dio.base.utils;

import java.util.Random;

public class Dice {
    private static Random generator = new Random();

    public static int roll(int faces) {
        return generator.nextInt(faces) + 1;
    }
}
