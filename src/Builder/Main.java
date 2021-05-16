package Builder;

public class Main {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setBattery(3000).setOs("Windows").getPhone();
        System.out.println(phone);
    }
}
