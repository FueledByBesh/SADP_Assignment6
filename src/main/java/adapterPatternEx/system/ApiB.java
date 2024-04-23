package adapterPatternEx.system;

public class ApiB {
    public ApiBData getWeather(String location) {
        // Simulated response from API B
        double temperatureFahrenheit = 68.0; // in Fahrenheit
        double humidity = 45.0; // in percentage
        double windSpeed = 10.0; // in km/h
        double pressure = 1023.5; // in hPa

        return new ApiBData(temperatureFahrenheit, humidity, windSpeed, pressure);
    }
}
