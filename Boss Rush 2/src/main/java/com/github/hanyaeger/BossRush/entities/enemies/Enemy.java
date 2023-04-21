package com.github.hanyaeger.BossRush.entities.enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;

// abstract class
// fixedupdate hier

public abstract class Enemy extends DynamicCompositeEntity implements Collider, Collided, UpdateExposer {

    public Enemy(Coordinate2D initialLocation) {
        super(initialLocation);

    }

    @Override
    protected void setupEntities() {

    }

    @Override
    public void onCollision(Collider collider) {

    }

    @Override
    public void explicitUpdate(long l) {

    }
}
