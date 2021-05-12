package Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay("Current Condition");
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay("Statistics");

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);

        weatherData.setMeasurements(100, 20, 25);

        weatherData.removeObserver(currentConditionsDisplay);

        System.out.println("After unsubscribing Current Conditions Display");
        weatherData.setMeasurements(120, 30, 35);
    }
}
