package com.course.mockito;

import java.util.random.RandomGenerator;

public class MySuperRandomProvider implements RandomGenerator {
    @Override
    public long nextLong() {
        return 0;
    }
}
