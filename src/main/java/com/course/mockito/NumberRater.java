package com.course.mockito;

import java.util.Random;
import java.util.random.RandomGenerator;

//@RequiredArgsConstructor
public class NumberRater {
    private final RandomGenerator randomNumberProvider;

    public NumberRater(RandomGenerator randomNumberProvider) {
        this.randomNumberProvider = randomNumberProvider;
    }

    public String rateRandomNumber() {
        int randomNumber = randomNumberProvider.nextInt(1, 100);
        if (randomNumber < 30) {
            return "SMALL";
        } else if (randomNumber < 80) {
            return "MEDIUM";
        } else {
            return "BIG";
        }
    }
}
