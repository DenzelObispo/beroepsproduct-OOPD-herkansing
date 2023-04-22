package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.scenes.levels.GameLevel;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;

public class Tentacle extends Enemy {
    public Tentacle(Coordinate2D initialLocation, BossRush bossRush) {
        super(initialLocation, 75, 2, "sprites/tentacle.png", bossRush);

        setMotion(moveSpeed, Direction.LEFT);
        GameLevel.currentLevel = 1;
    }
}
