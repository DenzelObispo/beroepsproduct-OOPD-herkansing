package com.github.hanyaeger.BossRush.scenes.levels;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.enemies.TentacleEnemy;
import com.github.hanyaeger.BossRush.entities.spawners.TentacleAttackSpawner;
import com.github.hanyaeger.api.Coordinate2D;

public class LevelOne extends GameLevelController {

    public LevelOne(BossRush bossRush){
        super(bossRush);
    }

    @Override
    public void setupScene() {
        super.setupScene();

        setBackgroundAudio("audio/LevelOne.mp3");
    }

    public void setupEntities() {
        super.setupEntities();

        addEntity(new TentacleEnemy(new Coordinate2D(getWidth() / 2 - 24 ,100), bossRush));
    }

    public void setupEntitySpawners() {
        super.setupEntitySpawners();

        TentacleAttackSpawner attackSpawner = new TentacleAttackSpawner();
        addEntitySpawner(attackSpawner);
    }
}
