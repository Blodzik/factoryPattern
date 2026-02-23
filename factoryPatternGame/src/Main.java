import creators.CaveSpawner;
import creators.EnemySpawner;
import creators.SwampSpawner;


public class Main {
    public static void main(String[] args) {
        EnemySpawner goblinSpawner = new CaveSpawner();
        EnemySpawner orcSpawner = new SwampSpawner();

        goblinSpawner.spawn();
        orcSpawner.spawn();
    }
}