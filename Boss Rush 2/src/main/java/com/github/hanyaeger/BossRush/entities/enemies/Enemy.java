package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.entities.Weapon.PlayerBullet;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.scenes.SceneBorder;

public abstract class Enemy extends DynamicCompositeEntity implements Collider, Collided, UpdateExposer, SceneBorderTouchingWatcher {
    public int health;
    public int moveSpeed;
    public Enemy(Coordinate2D initialLocation, int health, int moveSpeed) {
        super(initialLocation);

        this.health = health;
        this.moveSpeed = moveSpeed;
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

    @Override
    public void notifyBoundaryTouching(SceneBorder border){

        switch(border){
            case LEFT:
                setMotion(moveSpeed, Direction.RIGHT);
                break;
            case RIGHT:
                setMotion(moveSpeed, Direction.LEFT);
            default:
                break;
        }
    }

}
