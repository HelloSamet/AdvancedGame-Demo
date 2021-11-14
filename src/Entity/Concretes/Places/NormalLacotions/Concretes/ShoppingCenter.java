package Entity.Concretes.Places.NormalLacotions.Concretes;


import java.util.List;

import Entity.Base.BaseArmor;
import Entity.Base.BaseWeapon;
import Entity.Concretes.Places.NormalLacotions.Base.NormalLocation;
import Player.Player;

public class ShoppingCenter extends NormalLocation {

    private List<BaseWeapon> baseWeapon;
    private List<BaseArmor> baseArmor;
    public ShoppingCenter(Player player, String _locationName,int _id, String _propertys) {
        super(player, _locationName,_id, _propertys);
    }

    public ShoppingCenter() {
    }

    public boolean getLocation(){
        return true;
    }

    public List<BaseWeapon> getBaseWeapon() {
        return baseWeapon;
    }

    public void setBaseWeapon(List<BaseWeapon> baseWeapon) {
        this.baseWeapon = baseWeapon;
    }

    public List<BaseArmor> getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(List<BaseArmor> baseArmor) {
        this.baseArmor = baseArmor;
    }
    
}
