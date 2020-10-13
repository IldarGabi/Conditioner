package ru.netology.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        long expected = 19;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(24);
        conditioner.increaseCurrentTemperature();
        long expected = 25;
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void CurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(2222);
        long expected = 25;
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void CurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(4);
        long expected = 16;
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void CurrentTemperatureEqualMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(25);
        long expected = 25;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void CurrentTemperatureEqualMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(16);
        long expected = 16;
        conditioner.increaseCurrentTemperature();
                assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }
}
