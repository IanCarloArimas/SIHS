
interface HomeService {
    void turnOn();
    void turnOff();
}


class Light implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Lights are turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights are turned OFF.");
    }
}

class TV implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioning is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioning is turned OFF.");
    }
}


class HomeInterface {
    private final HomeService light;
    private final HomeService tv;
    private final HomeService ac;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.ac = new AirConditioning();
    }

    public void turnOnAll() {
        System.out.println("\n--- Turning On All Services ---");
        light.turnOn();
        tv.turnOn();
        ac.turnOn();
    }

    public void turnOffAll() {
        System.out.println("\n--- Turning Off All Services ---");
        light.turnOff();
        tv.turnOff();
        ac.turnOff();
    }
}


public class HomeApp {
    public static void main(String[] args) {

        HomeInterface homeInterface = new HomeInterface();

        homeInterface.turnOnAll();
        homeInterface.turnOffAll();
    }
}