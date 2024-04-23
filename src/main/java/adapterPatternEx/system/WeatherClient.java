package adapterPatternEx.system;

public class WeatherClient {
    private WeatherService weatherService;

    public WeatherClient(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public void displayWeather(String location) {
        WeatherData data = weatherService.getWeatherData(location);
        System.out.println("Temperature: " + data.getTemperature() + "°C");
        System.out.println("Humidity: " + data.getHumidity() + "%");
        System.out.println("Wind Speed: " + data.getWindSpeed() + " km/h");
    }
}
