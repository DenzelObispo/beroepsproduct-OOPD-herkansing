package com.github.hanyaeger.BossRush.entities.text;

import com.github.hanyaeger.api.Coordinate2D;

public class GameOverText extends HeaderTextController {
    private static final String GAME_OVER = "Game over";
    public GameOverText(Coordinate2D initialLocation){
        super(initialLocation, GAME_OVER);

        setText(GAME_OVER);
    }
}