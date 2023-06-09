package com.github.hanyaeger.BossRush.entities;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.enemies.EnemyController;
import com.github.hanyaeger.BossRush.entities.weapon.EnemyProjectile;
import com.github.hanyaeger.BossRush.entities.text.HealthText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Player extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Newtonian ,Collided, Collider, UpdateExposer {
    public BossRush bossRush;
    private int health = 3;
    private HealthText healthText;
    public static Coordinate2D playerPosition = new Coordinate2D();;

    public Player(Coordinate2D location ,HealthText healthText, BossRush bossRush){
        super("sprites/player.png", location, new Size(48), 1, 4);

        this.bossRush = bossRush;
        this.healthText = healthText;
        healthText.setHealthText(health);

        setGravityConstant(0);
        setFrictionConstant(0);
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys){
        int moveSpeed = 6;

        if(pressedKeys.contains(KeyCode.A)){
            setMotion(moveSpeed,270d);
            setCurrentFrameIndex(3);
        } else if(pressedKeys.contains(KeyCode.D)){
            setMotion(moveSpeed,90d);
            setCurrentFrameIndex(1);
        } else if(pressedKeys.contains(KeyCode.W)){
            setMotion(moveSpeed,180d);
            setCurrentFrameIndex(0);
        } else if(pressedKeys.contains(KeyCode.S)){
            setMotion(moveSpeed,0d);
            setCurrentFrameIndex(2);
        } else if(pressedKeys.isEmpty()){
            setSpeed(0);
        }
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border){
        switch(border){
            case TOP:
                setAnchorLocationY(1);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 1);
                break;
            case LEFT:
                setAnchorLocationX(1);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 1);
            default:
                break;
        }
    }

    @Override
    public void onCollision(Collider collidingObject){
        if (collidingObject instanceof EnemyProjectile){
            takeDamage();
        } else if(collidingObject instanceof EnemyController){
            takeDamage();
        }
    }

    @Override
    public void explicitUpdate(long l) {
        playerPosition = this.getLocationInScene();
    }

    private void takeDamage(){
        SoundClip hurt = new SoundClip("audio/hit.wav");
        hurt.setVolume(2d);
        hurt.play();

        health--;
        healthText.setHealthText(health);
        checkIfPlayerDied();
    }

    private void checkIfPlayerDied(){
        if(health == 0){
            SoundClip hurt = new SoundClip("audio/playerDied.wav");
            hurt.setVolume(2d);
            hurt.play();

            bossRush.setActiveScene(BossRush.GAME_OVER_SCREEN);
        }
    }
}
