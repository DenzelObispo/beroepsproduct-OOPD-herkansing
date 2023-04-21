package com.github.hanyaeger.BossRush.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.BossRush.BossRush;
import javafx.scene.input.MouseButton;

public class StartButton extends Button implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private BossRush bossRush;
    private static final String START = "Start Game";

    public StartButton(Coordinate2D initialLocation, BossRush bossRush){
        super(initialLocation, START);
        this.bossRush = bossRush;

        setText(START);
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        bossRush.setActiveScene(1);
    }
}
