package Database.Abstracts.ArmorService;

import Entity.Base.BaseArmor;

public interface IArmorDatabaseService {
    BaseArmor SoftArmorCreate();
    BaseArmor MiddleArmorCreate();
    BaseArmor HeavyArmorCreate();
}
