package Database.Concretes.LocationDatabase;

import Business.Abstracts.IBattleLocationWorkerService;
import Business.Concretes.BaseLocationWorker;
import Business.Concretes.BaseMonsterWorker;
import Business.Concretes.PlayerWorker;
import Database.Abstracts.LocationService.IBattleLocationDatabaseService;
import Database.Concretes.MonsterDatabase.MonsterDatabase;
import Entity.Concretes.Goods.Concretes.Firewood;
import Entity.Concretes.Goods.Concretes.Food;
import Entity.Concretes.Goods.Concretes.Water;
import Entity.Concretes.Places.BattleLocations.Base.BattleLocation;
import Entity.Concretes.Places.BattleLocations.Concretes.Cave;
import Entity.Concretes.Places.BattleLocations.Concretes.Forest;
import Entity.Concretes.Places.BattleLocations.Concretes.River;
import Entity.Concretes.Places.NormalLacotions.Concretes.SafeHouse;
import Entity.Concretes.Places.NormalLacotions.Concretes.ShoppingCenter;

public class BattleLocationDatabase implements IBattleLocationDatabaseService,IBattleLocationWorkerService {

    BaseLocationWorker baseLocationWorker;NormalLocationDatabase normalLocationDatabase;
    Cave cave;Forest forest;River river;
    SafeHouse safeHouse;ShoppingCenter shoppingCenter;
    Food food; Water water;Firewood firewood;
    MonsterDatabase monsterDatabase; PlayerWorker playerWorker;
    BaseMonsterWorker baseMonsterWorker;


    public BattleLocationDatabase() {
        baseLocationWorker = new BaseLocationWorker();
        normalLocationDatabase = new NormalLocationDatabase();
        cave = new Cave();
        forest = new Forest();
        river = new River();
        safeHouse = new SafeHouse();
        shoppingCenter = new ShoppingCenter();
        monsterDatabase=new MonsterDatabase();
        playerWorker=new PlayerWorker();
    }

    @Override
    public BattleLocation CaveLocationCreate() {
        food=new Food("Food");
        this.cave.setLocationName("Cave");
        this.cave.setId(2);
        this.cave.setPropertys("Savaş + Ganimet");
        this.cave.setGoods(food);
        this.cave.setBaseMonster(monsterDatabase.getBear());
        this.cave.setPlayer(playerWorker.getPlayer());
        return this.cave;
    }

    @Override
    public BattleLocation ForestLocationCreate() {
        firewood=new Firewood("Firewood");
        this.forest.setLocationName("Forest");
        this.forest.setId(3);
        this.forest.setPropertys("Savaş + Ganimet");
        this.forest.setGoods(firewood);
        this.forest.setBaseMonster(monsterDatabase.getVampire());
        this.forest.setPlayer(playerWorker.getPlayer());
        return this.forest;
    }

    @Override
    public BattleLocation RiverLocationCreate() {
        water=new Water("Water");
        this.river.setLocationName("River");
        this.river.setId(4);
        this.river.setPropertys("Savaş + Ganimet");
        this.river.setGoods(water);
        this.river.setBaseMonster(monsterDatabase.getBear());
        this.river.setPlayer(playerWorker.getPlayer());
        return this.river;
    }

    @Override
    public void idControl(int _id) {
        switch (_id) {
        case 1:
            System.out.println(this.safeHouse.getLocationName() + "- Location Selected.");
            System.out.println(
                    "*********************************************************************************************");
            this.baseLocationWorker.ShowInformation(normalLocationDatabase.SafeHouseLocationCreate());
            break;
        case 2:
            System.out.println(this.cave.getLocationName() + "- Location Selected.");
            System.out.println(
                    "*********************************************************************************************");
            this.baseLocationWorker.ShowInformation(this.CaveLocationCreate());
            break;
        case 3:
            System.out.println(this.forest.getLocationName() + "- Location Selected.");
            System.out.println(
                    "*********************************************************************************************");
            this.baseLocationWorker.ShowInformation(ForestLocationCreate());
            break;
        case 4:
            System.out.println(this.river.getLocationName() + "- Location Selected.");
            System.out.println(
                    "*********************************************************************************************");
            this.baseLocationWorker.ShowInformation(RiverLocationCreate());
            break;
        case 5:
            System.out.println(this.shoppingCenter.getLocationName() + "- Location Selected.");
            System.out.println(
                    "*********************************************************************************************");
            this.baseLocationWorker.ShowInformation(normalLocationDatabase.ShoppLocationCreate());
            break;
        default:
            break;
        }

    }

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

}
