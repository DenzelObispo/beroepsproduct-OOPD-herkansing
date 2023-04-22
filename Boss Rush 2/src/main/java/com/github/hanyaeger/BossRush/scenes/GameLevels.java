package com.github.hanyaeger.BossRush.scenes;

import com.github.hanyaeger.BossRush.BossRush;
import com.github.hanyaeger.BossRush.entities.Player;
import com.github.hanyaeger.BossRush.entities.Weapon.BulletSpawner;
import com.github.hanyaeger.BossRush.entities.sprites.Hearth;
import com.github.hanyaeger.BossRush.entities.text.HealthText;
import com.github.hanyaeger.BossRush.entities.text.LevelText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.scenes.DynamicScene;

public abstract class GameLevels extends DynamicScene implements EntitySpawnerContainer, UpdateExposer {
    private BossRush bossRush;
    private HealthText healthText;
    public LevelText levelText;
    private BulletSpawner bulletSpawner;
    public static int currentLevel;

    public GameLevels(BossRush bossRush){
        this.bossRush = bossRush;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background.png");

        healthText = new HealthText(new Coordinate2D(42,6));
        levelText = new LevelText(new Coordinate2D(getWidth() - 85,5));

        bulletSpawner = new BulletSpawner(new Coordinate2D(375,642));
    }

    @Override
    public void setupEntities() {
        addEntity(new Player(new Coordinate2D(getWidth() / 2 - 24 ,610), healthText));

        addEntity(healthText);
        addEntity(levelText);
        addEntity(new Hearth(new Coordinate2D(15,5)));
    }

    public void setupEntitySpawners() {
        addEntitySpawner(bulletSpawner);
    }

    @Override
    public void explicitUpdate(long l) {
        levelText.setLevelText(currentLevel);

        if (Player.hasPlayerDied){
            bossRush.setActiveScene(BossRush.GAME_OVER_SCREEN);
        }
    }
}
