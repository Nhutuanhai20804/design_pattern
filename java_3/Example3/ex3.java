package Example3;

public class ex3 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        forecastDisplay forecastDisplays=new forecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
