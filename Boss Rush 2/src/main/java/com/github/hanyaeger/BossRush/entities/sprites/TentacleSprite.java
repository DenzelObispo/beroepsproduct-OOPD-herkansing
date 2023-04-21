package com.github.hanyaeger.BossRush.entities.sprites;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class TentacleSprite extends SpriteEntity {

    public TentacleSprite(Coordinate2D initialLocation) {
        super("sprites/tentacle.png",initialLocation, new Size(96));
    }
}
