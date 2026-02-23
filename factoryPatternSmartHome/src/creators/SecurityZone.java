package creators;

import products.Camera;

public abstract class SecurityZone {

    public void detectMotion() {
        System.out.println("🚨 Motion detected in zone!");

        Camera camera = setupCamera();

        boolean isConnected = camera.turnOn();

        if (isConnected) {
            camera.record();
        } else {
            System.out.println("CRITICAL: Camera malfunction. Dispatching security guard!");
        }

        camera.turnOff();
    }
    protected abstract Camera setupCamera();
}
