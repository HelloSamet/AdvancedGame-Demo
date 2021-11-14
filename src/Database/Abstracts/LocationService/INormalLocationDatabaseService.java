package Database.Abstracts.LocationService;

import Entity.Concretes.Places.NormalLacotions.Base.NormalLocation;

public interface INormalLocationDatabaseService {
    NormalLocation SafeHouseLocationCreate();
    NormalLocation ShoppLocationCreate();
}
