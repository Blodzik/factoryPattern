package creators;

import products.Camera;
import products.OutdoorCamera;

public class GardenZone extends SecurityZone {
    private int currentHour;

    public GardenZone(int currentHour) {
        this.currentHour = currentHour;
    }

    @Override
    protected Camera setupCamera() {
        boolean isNightTime = (currentHour >= 20 || currentHour <= 4);
        return new OutdoorCamera(isNightTime);
    }
}
