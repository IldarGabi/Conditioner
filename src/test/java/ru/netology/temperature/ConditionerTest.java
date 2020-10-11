package ru.netology.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.currentTemperature = 19;
        conditioner.minTemperature = 15;
        conditioner.temperatureAfterDecrease = conditioner.decreaseCurrentTemperature();
        System.out.println(conditioner.temperatureAfterDecrease);
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.currentTemperature = 19;
        conditioner.maxTemperature = 25;
        conditioner.temperatureAfterIncrease = conditioner.increaseCurrentTemperature();
        System.out.println(conditioner.temperatureAfterIncrease);
    }
}
