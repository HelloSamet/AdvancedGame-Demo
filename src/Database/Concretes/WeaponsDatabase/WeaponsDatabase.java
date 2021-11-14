package Database.Concretes.WeaponsDatabase;

import Database.Abstracts.WeaponsService.IWeaponsDatabaseService;
import Entity.Base.BaseWeapon;
import Entity.Concretes.Weapons.Pistol;
import Entity.Concretes.Weapons.Rifle;
import Entity.Concretes.Weapons.Sword;

public class WeaponsDatabase implements IWeaponsDatabaseService {

    Pistol pistol;
    Rifle rifle;
    Sword sword;

    

    public WeaponsDatabase() {
        pistol=new Pistol();
        rifle=new Rifle();
        sword=new Sword();
    }

    @Override
    public BaseWeapon PistolCreate() {
        this.pistol.setWeaponName("Pistol");
        this.pistol.setId(1);
        this.pistol.setDamage(2);
        this.pistol.setMoney(25);
        return this.pistol;
    }

    @Override
    public BaseWeapon RifleCreate() {
        this.rifle.setWeaponName("Rifle");
        this.rifle.setId(3);
        this.rifle.setDamage(7);
        this.rifle.setMoney(45);
        return this.rifle;
    }

    @Override
    public BaseWeapon SwordCreate() {
        this.sword.setWeaponName("Sword");
        this.sword.setId(2);
        this.sword.setDamage(3);
        this.sword.setMoney(35);
        return this.sword;
    }
    
}
