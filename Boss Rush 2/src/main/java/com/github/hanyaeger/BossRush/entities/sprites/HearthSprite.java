package com.github.hanyaeger.BossRush.entities.sprites;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class HearthSprite extends DynamicSpriteEntity {

    public HearthSprite(Coordinate2D location) {
        super("sprites/HearthSprite.png", location, new Size(24,24));
    }
}
