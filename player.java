package game;

public class player {

    String name;
    int speed, healthPoin, damage, armor;

    //mentod
    void run() {
        System.out.println(name + " is Running ");
        System.out.println(" speed " + speed);
    }

    void attack() {
        System.out.println(name + " is attacking ");
        System.out.println("damage " + damage);
        armor -= damage;
        healthPoin = armor;
    }

    void defend() {
        System.out.println(name + " is defending ");
        System.out.println("armor " + armor);
    }

    boolean isDead() {
        if (healthPoin <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
