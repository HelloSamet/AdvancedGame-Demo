package Entity.Base;

public class BaseArmor {
    private String armorName;
    private int id,absorbe,money;

    
    public BaseArmor() {
    }

    public BaseArmor(String armorName, int id, int absorbe, int money) {
        this.armorName = armorName;
        this.id = id;
        this.absorbe = absorbe;
        this.money = money;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAbsorbe() {
        return absorbe;
    }

    public void setAbsorbe(int absorbe) {
        this.absorbe = absorbe;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    

    
}
