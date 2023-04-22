package com.github.hanyaeger.BossRush.entities.spawners;

import com.github.hanyaeger.BossRush.entities.Player;
import com.github.hanyaeger.BossRush.entities.weapon.PlayerBullet;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.EntitySpawner;

public class BulletSpawner extends EntitySpawner {

    public BulletSpawner() {
        super(150);
    }

    @Override
    protected void spawnEntities() {
        var shootPosition = new Coordinate2D(Player.playerPosition.getX() + 26,Player.playerPosition.getY() - 10);
        var bullet = new PlayerBullet(shootPosition, Direction.UP.getValue());
        spawn(bullet);
    }
}
