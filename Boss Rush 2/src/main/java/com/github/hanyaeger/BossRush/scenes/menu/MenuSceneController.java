package com.github.hanyaeger.BossRush.scenes.menu;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.buttons.QuitButton;
import com.github.hanyaeger.BossRush.entities.buttons.RetryButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public abstract class MenuSceneController extends StaticScene {

    public BossRush bossRush;
    public MenuSceneController(BossRush bossRush){
        this.bossRush = bossRush;
    }

    @Override
    public void setupScene(){
        setBackgroundImage("backgrounds/background.png");
        setBackgroundAudio("audio/main.mp3");
    }

    @Override
    public void setupEntities(){
        addEntity(new RetryButton(new Coordinate2D(getWidth() / 2, 350), bossRush));
        addEntity(new QuitButton(new Coordinate2D(getWidth() / 2, 450), bossRush));
    }
}
