package com.github.hanyaeger.BossRush.entities.buttons;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Cursor;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public abstract class ButtonController extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener{
   public BossRush bossRush;
    public ButtonController(Coordinate2D initialLocation, BossRush bossRush, String text) {
        super(initialLocation, text);

        this.bossRush = bossRush;

        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setFill(Color.rgb(153,229, 80));
        setFont(Font.font("Roboto", FontWeight.BOLD, 40));
    }

    @Override
    public void onMouseEntered(){
        setFill(Color.rgb(35, 167, 65));
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited(){
        setFill(Color.rgb(153,229, 80));
        setCursor(Cursor.DEFAULT);
    }
}
