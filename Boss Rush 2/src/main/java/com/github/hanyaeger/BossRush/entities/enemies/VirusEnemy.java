package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.scenes.levels.GameLevelController;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;

public class VirusEnemy extends EnemyController {
    public VirusEnemy(Coordinate2D initialLocation, BossRush bossRush) {
        super(initialLocation, 100, 3, "sprites/virus.png", bossRush);

        setMotion(moveSpeed, Direction.DOWN);
        setRotationSpeed(.2);
        applyRotation();

        GameLevelController.currentLevel = 2;
    }
}
