package Business.Concretes;


import java.util.List;

import Business.Abstracts.ShoppingCenterWorkerService;
import Entity.Base.BaseArmor;
import Entity.Base.BaseWeapon;

public class ShoppingCenterWorker implements ShoppingCenterWorkerService {
    private List<BaseArmor> armors;
    private List<BaseWeapon> weapons;
    
    @Override
    public void Add(BaseArmor baseArmor) {
        armors.add(baseArmor);
    }

    @Override
    public void Add(BaseWeapon baseWeapon) {
        weapons.add(baseWeapon);
    }

    public List<BaseArmor> getArmors() {
        return armors;
    }

    public void setArmors(List<BaseArmor> armors) {
        this.armors = armors;
    }

    public List<BaseWeapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<BaseWeapon> weapons) {
        this.weapons = weapons;
    }
    

    

    
}
