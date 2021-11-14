package Business.Concretes;

import Business.Abstracts.IBaseLocationsWorkerService;
import Database.Concretes.LocationDatabase.BattleLocationDatabase;
import Database.Concretes.MonsterDatabase.MonsterDatabase;
import Entity.Concretes.Places.BattleLocations.Base.BattleLocation;
import Entity.Concretes.Places.NormalLacotions.Base.NormalLocation;

public class BaseLocationWorker implements IBaseLocationsWorkerService {
    BattleLocationDatabase battleLocationDatabase;
    MonsterDatabase monsterDatabase;

    @Override
    public void ShowInformation(BattleLocation battleLocation) {
       System.out.println
       (
         "\t\t\tLocation Name : "+battleLocation.getLocationName()+
         "\nLocation Id : "+battleLocation.getId()+
         "\tLocation Monster : "+battleLocation.getBaseMonster()+
         "\tLocation Property : "+battleLocation.getPropertys()+
         "\tLocation Goods : "+battleLocation.getGoods()
       );
    }

    @Override
    public void ShowInformation(NormalLocation normalLocation) {
        System.out.println
        (
            "\t\t\tLocation Name : "+normalLocation.getLocationName()+
            "\nLocation Id : "+normalLocation.getId()+
            "\tLocation Property : "+normalLocation.getPropertys()
        );
        
    }  
}
