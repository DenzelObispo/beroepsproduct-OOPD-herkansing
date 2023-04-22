package com.github.hanyaeger.BossRush.scenes.levels;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.enemies.Virus;
import com.github.hanyaeger.BossRush.entities.spawners.VirusAttackSpawner;
import com.github.hanyaeger.api.Coordinate2D;

public class LevelTwo extends GameLevel {

    public LevelTwo(BossRush bossRush){
        super(bossRush);
    }

    public void setupScene() {
        super.setupScene();

        setBackgroundAudio("audio/LevelTwo.mp3");
    }

    public void setupEntities() {
        super.setupEntities();

        addEntity(new Virus(new Coordinate2D(getWidth() / 2 - 24 ,100), bossRush));
    }

    public void setupEntitySpawners(){
        super.setupEntitySpawners();

        VirusAttackSpawner attackSpawner = new VirusAttackSpawner(1500);
        addEntitySpawner(attackSpawner);
    }
}
