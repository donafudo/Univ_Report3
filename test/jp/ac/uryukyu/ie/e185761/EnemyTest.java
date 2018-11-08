package jp.ac.uryukyu.ie.e185761;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        Enemy enemy = new Enemy("スライム",10,10);
        Hero hero=new Hero("tanaka",10,4);
        int hp=hero.getHitPoint();

        enemy.setHitPoint(-1);
        for(int i=0;i<5;i++){
            enemy.attack(hero);
        }

        assertEquals(hp,hero.getHitPoint());
    }
}
