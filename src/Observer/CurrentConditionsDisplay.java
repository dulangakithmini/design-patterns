package Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    String name;

    public CurrentConditionsDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println(name);

        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature = " + temperature + " F, Humidity = " + humidity + " %, Pressure = " + pressure + " Pa");
    }
}
