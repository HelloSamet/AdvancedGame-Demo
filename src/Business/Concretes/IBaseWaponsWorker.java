package Business.Concretes;

import Business.Abstracts.IBaseWeaponsWorkerService;
import Entity.Base.BaseArmor;
import Entity.Base.BaseWeapon;

public class IBaseWaponsWorker implements IBaseWeaponsWorkerService {

    ShoppingCenterWorker shopp;
    @Override
    public void ShowInformation(BaseWeapon _baseWeapon) {
        System.out.println
        (
            "\t\t\tWeapon Name : "+_baseWeapon.getWeaponName()+"\tWeapon Id : "+_baseWeapon.getId()+"\tWeaponWeapon Damage : "+_baseWeapon.getDamage()+
            "\tWeapon Money : "+_baseWeapon.getMoney()
        );
        
    }

    @Override
    public void Add(BaseArmor _baseArmor) {
       shopp.Add(_baseArmor);
        
    }
    
}
