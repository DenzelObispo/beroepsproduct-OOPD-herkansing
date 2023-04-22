package com.github.hanyaeger.BossRush.scenes.levels;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.enemies.VirusEnemy;
import com.github.hanyaeger.BossRush.entities.spawners.VirusAttackSpawner;
import com.github.hanyaeger.api.Coordinate2D;

public class LevelTwo extends GameLevelController {

    public LevelTwo(BossRush bossRush){
        super(bossRush);
    }

    public void setupScene() {
        super.setupScene();

        setBackgroundAudio("audio/LevelTwo.mp3");
    }

    public void setupEntities() {
        super.setupEntities();

        addEntity(new VirusEnemy(new Coordinate2D(getWidth() / 2 - 24 ,100), bossRush));
    }

    public void setupEntitySpawners(){
        super.setupEntitySpawners();

        VirusAttackSpawner attackSpawner = new VirusAttackSpawner();
        addEntitySpawner(attackSpawner);
    }
}
