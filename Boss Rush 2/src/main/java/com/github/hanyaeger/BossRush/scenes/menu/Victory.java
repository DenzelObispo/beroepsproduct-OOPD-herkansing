package com.github.hanyaeger.BossRush.scenes.menu;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.text.VictoryText;

public class Victory extends MenuScene {

    public Victory(BossRush bossRush){
        super(bossRush);
    }

    @Override
    public void setupEntities() {
        super.setupEntities();
        addEntity(new VictoryText(new Coordinate2D(getWidth() / 2, 100)));
    }
}
