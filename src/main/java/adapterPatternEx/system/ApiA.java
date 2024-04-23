package adapterPatternEx.system;

public class ApiA {
    public ApiAData getWeather(String location) {
        // Simulated response from API A
        double temperature = 20.0; // in Celsius
        double humidity = 50.0; // in percentage
        double windSpeed = 15.0; // in km/h

        return new ApiAData(temperature, humidity, windSpeed);
    }
}

