package adapterPatternEx.app;

import adapterPatternEx.system.*;

import java.util.*;

public class WeatherApplication {

    public static void main(String[] args) {

        ApiA apiA = new ApiA();
        ApiB apiB = new ApiB();

        // Create adapters for each API
        WeatherService apiAAdapter = new ApiAAdapter(apiA);
        WeatherService apiBAdapter = new ApiBAdapter(apiB);

        // Create WeatherClient instances using the adapters
        WeatherClient clientA = new WeatherClient(apiAAdapter);
        WeatherClient clientB = new WeatherClient(apiBAdapter);

        // Simulate fetching and displaying weather data for a location
        System.out.println("Weather Data from API A:");
        clientA.displayWeather("New York");

        System.out.println("\nWeather Data from API B:");
        clientB.displayWeather("Los Angeles");

    }
}
