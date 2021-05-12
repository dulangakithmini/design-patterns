package Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: Temperature = " + temperature + " F, Humidity = " + humidity + " %, Pressure = " + pressure + " Pa");
    }
}
