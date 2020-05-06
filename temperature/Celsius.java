package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }
    public String toString()
    {
        return String.valueOf(this.getValue()) + " C";
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit((float)(this.getValue()*9/5 + 32.0));
    }
}
