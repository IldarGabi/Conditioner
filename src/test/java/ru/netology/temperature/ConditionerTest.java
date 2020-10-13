package ru.netology.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(18);
        long expected = 17;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(25);
        long expected = 25;
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void CurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(1000);
        long expected = 25;
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void CurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(1);
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
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }
}
