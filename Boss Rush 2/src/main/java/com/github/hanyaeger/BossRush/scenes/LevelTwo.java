package com.github.hanyaeger.BossRush.scenes;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.enemies.Tentacle;
import com.github.hanyaeger.BossRush.entities.enemies.Virus;
import com.github.hanyaeger.BossRush.entities.enemies.spawners.VirusAttackSpawner;
import com.github.hanyaeger.api.Coordinate2D;

public class LevelTwo extends GameLevels {

    public LevelTwo(BossRush bossRush){
        super(bossRush);
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
