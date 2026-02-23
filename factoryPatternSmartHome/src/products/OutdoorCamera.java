package products;

public class OutdoorCamera implements Camera {
    private final boolean isNightTime;

    public OutdoorCamera(boolean isNightTime) {
        this.isNightTime = isNightTime;
    }

    @Override
    public boolean turnOn() {
        System.out.println("Outdoor Camera booting up...");
        if(isNightTime) {
            System.out.println("Activating Infrared Night Vision mode");
        }
        return true;
    }

    @Override
    public void record() {
        System.out.println("Recording garden activity...");
    }

    @Override
    public void turnOff() {
        System.out.println("Outdoor Camera entering sleep mode.");
    }
}
