package com.github.hanyaeger.BossRush.scenes;

import com.github.hanyaeger.BossRush.entities.Player;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

public abstract class Levels extends DynamicScene {

    public Levels(){

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background.png");
    }

    @Override
    public void setupEntities() {
        addEntity(new Player(new Coordinate2D(getWidth() / 2 - 24 ,610)));
    }

}
