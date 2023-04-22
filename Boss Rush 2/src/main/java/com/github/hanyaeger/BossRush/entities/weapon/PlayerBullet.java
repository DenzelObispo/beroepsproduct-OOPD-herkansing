package com.github.hanyaeger.BossRush.entities.weapon;

import com.github.hanyaeger.BossRush.entities.enemies.EnemyController;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class PlayerBullet extends DynamicSpriteEntity implements SceneBorderCrossingWatcher, Collider, Collided {

    public PlayerBullet(Coordinate2D location, double direction) {
        super("sprites/bullet.png", location, new Size(24));

        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setMotion(15, direction);
        SoundClip sound = new SoundClip("audio/Shoot.wav");
        sound.setVolume(.03d);
        sound.play();
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        remove();
    }

    @Override
    public void onCollision(Collider collidingObject) {
        if (collidingObject instanceof EnemyController){
            remove();
        }
    }
}
