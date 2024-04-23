package adapterPatternEx.system;

public class ApiAAdapter implements WeatherService {
    private ApiA apiA;

    public ApiAAdapter(ApiA apiA) {
        this.apiA = apiA;
    }

    @Override
    public WeatherData getWeatherData(String location) {
        ApiAData data = apiA.getWeather(location);
        return new WeatherData(data.getTemperature(), data.getHumidity(), data.getWindSpeed());
    }
}
