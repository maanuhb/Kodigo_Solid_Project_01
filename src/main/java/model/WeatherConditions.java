package model;


public class WeatherConditions  {
    private int temperature;
    private String[] weather = {"sunny", "light rain", "Cloudy", "Foggy",
            "heavy rain", "thunderstorm", "Windy"};
    private String[] windDirection = new String[]{"North wind", "Northeast wind", "East wind", "Southeastern wind",
            "South wind", "Southwest wind", "West wind", "Northwest wind"};
    String weatherConditions;
    public void Sunny() {
        temperature = (int) (Math.random() * (35 - 25) + 25);
        weatherConditions = "Sunny" + " " + temperature + " °C, ";
    }

    public void LightRain(){
        temperature = (int) (Math.random() * (25 - 20) + 20);
        weatherConditions = "Light rain" + " " + temperature + " °C, ";
    }
    public void Cloudy(){
        temperature = (int) (Math.random() * (25 - 20) + 20);
        weatherConditions = "Cloudy" + " " + temperature + " °C, ";
    }
    public void Foggy(){
        temperature = (int) (Math.random() * (20 - 15) + 15);
        weatherConditions = "Foggy" + " " + temperature + " °C, ";
    }
    public void HeavyRain(){
        temperature = (int) (Math.random() * (22 - 15) + 15);
        weatherConditions = "Heavy rain" + " " + temperature + " °C, ";
    }
    public void Thunderstorm(){
        temperature = (int) (Math.random() * (22 - 15) + 15);
        weatherConditions = "Thunderstorm" + " " + temperature + " °C, ";
    }
    public void Windy(){
        temperature = (int) (Math.random() * (20 - 15) + 15);
        weatherConditions = "Windy" + " " + temperature + " °C, ";
    }
}