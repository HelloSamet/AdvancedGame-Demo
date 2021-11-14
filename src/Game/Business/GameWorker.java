package Game.Business;

import java.util.Scanner;

import Business.Concretes.BaseCharacterWorker;
import Business.Concretes.BaseLocationWorker;
import Database.Concretes.CharacterDatabase.CharacterDatabase;
import Database.Concretes.LocationDatabase.BattleLocationDatabase;
import Database.Concretes.LocationDatabase.NormalLocationDatabase;
import Database.Concretes.MonsterDatabase.MonsterDatabase;
import Entity.Concretes.Places.BattleLocations.Base.BattleLocation;
import Entity.Concretes.Places.NormalLacotions.Base.NormalLocation;
import Entity.Concretes.Places.Select.ISelectBattleLocation;
import Entity.Concretes.Places.Select.ISelectNormalLocation;
import Game.Game;
import Player.Player;

public class GameWorker extends Game implements ISelectBattleLocation,ISelectNormalLocation {
    public Scanner scanner=new Scanner(System.in);
    Game game=new Game();
    BaseCharacterWorker baseCharacterWorker=new BaseCharacterWorker();
    CharacterDatabase characterDatabase=new CharacterDatabase();
    BaseLocationWorker baseLocationWorker=new BaseLocationWorker();
    BattleLocationDatabase battleLocationDatabase=new BattleLocationDatabase();
    NormalLocationDatabase normalLocationDatabase=new NormalLocationDatabase();
    MonsterDatabase monsterDatabase=new MonsterDatabase();

    public void Login(){
        System.out.println("--------------------------------Welcome to Advanced Game-------------------------------------");
        System.out.print("Enter your username : ");
        String pUserName=scanner.next();
        player=new Player(pUserName);
        System.out.println("*********************************************************************************************");
        System.out.println("\t\t\tWelcome : "+player.getUserName());
        System.out.println("*********************************************************************************************");
    }

    public void Start(){
        System.out.println("*********************************************************************************************");
        System.out.println("-------------------------------Start to Game-------------------------------------------------");
        System.out.println("*********************************************************************************************");
        System.out.println("*******************************Character Select***********************************************");
        baseCharacterWorker.ShowInformation(characterDatabase.SamuraiCharacterCreate());
        System.out.println("*********************************************************************************************");
        baseCharacterWorker.ShowInformation(characterDatabase.ArcherCharacterCreate());
        System.out.println("*********************************************************************************************");
        baseCharacterWorker.ShowInformation(characterDatabase.KnightCharacterCreate());
        System.out.println("*********************************************************************************************");
        System.out.print("Please Enter Character id : ");
        int id=scanner.nextInt();
        characterDatabase.idControl(id);
        System.out.println("*******************************Location Select***********************************************");
        normalLocationDatabase.ShowInformation(normalLocationDatabase.SafeHouseLocationCreate());
        battleLocationDatabase.ShowInformation(battleLocationDatabase.CaveLocationCreate());
        battleLocationDatabase.ShowInformation(battleLocationDatabase.ForestLocationCreate());
        battleLocationDatabase.ShowInformation(battleLocationDatabase.RiverLocationCreate());
        normalLocationDatabase.ShowInformation(normalLocationDatabase.ShoppLocationCreate());
        System.out.print("Please Enter Location id : ");
        int _id=scanner.nextInt();
        battleLocationDatabase.idControl(_id);
        System.out.println("*********************************************************************************************");
    }

    @Override
    public void SelectLocation(NormalLocation _nNormalLocation) {
        game.setLocation(_nNormalLocation);
        
    }

    @Override
    public void SelectLocation(BattleLocation _BattleLocation) {
        game.setLocation(_BattleLocation);
        
    }

}
