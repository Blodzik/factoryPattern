package creators;

import products.Enemy;
import products.Orc;

public class SwampSpawner extends EnemySpawner {
    @Override
    public Enemy createEnemy() {
        return new Orc();
    }
}
