package com.github.hanyaeger.BossRush.entities.spawners;

import com.github.hanyaeger.BossRush.entities.Player;
import com.github.hanyaeger.BossRush.entities.weapon.PlayerBullet;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.EntitySpawner;

public class BulletSpawner extends EntitySpawner {
    private double direction;

    public BulletSpawner(Coordinate2D location) {
        super(150);

        direction = Direction.UP.getValue();
    }

    @Override
    protected void spawnEntities() {
        var shootPosition = new Coordinate2D(Player.playerPosition.getX() + 26,Player.playerPosition.getY() - 10);
        var bullet = new PlayerBullet(shootPosition, direction);
        spawn(bullet);
    }
}
