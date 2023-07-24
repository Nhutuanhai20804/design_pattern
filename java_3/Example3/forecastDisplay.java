package Example3;

public class forecastDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public forecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        if (temperature < 15) {
            System.out.println("forecats: it's too cold outside");
        } else if (temperature > 30) {
            System.out.println("forecast: it is very hot outside");
        } else {
            System.out.println("forecast: it is time to go outside");
        }
    }
    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }

}
