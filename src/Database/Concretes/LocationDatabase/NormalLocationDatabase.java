package Database.Concretes.LocationDatabase;

import Business.Abstracts.INormalLocationWorkerService;
import Business.Concretes.PlayerWorker;
import Business.Concretes.ShoppingCenterWorker;
import Database.Abstracts.LocationService.INormalLocationDatabaseService;
import Entity.Concretes.Places.NormalLacotions.Base.NormalLocation;
import Entity.Concretes.Places.NormalLacotions.Concretes.SafeHouse;
import Entity.Concretes.Places.NormalLacotions.Concretes.ShoppingCenter;

public class NormalLocationDatabase implements INormalLocationDatabaseService,INormalLocationWorkerService {

    SafeHouse safeHouse;
    ShoppingCenter shoppingCenter;
    PlayerWorker playerWorker;
    ShoppingCenterWorker shopp;

    public NormalLocationDatabase() {
        this.safeHouse=new SafeHouse();
        this.shoppingCenter=new ShoppingCenter();
        playerWorker=new PlayerWorker();
    }

    @Override
    public NormalLocation SafeHouseLocationCreate() {
        this.safeHouse.setLocationName("Safe House");
        this.safeHouse.setId(1);
        this.safeHouse.setPropertys("Can yenilemek");
        this.safeHouse.setPlayer(playerWorker.getPlayer());
        return this.safeHouse;
    }

    @Override
    public NormalLocation ShoppLocationCreate() {
        this.shoppingCenter.setLocationName("Shopping Center");
        this.shoppingCenter.setId(5);
        this.shoppingCenter.setPropertys("Sell");
        this.shoppingCenter.setPlayer(playerWorker.getPlayer());
        this.shoppingCenter.setBaseArmor(null);
        this.shoppingCenter.setBaseWeapon(null);
        return this.shoppingCenter;
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
