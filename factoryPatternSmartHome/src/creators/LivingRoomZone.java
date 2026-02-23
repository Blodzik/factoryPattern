package creators;

import products.Camera;
import products.IndoorCamera;

public class LivingRoomZone extends SecurityZone {
    private String password;

    public LivingRoomZone(String password) {
        this.password = password;
    }

    @Override
    protected Camera setupCamera() {
        return new IndoorCamera(password);
    }
}
