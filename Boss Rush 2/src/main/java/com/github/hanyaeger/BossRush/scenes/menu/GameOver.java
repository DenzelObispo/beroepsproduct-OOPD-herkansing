package com.github.hanyaeger.BossRush.scenes.menu;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.text.GameOverText;

public class GameOver extends MenuScene {

    public GameOver(BossRush bossRush){
        super(bossRush);
    }

    @Override
    public void setupEntities() {
        super.setupEntities();

        addEntity(new GameOverText(new Coordinate2D(getWidth() / 2, 100)));
    }
}
