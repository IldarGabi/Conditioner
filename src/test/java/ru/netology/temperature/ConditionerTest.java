package ru.netology.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {
    @Test
        void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.currentTemperature = 20;
        if (conditioner.currentTemperature == conditioner.minTemperature)
            return;
        conditioner.currentTemperature--;
        if (conditioner.currentTemperature == conditioner.minTemperature)
            return;
        conditioner.currentTemperature--;
        if (conditioner.currentTemperature == conditioner.minTemperature)
            return;
        conditioner.currentTemperature--;
        if (conditioner.currentTemperature == conditioner.minTemperature)
            return;
        conditioner.currentTemperature--;
        if (conditioner.currentTemperature == conditioner.minTemperature)
            return;
        conditioner.currentTemperature--;
        System.out.println(conditioner.currentTemperature);
    }

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.currentTemperature = 20;
        if (conditioner.currentTemperature == conditioner.maxTemperature)
            return;
        conditioner.currentTemperature++;
        if (conditioner.currentTemperature == conditioner.maxTemperature)
            return;
        conditioner.currentTemperature++;
        if (conditioner.currentTemperature == conditioner.maxTemperature)
            return;
        conditioner.currentTemperature++;
        if (conditioner.currentTemperature == conditioner.maxTemperature)
            return;
        conditioner.currentTemperature++;
        if (conditioner.currentTemperature == conditioner.maxTemperature)
            return;
        conditioner.currentTemperature++;
        System.out.println(conditioner.currentTemperature);
    }

    @Test
    public void CurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.currentTemperature = 22;
        conditioner.minTemperature = 21;
        if (conditioner.currentTemperature == conditioner.minTemperature) {
            System.out.println(conditioner.currentTemperature);
            return;
        }
        for (conditioner.minTemperature = conditioner.minTemperature; conditioner.minTemperature <= conditioner.currentTemperature; conditioner.currentTemperature--)
            System.out.println(conditioner.currentTemperature);
    }
}
