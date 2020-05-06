package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }
    public String toString()
    {
        return String.valueOf(this.getValue()) + " F";
    }

    @Override
    public Temperature toCelsius() {
        return new Fahrenheit((float)(((this.getValue() - 32)*5)/9));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }
}
