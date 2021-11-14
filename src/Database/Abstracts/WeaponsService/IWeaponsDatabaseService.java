package Database.Abstracts.WeaponsService;

import Entity.Base.BaseWeapon;

public interface IWeaponsDatabaseService {
    BaseWeapon PistolCreate();
    BaseWeapon RifleCreate();
    BaseWeapon SwordCreate();
}
