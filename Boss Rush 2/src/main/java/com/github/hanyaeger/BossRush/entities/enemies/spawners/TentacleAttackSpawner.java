package com.github.hanyaeger.BossRush.entities.enemies.spawners;

import com.github.hanyaeger.BossRush.entities.enemies.Enemy;
import com.github.hanyaeger.BossRush.entities.enemies.EnemyProjectile;
import com.github.hanyaeger.BossRush.scenes.GameLevels;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;


import java.util.Random;

public class TentacleAttackSpawner extends EntitySpawner {

    public TentacleAttackSpawner(long intervalInMs) {
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

    private void tentacleAttackPatternOne(){
        spawn(new EnemyProjectile(new Coordinate2D(100,0), 0d));
        spawn(new EnemyProjectile(new Coordinate2D(375,0), 0d));
        spawn(new EnemyProjectile(new Coordinate2D(650,0), 0d));

        spawn(new EnemyProjectile(new Coordinate2D(237.5,750), 180d));
        spawn(new EnemyProjectile(new Coordinate2D(512.5,750), 180d));
    }

    private void tentacleAttackPatternTwo( ){
        Coordinate2D position = Enemy.enemyPosition;

        spawn(new EnemyProjectile(position, 0d));
        spawn(new EnemyProjectile(position, 45d));
        spawn(new EnemyProjectile(position, 315d));
        spawn(new EnemyProjectile(position, 22.5d));
        spawn(new EnemyProjectile(position, 337.5));
    }
}
