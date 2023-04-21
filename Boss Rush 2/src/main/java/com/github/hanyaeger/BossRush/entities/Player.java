package com.github.hanyaeger.BossRush.entities;

import com.github.hanyaeger.BossRush.entities.text.HealthText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Player extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Newtonian ,Collided, Collider, UpdateExposer {
    private int moveSpeed = 5;
    private int health = 3;
    private HealthText healthText;
    public static Coordinate2D playerPosition;


    public Player(Coordinate2D location ,HealthText healthText){
        super("sprites/player.png", location, new Size(48), 1, 4);

        this.healthText = healthText;
        playerPosition = new Coordinate2D();

        healthText.setHealthText(health);

        setGravityConstant(0);
        setFrictionConstant(0);
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys){
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
        setSpeed(0);

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

    }

    @Override
    public void explicitUpdate(long l) {
        playerPosition = this.getLocationInScene();
    }
}
