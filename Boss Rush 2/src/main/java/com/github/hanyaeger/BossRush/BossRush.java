package com.github.hanyaeger.BossRush;

import com.github.hanyaeger.BossRush.scenes.TitleScene;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class BossRush extends YaegerGame {
    private final String GAME_NAME = "Boss Rush 2";
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void setupScenes(){
        addScene(0, new TitleScene(this));
    }

    @Override
    public void setupGame() {
        setGameTitle(GAME_NAME);
        setSize(new Size(750, 750));
    }
}
