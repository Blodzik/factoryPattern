package products;

public class Goblin implements Enemy {

    public Goblin() {}
    @Override
    public void appear() {
        System.out.println("Goblin appears");
    }

    @Override
    public void attack() {
        System.out.println("Goblin attacks");
    }
}
