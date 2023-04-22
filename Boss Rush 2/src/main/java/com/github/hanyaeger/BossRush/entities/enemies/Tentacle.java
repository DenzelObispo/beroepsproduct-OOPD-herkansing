package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.entities.sprites.TentacleSprite;
import com.github.hanyaeger.BossRush.scenes.GameLevels;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;

public class Tentacle extends Enemy {
    public Tentacle(Coordinate2D initialLocation) {
        super(initialLocation, 1000, 2);

        setMotion(moveSpeed, Direction.LEFT);
    }

    @Override
    protected void setupEntities() {
        GameLevels.currentLevel = 1;

        var tentacleSprite = new TentacleSprite(new Coordinate2D(0,0));
        addEntity(tentacleSprite);
    }
}
