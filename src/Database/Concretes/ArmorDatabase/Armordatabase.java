package Database.Concretes.ArmorDatabase;

import Database.Abstracts.ArmorService.IArmorDatabaseService;
import Entity.Base.BaseArmor;
import Entity.Concretes.Armor.Heavy;
import Entity.Concretes.Armor.Middle;
import Entity.Concretes.Armor.Soft;

public class Armordatabase implements IArmorDatabaseService {

    Soft soft;
    Middle middle;
    Heavy heavy;

    public Armordatabase() {
        this.soft = new Soft();
        this.middle = new Middle();
        this.heavy = new Heavy();
    }

    @Override
    public BaseArmor SoftArmorCreate() {
        this.soft.setArmorName("Soft");
        this.soft.setId(1);
        this.soft.setAbsorbe(1);
        this.soft.setMoney(15);
        return this.soft;
    }

    @Override
    public BaseArmor MiddleArmorCreate() {
        this.middle.setArmorName("Middle");
        this.middle.setId(2);
        this.middle.setAbsorbe(3);
        this.middle.setMoney(25);
        return this.middle;
    }

    @Override
    public BaseArmor HeavyArmorCreate() {
        this.heavy.setArmorName("Heavy");
        this.heavy.setId(3);
        this.heavy.setAbsorbe(5);
        this.heavy.setMoney(40);
        return this.heavy;
    }

}
