package Encapsulation;

public class Player {
    public String fullName, weapon;
    public int health;

    public void loseHealth(int damage) {
        health -= damage;

        if (health <= 0) {
            System.out.println("Player knocked out of the game");
        }
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;

        if (health >= 100) {
            System.out.println("Health is restored to 100%");
            health = 100;
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}