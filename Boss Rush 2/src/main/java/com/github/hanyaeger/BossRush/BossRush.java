package com.github.hanyaeger.BossRush;

import com.github.hanyaeger.BossRush.scenes.levels.LevelOne;
import com.github.hanyaeger.BossRush.scenes.levels.LevelThree;
import com.github.hanyaeger.BossRush.scenes.levels.LevelTwo;
import com.github.hanyaeger.BossRush.scenes.menu.GameOverScene;
import com.github.hanyaeger.BossRush.scenes.menu.TitleScene;
import com.github.hanyaeger.BossRush.scenes.menu.VictoryScene;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class BossRush extends YaegerGame {
    private final String GAME_NAME = "Boss Rush 2";
    private final Size SCREEN_SIZE = new  Size(750, 750);
    public static final int TITLE_SCREEN = 0;
    public static final int LEVEL_ONE = 1;
    public static final int LEVEL_TWO = 2;
    public static final int LEVEL_THREE = 3;
    public static final int GAME_OVER_SCREEN = 4;
    public static final int VICTORY_SCREEN = 5;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void setupScenes(){
        addScene(TITLE_SCREEN, new TitleScene(this));
        addScene(LEVEL_ONE, new LevelOne(this));
        addScene(LEVEL_TWO, new LevelTwo(this));
        addScene(LEVEL_THREE, new LevelThree(this));
        addScene(GAME_OVER_SCREEN, new GameOverScene(this));
        addScene(VICTORY_SCREEN, new VictoryScene(this));
    }

    @Override
    public void setupGame() {
        setGameTitle(GAME_NAME);
        setSize(SCREEN_SIZE);
    }
}
