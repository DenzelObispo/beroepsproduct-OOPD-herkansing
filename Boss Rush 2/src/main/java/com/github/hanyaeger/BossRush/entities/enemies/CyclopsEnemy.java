package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.scenes.levels.GameLevelController;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;

public class CyclopsEnemy extends EnemyController {
    public CyclopsEnemy(Coordinate2D initialLocation, BossRush bossRush) {
        super(initialLocation, 150, 5, "sprites/cyclops.png", bossRush);

        setMotion(moveSpeed, Direction.RIGHT);
        setRotationSpeed(.75);
        applyRotation();

        GameLevelController.currentLevel = 3;
    }
}
