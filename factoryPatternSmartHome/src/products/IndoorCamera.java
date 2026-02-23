package products;

public class IndoorCamera implements Camera {
    private final String wifiPassword;

    public IndoorCamera(String wifiPassword) {
        this.wifiPassword = wifiPassword;
    }

    @Override
    public boolean turnOn() {
        if(wifiPassword.equals("admin123")) {
            System.out.println("Indoor Camera connected to Wi-Fi");
            return true;
        } else {
            System.out.println("Wi-Fi connection failed!");
            return false;
        }
    }

    @Override
    public void record() {
        System.out.println("Recording living room activity...");
    }

    @Override
    public void turnOff() {
        System.out.println("Indoor Camera entering sleep mode.");
    }

}
