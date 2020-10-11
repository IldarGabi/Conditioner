package ru.netology.temperature;

public class Conditioner {
    long maxTemperature;
    long minTemperature;
    long currentTemperature;
    long temperatureAfterIncrease;
    long temperatureAfterDecrease;

    long decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature)
            return temperatureAfterDecrease = --currentTemperature;
        if (currentTemperature == minTemperature)
            return temperatureAfterDecrease = currentTemperature;
        return temperatureAfterDecrease;
    }

    long increaseCurrentTemperature() {
        if (currentTemperature < maxTemperature)
            return temperatureAfterIncrease = ++currentTemperature;
        if (currentTemperature == maxTemperature)
            return temperatureAfterIncrease = currentTemperature;
        return temperatureAfterIncrease;
    }
}

