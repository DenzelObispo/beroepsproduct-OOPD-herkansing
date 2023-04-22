package com.github.hanyaeger.BossRush.entities.text;

import com.github.hanyaeger.api.Coordinate2D;

public class TitleText  extends HeaderTextController {
    private static final String TITLE = "Boss Rush 2";
    public TitleText(Coordinate2D initialLocation){
        super(initialLocation, TITLE);

        setText(TITLE);
    }
}
