package com.github.hanyaeger.BossRush.scenes;

import com.github.hanyaeger.BossRush.entities.Player;
import com.github.hanyaeger.BossRush.entities.Weapon.BulletSpawner;
import com.github.hanyaeger.BossRush.entities.sprites.Hearth;
import com.github.hanyaeger.BossRush.entities.text.HealthText;
import com.github.hanyaeger.BossRush.entities.text.LevelText;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;

public abstract class Levels extends DynamicScene implements EntitySpawnerContainer {

    private HealthText healthText;
    private BulletSpawner bulletSpawner;

    public Levels(){

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background.png");

        healthText = new HealthText(new Coordinate2D(42,6));
        bulletSpawner = new BulletSpawner(new Coordinate2D(375,642));
    }

    @Override
    public void setupEntities() {
        addEntity(new Player(new Coordinate2D(getWidth() / 2 - 24 ,610), healthText));

        addEntity(healthText);
        addEntity(new Hearth(new Coordinate2D(15,5)));
        addEntity(new LevelText(new Coordinate2D(new Coordinate2D(getWidth() - 85,5))));

    }

    public void setupEntitySpawners() {
        addEntitySpawner(bulletSpawner);
    }

}
