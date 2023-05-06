package com.github.hanyaeger.BossRush.entities.spawners;

import java.util.Random;

public class TentacleAttackSpawner extends EnemyAttackSpawner {

    public TentacleAttackSpawner() {
        super(1750);
    }

    @Override
    protected void spawnEntities() {
        if (new Random().nextInt(2) == 1){
           tentacleAttackPatternOne();
        } else{
            tentacleAttackPatternTwo();
        }
    }


}
