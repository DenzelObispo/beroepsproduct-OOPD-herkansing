package com.github.hanyaeger.BossRush.scenes.menu;

import com.github.hanyaeger.BossRush.entities.buttons.QuitButton;
import com.github.hanyaeger.BossRush.entities.buttons.StartButton;
import com.github.hanyaeger.BossRush.entities.text.TitleText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.BossRush.BossRush;

public class TitleScene extends MenuSceneController {

    public TitleScene(BossRush bossRush){
        super(bossRush);
    }

    @Override
    public void setupEntities(){
        addEntity(new TitleText(new Coordinate2D(getWidth() / 2, 100)));
        addEntity(new StartButton(new Coordinate2D(getWidth() / 2, 350),bossRush ));
        addEntity(new QuitButton(new Coordinate2D(getWidth() / 2, 450), bossRush));
    }
}
