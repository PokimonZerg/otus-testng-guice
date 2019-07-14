package ru.otus.qa;

import java.util.Random;

public class RandomGenerator implements IRandomGenerator {

    public Integer getRandomNumber() {
        return new Random().nextInt();
    }
}
