package ru.netology.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(14);
        long expected = 15;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected,conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(40);
        long expected = 25;
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }
}
