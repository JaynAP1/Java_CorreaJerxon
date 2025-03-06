package Ejercicio7;

interface enemy{
    void attack();
}

public class Game {
    private enemy enemy1;
    private enemy enemy2;

    public void init(enemy s, enemy a) {
        enemy1 = s;
        enemy2 = a;
    }

    void run() {
        while (!endGame) {
            enemy1.attack();
            enemy2.attack();
        }
    }
}

class GunEnemy implements enemy {
    public void attack(){
        doActionShoot();
    }
    public void doActionShoot(){
        System.out.println("Shoot");
    }
}

class KnifeEnemy implements enemy {
    public void attack(){
        doActionStab();
    }
    public void doActionStab(){
        System.out.println("Stab");
    }
}
