package Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay("Current Condition");

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.setMeasurements(100, 20, 25);
    }
}
