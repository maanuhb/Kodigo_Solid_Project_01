package model;

public class FacadeWeatherConditions {
    WeatherConditions wc;
    private String weather;
    private String[] weatherArr = {"sunny", "light rain", "Cloudy", "Foggy",
            "heavy rain", "thunderstorm", "Windy"};
    private String[] windDirection = new String[]{"North wind", "Northeast wind", "East wind", "Southeastern wind",
            "South wind", "Southwest wind", "West wind", "Northwest wind"};
    public void FacadeWeatherCondition(){
        wc = new WeatherConditions();
        int index = (int) (Math.random() * weather.length());
        switch (weatherArr[index]) {
            case "Sunny" -> wc.Sunny();
            case "light rain" -> wc.LightRain();
            case "Cloudy" -> wc.Cloudy();
            case "Foggy" -> wc.Foggy();
            case "heavy rain" -> wc.HeavyRain();
            case "thunderstorm" -> wc.Thunderstorm();
            case "Windy" -> wc.Windy();
            default -> wc.Sunny();
        }
        index = (int) (Math.random() * windDirection.length);
        weather += windDirection[index];
    }

    public String getWeatherConditions() {
        this.FacadeWeatherCondition();
        return this.weather;
    }
}
