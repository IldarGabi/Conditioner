package ru.netology.temperature;

public class Conditioner {
    private long maxTemperature;
    private long minTemperature;
    private long currentTemperature;

    public long getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(long maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public long getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(long minTemperature) {
        this.minTemperature = minTemperature;
    }

    public long getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(long currentTemperature) {
        this.currentTemperature=currentTemperature;
    }

    long decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature)
            return currentTemperature = minTemperature;
        if (currentTemperature > minTemperature)
            return --currentTemperature;

        return currentTemperature;
    }

    long increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature)
            return currentTemperature = maxTemperature;
        if (currentTemperature < maxTemperature)
            return ++currentTemperature;

        return currentTemperature;
    }

}

