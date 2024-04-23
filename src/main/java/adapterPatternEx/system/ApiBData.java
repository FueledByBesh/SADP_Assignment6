package adapterPatternEx.system;

public class ApiBData {
    private double temperatureFahrenheit;
    private double humidity;
    private double windSpeed;
    private double pressure;

    public ApiBData(double temperatureFahrenheit, double humidity, double windSpeed, double pressure) {
        this.temperatureFahrenheit = temperatureFahrenheit;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getPressure() {
        return pressure;
    }
}