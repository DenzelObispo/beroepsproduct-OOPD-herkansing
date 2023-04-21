package com.github.hanyaeger.BossRush.entities.text;

import com.github.hanyaeger.api.Coordinate2D;

public class VictoryText extends HeaderText {
    private static final String VICTORY = "Victory";

    public VictoryText(Coordinate2D initialLocation){
        super(initialLocation, VICTORY);

        setTextStyle();
        setText(VICTORY);
    }
}
