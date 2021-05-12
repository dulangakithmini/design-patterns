package Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    String name;

    public StatisticsDisplay(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Temperature = " + temperature + " F, Humidity = " + humidity + " %");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println(name);

        display();
    }
}
