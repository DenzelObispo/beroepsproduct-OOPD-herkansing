package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.weapon.PlayerBullet;
import com.github.hanyaeger.BossRush.scenes.levels.GameLevelController;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.api.scenes.SceneBorder;

public abstract class EnemyController extends DynamicSpriteEntity implements Collider, Collided, UpdateExposer, SceneBorderTouchingWatcher {
    public BossRush bossRush;
    private int health;
    public int moveSpeed;
    private String sprite;
    public static Coordinate2D enemyPosition;

    public EnemyController(Coordinate2D initialLocation, int health, int moveSpeed, String sprite, BossRush bossRush) {
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
            SoundClip hurt = new SoundClip("audio/enemyDied.wav");
            hurt.setVolume(2d);
            hurt.play();

            remove();
            switchToNextLevel();
        }
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border){
        switch(border){
            case TOP:
                setMotion(moveSpeed, Direction.DOWN);
                break;
            case BOTTOM:
                setMotion(moveSpeed, Direction.UP);
                break;
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
        if(GameLevelController.currentLevel == 1){
            bossRush.setActiveScene(BossRush.LEVEL_TWO);
        } else if(GameLevelController.currentLevel == 2){
            bossRush.setActiveScene(BossRush.LEVEL_THREE);
        } else if(GameLevelController.currentLevel == 3){
            bossRush.setActiveScene(BossRush.VICTORY_SCREEN);
        }
    }
}
