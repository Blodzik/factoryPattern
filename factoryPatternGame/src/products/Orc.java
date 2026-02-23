package products;

public class Orc implements Enemy {

    public Orc() {}
    @Override
    public void appear() {
        System.out.println("Orc appears");
    }

    @Override
    public void attack() {
        System.out.println("Orc attacks");
    }
}
