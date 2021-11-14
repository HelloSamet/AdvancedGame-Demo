package Entity.Base;

public class BaseMonster {
    private String monsterName;
    private int id,damage,healthy,money;

    public BaseMonster() {
    }

    public BaseMonster(String monsterName, int id, int damage, int healthy, int money) {
        this.monsterName = monsterName;
        this.id = id;
        this.damage = damage;
        this.healthy = healthy;
        this.money = money;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }



    
    

    
}
