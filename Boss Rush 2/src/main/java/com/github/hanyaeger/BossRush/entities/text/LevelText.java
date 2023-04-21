package com.github.hanyaeger.BossRush.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LevelText extends TextEntity {

    public LevelText(Coordinate2D initialLocation) {
        super(initialLocation);

        setFill(Color.rgb(153,229, 80));
        setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 20));

        setText("Level: " + 1);
    }

    public void setLevelText(int level){
        setText("Level: " + level);
    }
}
