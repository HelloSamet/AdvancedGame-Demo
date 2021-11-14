package Business.Abstracts;

import Entity.Base.BaseArmor;
import Entity.Base.BaseWeapon;

public interface ShoppingCenterWorkerService {
    void Add(BaseArmor baseArmor);
    void Add(BaseWeapon baseWeapon);
}
