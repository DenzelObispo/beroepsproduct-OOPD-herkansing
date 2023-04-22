package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.Weapon.PlayerBullet;
import com.github.hanyaeger.BossRush.scenes.GameLevels;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public abstract class Enemy extends DynamicSpriteEntity implements Collider, Collided, UpdateExposer, SceneBorderTouchingWatcher {
    public BossRush bossRush;
    private int health;
    public int moveSpeed;
    private String sprite;

    public static Coordinate2D enemyPosition;

    public Enemy(Coordinate2D initialLocation, int health, int moveSpeed, String sprite, BossRush bossRush) {
        super(sprite,initialLocation, new Size(96));

        this.health = health;
        this.moveSpeed = moveSpeed;
        this.sprite = sprite;
        this.bossRush = bossRush;

        enemyPosition = getLocationInScene();
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
        enemyPosition = getLocationInScene();
    }

    private void takeDamage(){
        health--;
    }

    private void checkIfEnemyDied(int health){
        if(health == 0){
            remove();
            switchToNextLevel();
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
    private void switchToNextLevel(){
        if(GameLevels.currentLevel == 1){
            bossRush.setActiveScene(BossRush.LEVEL_TWO);
        } else if(GameLevels.currentLevel == 2){
            bossRush.setActiveScene(BossRush.LEVEL_THREE);
        } else if(GameLevels.currentLevel == 3){
            bossRush.setActiveScene(BossRush.VICTORY_SCREEN);
        }
    }
}
