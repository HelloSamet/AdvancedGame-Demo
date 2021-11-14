package Entity.Base;

public class BaseWeapon {
    private String weaponName;
    private int id,damage,money;

    public BaseWeapon() {
    }

    public BaseWeapon(String weaponName, int id, int damage, int money) {
        this.weaponName = weaponName;
        this.id = id;
        this.damage = damage;
        this.money = money;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    

    
    
}
