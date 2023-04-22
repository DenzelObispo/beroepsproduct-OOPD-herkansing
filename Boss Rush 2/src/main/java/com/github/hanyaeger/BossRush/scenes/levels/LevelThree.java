package com.github.hanyaeger.BossRush.scenes.levels;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.enemies.Cyclops;
import com.github.hanyaeger.BossRush.entities.spawners.CyclopsAttackSpawner;
import com.github.hanyaeger.api.Coordinate2D;

public class LevelThree extends GameLevel {
    private BossRush bossRush;

    public LevelThree(BossRush bossRush){
        super(bossRush);
        this.bossRush = bossRush;

        GameLevel.currentLevel = 3;
    }
    public void setupScene() {
        super.setupScene();

        setBackgroundAudio("audio/LevelThree.mp3");
    }

    public void setupEntities() {
        super.setupEntities();

        addEntity(new Cyclops(new Coordinate2D(getWidth() / 2 - 24 ,100), bossRush));
    }
    public void setupEntitySpawners(){
        super.setupEntitySpawners();

        CyclopsAttackSpawner attackSpawner = new CyclopsAttackSpawner(1250);
        addEntitySpawner(attackSpawner);
    }

}
