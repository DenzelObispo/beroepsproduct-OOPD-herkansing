package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.entities.Weapon.PlayerBullet;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;

public abstract class Enemy extends DynamicCompositeEntity implements Collider, Collided, UpdateExposer {
    public int health;
    public Enemy(Coordinate2D initialLocation, int health) {
        super(initialLocation);

        this.health = health;
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof PlayerBullet){
            takeDamage();
            checkIfEnemyDied(health);
        }
    }

    @Override
    public void explicitUpdate(long l) {

    }

    private void takeDamage(){
        health--;
    }

    private void checkIfEnemyDied(int health){
        if(health == 0){
            remove();

        }
    }
}
