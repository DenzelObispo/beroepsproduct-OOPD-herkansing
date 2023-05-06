package com.github.hanyaeger.BossRush.entities.spawners;

import java.util.Random;

public class CyclopsAttackSpawner extends EnemyAttackSpawner {
    public CyclopsAttackSpawner() {
        super(1250);
    }

    @Override
    protected void spawnEntities() {

        if (new Random().nextInt(2) == 1){
            cyclopsAttackPatternOne();
        } else{
            cyclopsAttackPatternTwo();
        }
    }
}
