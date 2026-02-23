import creators.GardenZone;
import creators.LivingRoomZone;
import creators.SecurityZone;

public class Main {
    public static void main(String[] args) {
        SecurityZone livingRoom = new LivingRoomZone("admin123");
        SecurityZone hackerRoom = new LivingRoomZone("wrong_pass");
        SecurityZone garden = new GardenZone(23);

        System.out.println("--- Test 1: Normal Living Room ---");
        livingRoom.detectMotion();

        System.out.println("\n--- Test 2: Hacked Wi-Fi ---");
        hackerRoom.detectMotion();

        System.out.println("\n--- Test 3: Midnight Garden ---");
        garden.detectMotion();
    }
}