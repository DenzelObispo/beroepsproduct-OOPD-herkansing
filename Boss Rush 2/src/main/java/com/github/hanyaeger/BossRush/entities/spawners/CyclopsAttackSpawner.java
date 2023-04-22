package com.github.hanyaeger.BossRush.entities.spawners;

import com.github.hanyaeger.BossRush.entities.weapon.EnemyProjectile;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;

import java.util.Random;

public class CyclopsAttackSpawner extends EntitySpawner {

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

    private void cyclopsAttackPatternOne(){
        spawn(new EnemyProjectile(new Coordinate2D(0,100), 90d));
        spawn(new EnemyProjectile(new Coordinate2D(0,375), 90d));
        spawn(new EnemyProjectile(new Coordinate2D(0,650), 90d));

        spawn(new EnemyProjectile(new Coordinate2D(750,237.5), 270d));
        spawn(new EnemyProjectile(new Coordinate2D(750,512.5), 270d));
    }

    private void cyclopsAttackPatternTwo(){
        spawn(new EnemyProjectile(new Coordinate2D(0,0), 45d));
        spawn(new EnemyProjectile(new Coordinate2D(750,0), 315d));
        spawn(new EnemyProjectile(new Coordinate2D(0,750), 135d));
        spawn(new EnemyProjectile(new Coordinate2D(750,750), 225d));

        spawn(new EnemyProjectile(new Coordinate2D(375,375), 0d));
        spawn(new EnemyProjectile(new Coordinate2D(375,375), 180d));
        spawn(new EnemyProjectile(new Coordinate2D(375,375), 270));
        spawn(new EnemyProjectile(new Coordinate2D(375,375), 90d));
    }
}
