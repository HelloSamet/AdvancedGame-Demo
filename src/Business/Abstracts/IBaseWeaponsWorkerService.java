package Business.Abstracts;

import Entity.Base.BaseArmor;
import Entity.Base.BaseWeapon;

public interface IBaseWeaponsWorkerService {
    void ShowInformation(BaseWeapon _baseWeapon);
    void Add(BaseArmor _baseArmor);
}
