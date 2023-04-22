package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.scenes.GameLevels;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;

public class Cyclops extends Enemy {
    public Cyclops(Coordinate2D initialLocation, BossRush bossRush) {
        super(initialLocation, 10, 4, "sprites/cyclops.png", bossRush);

        setMotion(moveSpeed, Direction.LEFT);
        setRotationSpeed(.5);
        applyRotation();

        GameLevels.currentLevel = 3;
    }
}
