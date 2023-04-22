package com.github.hanyaeger.BossRush.scenes.levels;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.enemies.CyclopsEnemy;
import com.github.hanyaeger.BossRush.entities.spawners.CyclopsAttackSpawner;
import com.github.hanyaeger.api.Coordinate2D;

public class LevelThree extends GameLevelController {

    public LevelThree(BossRush bossRush){
        super(bossRush);
    }
    public void setupScene() {
        super.setupScene();

        setBackgroundAudio("audio/LevelThree.mp3");
    }

    public void setupEntities() {
        super.setupEntities();

        addEntity(new CyclopsEnemy(new Coordinate2D(getWidth() / 2 - 24 ,100), bossRush));
    }
    public void setupEntitySpawners(){
        super.setupEntitySpawners();

        CyclopsAttackSpawner attackSpawner = new CyclopsAttackSpawner();
        addEntitySpawner(attackSpawner);
    }

}
