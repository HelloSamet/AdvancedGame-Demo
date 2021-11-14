package Entity.Base;

public class BaseCharacter {
    private String characterName;
    private int id,damage,healthy,money,rHealthy;

    public BaseCharacter() {
    }

    public BaseCharacter(String characterName, int id, int damage, int healthy, int money) {
        this.characterName = characterName;
        this.id = id;
        this.damage = damage;
        this.healthy = healthy;
        this.money = money;
        setrHealthy(healthy);
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
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

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }



    


    

    
    
}
