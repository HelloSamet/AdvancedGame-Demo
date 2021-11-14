package Entity.Concretes.Inventory;

import Entity.Base.BaseArmor;
import Entity.Base.BaseWeapon;
import Entity.Concretes.Goods.Base.Goods;

public class Inventory {

    private Goods goods;
    private BaseWeapon weapon;
    private BaseArmor armor;

    public Inventory() {
        
    }

    public Inventory(Goods goods, BaseWeapon weapon, BaseArmor armor, int _damage, int _armor) {
        this.goods = goods;
        this.weapon = weapon;
        this.armor = armor;
    }


    public Goods getGoods() {
        return goods;
    }


    public void setGoods(Goods goods) {
        this.goods = goods;
    }


    public BaseWeapon getWeapon() {
        return weapon;
    }


    public void setWeapon(BaseWeapon weapon) {
        this.weapon = weapon;
    }


    public BaseArmor getArmor() {
        return armor;
    }


    public void setArmor(BaseArmor armor) {
        this.armor = armor;
    }
    
}
