package creators;

import products.Enemy;
import products.Goblin;

public class CaveSpawner extends EnemySpawner {

    @Override
    public Enemy createEnemy() {
        return new Goblin();
    }
}
