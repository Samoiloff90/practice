package fightingTask;

public class Warrior implements Attack{
    private int health;
    private int damage = 10;
    private String name;

    public Warrior (int damage, String name) {
        this.health = 100;
        this.damage = damage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health <= 0){
            System.out.println(getName() + " is dead!");
        }
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Воин по имени " + name;
    }


    @Override
    public void doAttack(Warrior attacking, Warrior defending) {
        defending.setHealth(defending.getHealth() - attacking.getDamage());
        System.out.println(attacking + " атаковал " + defending + ". " +
                "У " + defending + " осталось здоровья: " + defending.getHealth());
    }
}