package com.github.hanyaeger.BossRush.scenes;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.Player;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class LevelOne extends Levels {
    private BossRush bossRush;

    public LevelOne(BossRush bossRush){
        this.bossRush = bossRush;
    }


    public void setupEntities() {
        addEntity(new Player(new Coordinate2D(10,10)));
    }
}
