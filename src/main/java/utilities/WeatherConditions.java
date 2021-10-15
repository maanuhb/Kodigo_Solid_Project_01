package utilities;

import Interfaces.iAirport.IWeatherConditions;

public class WeatherConditions implements IWeatherConditions {
    private int temperature;
    private String[] weather = {"sunny", "light rain", "Cloudy", "Foggy",
            "heavy rain", "thunderstorm", "Windy"};
    private String[] windDirection = new String[]{"North wind", "Northeast wind", "East wind", "Southeastern wind",
            "South wind", "Southwest wind", "West wind", "Northwest wind"};

    @Override
    public String weatherconditions() {
        String weatherConditions;
        int index = (int) (Math.random() * weather.length);
        switch (weather[index]) {
            case "Sunny":
                temperature = (int) (Math.random() * (35 - 25) + 25);
                weatherConditions = "Sunny" + " " + temperature + " °C, ";
                break;
            case "light rain":
                temperature = (int) (Math.random() * (25 - 20) + 20);
                weatherConditions = "Light rain" + " " + temperature + " °C, ";
                break;
            case "Cloudy":
                temperature = (int) (Math.random() * (25 - 20) + 20);
                weatherConditions = "Cloudy" + " " + temperature + " °C, ";
                break;
            case "Foggy":
                temperature = (int) (Math.random() * (20 - 15) + 15);
                weatherConditions = "Foggy" + " " + temperature + " °C, ";
                break;
            case "heavy rain":
                temperature = (int) (Math.random() * (22 - 15) + 15);
                weatherConditions = "Heavy rain" + " " + temperature + " °C, ";
                break;
            case "thunderstorm":
                temperature = (int) (Math.random() * (22 - 15) + 15);
                weatherConditions = "Thunderstorm" + " " + temperature + " °C, ";
                break;
            case "Windy":
                temperature = (int) (Math.random() * (20 - 15) + 15);
                weatherConditions = "Windy" + " " + temperature + " °C, ";
            default:
                temperature = (int) (Math.random() * (35 - 28) + 28);
                weatherConditions = "Sunny" + " " + temperature + " °C, ";

        }

        index = (int) (Math.random() * windDirection.length);
        weatherConditions += windDirection[index];
        return weatherConditions;
    }
}