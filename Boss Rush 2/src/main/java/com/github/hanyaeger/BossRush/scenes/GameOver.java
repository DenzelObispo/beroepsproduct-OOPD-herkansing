package com.github.hanyaeger.BossRush.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.buttons.QuitButton;
import com.github.hanyaeger.BossRush.entities.buttons.RetryButton;
import com.github.hanyaeger.BossRush.entities.text.GameOverText;

public class GameOver extends StaticScene {
    private BossRush bossRush;

    public GameOver(BossRush bossRush){
        this.bossRush = bossRush;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background.png");
    }

    @Override
    public void setupEntities() {
        addEntity(new GameOverText(new Coordinate2D(getWidth() / 2, 100)));
        addEntity(new RetryButton(new Coordinate2D(getWidth() / 2, 350), bossRush));
        addEntity(new QuitButton(new Coordinate2D(getWidth() / 2, 450), bossRush));

    }
}
