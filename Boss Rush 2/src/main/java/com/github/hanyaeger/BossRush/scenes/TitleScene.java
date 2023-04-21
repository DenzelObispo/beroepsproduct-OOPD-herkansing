package com.github.hanyaeger.BossRush.scenes;

import com.github.hanyaeger.BossRush.entities.buttons.QuitButton;
import com.github.hanyaeger.BossRush.entities.buttons.StartButton;
import com.github.hanyaeger.BossRush.entities.text.TitleText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.BossRush.BossRush;


public class TitleScene extends StaticScene {

    private BossRush bossRush;

    public TitleScene(BossRush bossRush){
        this.bossRush = bossRush;
    }

    @Override
    public void setupScene(){
        //setBackgroundAudio("");
        setBackgroundImage("backgrounds/background.png");
    }

    @Override
    public void setupEntities(){
        addEntity(new TitleText(new Coordinate2D(getWidth() / 2, 100)));
        addEntity(new StartButton(new Coordinate2D(getWidth() / 2, 350),bossRush ));
        addEntity(new QuitButton(new Coordinate2D(getWidth() / 2, 450), bossRush));
    }
}
