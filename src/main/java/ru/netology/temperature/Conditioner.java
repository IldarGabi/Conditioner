package ru.netology.temperature;

public class Conditioner {
    private long maxTemperature = 25;
    private long minTemperature = 16;
    private long currentTemperature;

    public long getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(long currentTemperature) {
        if (currentTemperature > maxTemperature) {
            currentTemperature = maxTemperature;
        }
        if (currentTemperature < minTemperature) {
            currentTemperature = minTemperature;
        }
        this.currentTemperature = currentTemperature;
    }

    void decreaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        --currentTemperature;
    }

    void increaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return;
        }
        ++currentTemperature;
    }
}

