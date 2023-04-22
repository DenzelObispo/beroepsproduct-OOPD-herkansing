package com.github.hanyaeger.BossRush.scenes;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.enemies.Tentacle;
import com.github.hanyaeger.api.Coordinate2D;

public class LevelOne extends GameLevels {

    public LevelOne(BossRush bossRush){
        super(bossRush);

    }

    public void setupEntities() {
        super.setupEntities();

        addEntity(new Tentacle(new Coordinate2D(getWidth() / 2 - 24 ,100)));
    }
}
