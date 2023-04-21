package com.github.hanyaeger.BossRush.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.BossRush.BossRush;
import javafx.scene.input.MouseButton;

public class QuitButton extends Button implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private BossRush bossRush;
    private static final String QUIT = "Quit";

    public QuitButton(Coordinate2D initialLocation, BossRush bossRush){
        super(initialLocation, QUIT);
        this.bossRush = bossRush;

        setText(QUIT);
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        bossRush.quit();
    }
}
