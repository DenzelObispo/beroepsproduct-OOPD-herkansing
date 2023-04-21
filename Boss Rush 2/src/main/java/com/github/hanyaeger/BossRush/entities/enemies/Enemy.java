package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;

// abstract class
// fixedupdate hier

public abstract class Enemy extends DynamicCompositeEntity implements Collider, Collided {

    public Enemy(Coordinate2D initialLocation) {
        super(initialLocation);

    }

    @Override
    protected void setupEntities() {

    }

    @Override
    public void onCollision(Collider collider) {

    }
}
