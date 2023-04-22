package com.github.hanyaeger.BossRush.entities.spawners;

import com.github.hanyaeger.BossRush.entities.weapon.EnemyProjectile;
import com.github.hanyaeger.BossRush.entities.enemies.Enemy;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;

import java.util.Random;

public class VirusAttackSpawner extends EntitySpawner {

    public VirusAttackSpawner(long intervalInMs) {
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

    private void virusAttackPatternOne( ){
        Coordinate2D position = Enemy.enemyPosition;

        spawn(new EnemyProjectile(position, 22.5d));
        spawn(new EnemyProjectile(position, 337.5d));
        spawn(new EnemyProjectile(position, 90d));
        spawn(new EnemyProjectile(position, 270d));
        spawn(new EnemyProjectile(position, 157.5d));
        spawn(new EnemyProjectile(position, 202.5d));
    }
    private void virusAttackPatternTwo(){
        spawn(new EnemyProjectile(new Coordinate2D(0,0), 45d));
        spawn(new EnemyProjectile(new Coordinate2D(750,0), 315d));
        spawn(new EnemyProjectile(new Coordinate2D(0,750), 135d));
        spawn(new EnemyProjectile(new Coordinate2D(750,750), 225d));
        spawn(new EnemyProjectile(new Coordinate2D(375,0), 0d));
        spawn(new EnemyProjectile(new Coordinate2D(375,750), 180d));
    }
}
