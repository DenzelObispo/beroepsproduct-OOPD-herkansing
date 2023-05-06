package com.github.hanyaeger.BossRush.entities.spawners;

import com.github.hanyaeger.BossRush.entities.enemies.EnemyController;
import com.github.hanyaeger.BossRush.entities.weapon.EnemyProjectile;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;

public abstract class EnemyAttackSpawner extends EntitySpawner {
    public long attackRate;
    public EnemyAttackSpawner(long attackRate){
        super(1250);

        this.attackRate = attackRate;
    }

    public void cyclopsAttackPatternOne(){
        spawn(new EnemyProjectile(new Coordinate2D(0,100), 90d));
        spawn(new EnemyProjectile(new Coordinate2D(0,375), 90d));
        spawn(new EnemyProjectile(new Coordinate2D(0,650), 90d));

        spawn(new EnemyProjectile(new Coordinate2D(750,237.5), 270d));
        spawn(new EnemyProjectile(new Coordinate2D(750,512.5), 270d));
    }

    public void cyclopsAttackPatternTwo(){
        spawn(new EnemyProjectile(new Coordinate2D(0,0), 45d));
        spawn(new EnemyProjectile(new Coordinate2D(750,0), 315d));
        spawn(new EnemyProjectile(new Coordinate2D(0,750), 135d));
        spawn(new EnemyProjectile(new Coordinate2D(750,750), 225d));

        spawn(new EnemyProjectile(new Coordinate2D(375,375), 0d));
        spawn(new EnemyProjectile(new Coordinate2D(375,375), 180d));
        spawn(new EnemyProjectile(new Coordinate2D(375,375), 270));
        spawn(new EnemyProjectile(new Coordinate2D(375,375), 90d));
    }

    public void virusAttackPatternOne( ){
        Coordinate2D position = EnemyController.enemyPosition;

        spawn(new EnemyProjectile(position, 22.5d));
        spawn(new EnemyProjectile(position, 337.5d));
        spawn(new EnemyProjectile(position, 90d));
        spawn(new EnemyProjectile(position, 270d));
        spawn(new EnemyProjectile(position, 157.5d));
        spawn(new EnemyProjectile(position, 202.5d));
    }

    public void virusAttackPatternTwo(){
        spawn(new EnemyProjectile(new Coordinate2D(0,0), 45d));
        spawn(new EnemyProjectile(new Coordinate2D(750,0), 315d));
        spawn(new EnemyProjectile(new Coordinate2D(0,750), 135d));
        spawn(new EnemyProjectile(new Coordinate2D(750,750), 225d));
        spawn(new EnemyProjectile(new Coordinate2D(375,0), 0d));
        spawn(new EnemyProjectile(new Coordinate2D(375,750), 180d));
    }

    public void tentacleAttackPatternOne(){
        spawn(new EnemyProjectile(new Coordinate2D(100,0), 0d));
        spawn(new EnemyProjectile(new Coordinate2D(375,0), 0d));
        spawn(new EnemyProjectile(new Coordinate2D(650,0), 0d));

        spawn(new EnemyProjectile(new Coordinate2D(237.5,750), 180d));
        spawn(new EnemyProjectile(new Coordinate2D(512.5,750), 180d));
    }

    public void tentacleAttackPatternTwo( ){
        Coordinate2D position = EnemyController.enemyPosition;

        spawn(new EnemyProjectile(position, 0d));
        spawn(new EnemyProjectile(position, 45d));
        spawn(new EnemyProjectile(position, 315d));
        spawn(new EnemyProjectile(position, 22.5d));
        spawn(new EnemyProjectile(position, 337.5));
    }
}
