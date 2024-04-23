package adapterPatternEx.system;

public class ApiBAdapter implements WeatherService {
    private ApiB apiB;

    public ApiBAdapter(ApiB apiB) {
        this.apiB = apiB;
    }

    @Override
    public WeatherData getWeatherData(String location) {
        ApiBData data = apiB.getWeather(location);
        double celsius = (data.getTemperatureFahrenheit() - 32) * 5 / 9;
        return new WeatherData(celsius, data.getHumidity(), data.getWindSpeed());
    }
}
