package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.scenes.levels.GameLevelController;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;

public class TentacleEnemy extends EnemyController {
    public TentacleEnemy(Coordinate2D initialLocation, BossRush bossRush) {
        super(initialLocation, 75, 2, "sprites/tentacle.png", bossRush);

        setMotion(moveSpeed, Direction.LEFT);
        GameLevelController.currentLevel = 1;
    }
}
