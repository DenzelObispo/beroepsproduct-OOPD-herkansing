package com.github.hanyaeger.BossRush.entities.sprites;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Hearth extends DynamicSpriteEntity {

    public Hearth(Coordinate2D location) {
        super("sprites/Hearth.png", location, new Size(24,24));
    }
}
