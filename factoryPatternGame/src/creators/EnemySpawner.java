package creators;

import products.Enemy;

public abstract class EnemySpawner {

    public Enemy spawn() {
        Enemy enemy = createEnemy();
        enemy.appear();
        enemy.attack();
        return enemy;
    }

    protected abstract Enemy createEnemy();
}
