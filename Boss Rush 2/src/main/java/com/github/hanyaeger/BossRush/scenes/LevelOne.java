package com.github.hanyaeger.BossRush.scenes;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.Player;
import com.github.hanyaeger.BossRush.entities.enemies.Tentacle;
import com.github.hanyaeger.BossRush.entities.text.LevelText;
import com.github.hanyaeger.api.Coordinate2D;

public class LevelOne extends Levels {
    private final int CURRENT_LEVEL = 1;
    private BossRush bossRush;

    public LevelOne(BossRush bossRush){
        this.bossRush = bossRush;


    }


    public void setupEntities() {
        super.setupEntities();

        addEntity(new Tentacle(new Coordinate2D(getWidth() / 2 - 24 ,100)));
        addEntity(new LevelText(new Coordinate2D(new Coordinate2D(getWidth() - 85,5))));
    }
}
