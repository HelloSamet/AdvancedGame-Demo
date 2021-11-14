package Database.Abstracts.LocationService;

import Entity.Concretes.Places.BattleLocations.Base.BattleLocation;

public interface IBattleLocationDatabaseService {
    BattleLocation CaveLocationCreate();
    BattleLocation ForestLocationCreate();
    BattleLocation RiverLocationCreate();
    void idControl(int _id);
}
