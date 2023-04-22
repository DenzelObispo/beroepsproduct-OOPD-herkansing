package com.github.hanyaeger.BossRush.entities.text;

import com.github.hanyaeger.api.Coordinate2D;

public class VictoryText extends HeaderTextController {
    private static final String VICTORY = "VictoryScene";
    public VictoryText(Coordinate2D initialLocation){
        super(initialLocation, VICTORY);

        setText(VICTORY);
    }
}
