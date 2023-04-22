package com.github.hanyaeger.BossRush.scenes.levels;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.Player;
import com.github.hanyaeger.BossRush.entities.sprites.Hearth;
import com.github.hanyaeger.BossRush.entities.text.HealthText;
import com.github.hanyaeger.BossRush.entities.text.LevelText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.BossRush.entities.spawners.BulletSpawner;

public abstract class GameLevel extends DynamicScene implements EntitySpawnerContainer, UpdateExposer {
    public BossRush bossRush;
    private HealthText healthText;
    public LevelText levelText;
    private BulletSpawner bulletSpawner;
    public static int currentLevel;
    public static int gameState;

    public GameLevel(BossRush bossRush){
        this.bossRush = bossRush;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background.png");

        currentLevel = 0;
        gameState = 0;

        healthText = new HealthText(new Coordinate2D(42,6));
        levelText = new LevelText(new Coordinate2D(getWidth() - 85,5));

        bulletSpawner = new BulletSpawner(new Coordinate2D(375,642));
    }

    @Override
    public void setupEntities() {
        addEntity(new Player(new Coordinate2D(getWidth() / 2 - 24 ,610), healthText, bossRush));

        addEntity(healthText);
        addEntity(levelText);
        addEntity(new Hearth(new Coordinate2D(15,5)));
    }

    @Override
    public void setupEntitySpawners() {
        addEntitySpawner(bulletSpawner);
    }

    @Override
    public void explicitUpdate(long l) {
        levelText.setLevelText(GameLevel.currentLevel);
    }
}