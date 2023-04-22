package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.scenes.GameLevels;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;

public class Virus extends Enemy {
    public Virus(Coordinate2D initialLocation, BossRush bossRush) {
        super(initialLocation, 10, 4, "sprites/virus.png", bossRush);

        setMotion(moveSpeed, Direction.LEFT);
        setRotationSpeed(.2);
        applyRotation();

        GameLevels.currentLevel = 2;
    }
}
