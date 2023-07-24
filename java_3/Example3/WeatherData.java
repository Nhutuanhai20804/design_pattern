package Example3;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private double Temperature;
    private double Humidity;
    private double Pressure;
    private ArrayList observers;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(Temperature, Humidity, Pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.Temperature = temperature;
        this.Humidity = humidity;
        this.Pressure = pressure;
        measurementsChanged();
    }
}
