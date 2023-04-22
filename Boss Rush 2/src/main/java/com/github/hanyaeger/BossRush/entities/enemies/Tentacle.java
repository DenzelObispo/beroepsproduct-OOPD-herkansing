package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.scenes.GameLevels;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;

public class Tentacle extends Enemy {
    public Tentacle(Coordinate2D initialLocation) {
        super(initialLocation, 1000, 2, "sprites/tentacle.png");

        setMotion(moveSpeed, Direction.LEFT);
        GameLevels.currentLevel = 1;
    }
}
