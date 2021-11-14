package Business.Abstracts;

import Entity.Concretes.Places.BattleLocations.Base.BattleLocation;
import Entity.Concretes.Places.NormalLacotions.Base.NormalLocation;

public interface IBaseLocationsWorkerService {
    void ShowInformation(BattleLocation battleLocation);
    void ShowInformation(NormalLocation normalLocation);
}
