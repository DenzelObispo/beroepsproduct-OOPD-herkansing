package com.github.hanyaeger.BossRush.entities.text;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public abstract class HeaderText extends TextEntity {
    public HeaderText(Coordinate2D initialLocation, final String text){
        super(initialLocation, text);

    }

    public void setTextStyle(){
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setFill(Color.rgb(153,229, 80));
        setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 100));
    }
}
