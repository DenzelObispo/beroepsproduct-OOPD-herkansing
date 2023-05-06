package com.github.hanyaeger.BossRush.entities.spawners;

import java.util.Random;

public class VirusAttackSpawner extends EnemyAttackSpawner {

    public VirusAttackSpawner() {
        super(1500);
    }

    @Override
    protected void spawnEntities() {

        if (new Random().nextInt(2) == 1){
           virusAttackPatternOne();
        } else{
            virusAttackPatternTwo();
        }
    }
}
