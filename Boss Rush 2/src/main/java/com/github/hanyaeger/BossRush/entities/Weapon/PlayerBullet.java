package com.github.hanyaeger.BossRush.entities.Weapon;

import com.github.hanyaeger.BossRush.entities.Player;
import com.github.hanyaeger.BossRush.entities.enemies.Enemy;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class PlayerBullet extends DynamicSpriteEntity implements SceneBorderCrossingWatcher, Collider, Collided {

    public PlayerBullet(Coordinate2D location, double direction) {
        super("sprites/bullet.png", location, new Size(16));

        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setMotion(15, direction);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        remove();
    }

    @Override
    public void onCollision(Collider collidingObject) {
        if (collidingObject instanceof Enemy){
            remove();
        }
    }
}
