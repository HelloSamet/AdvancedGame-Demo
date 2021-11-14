package Database.Concretes.CharacterDatabase;

import Business.Concretes.BaseCharacterWorker;
import Database.Abstracts.CharacterService.ICharacterDatabaseService;
import Entity.Base.BaseCharacter;
import Entity.Concretes.Characters.Archer;
import Entity.Concretes.Characters.Knight;
import Entity.Concretes.Characters.Samurai;

public class CharacterDatabase implements ICharacterDatabaseService
{
        BaseCharacterWorker baseCharacterWorker;
        Archer archer;
        Knight knight;
        Samurai samurai;

        public CharacterDatabase() {
            this.baseCharacterWorker=new BaseCharacterWorker();
            this.archer=new Archer();
            this.knight=new Knight();
            this.samurai=new Samurai();
        }

        @Override
        public BaseCharacter ArcherCharacterCreate() {
            
            this.archer.setCharacterName("Archer");
            this.archer.setId(2);
            this.archer.setDamage(7);
            this.archer.setHealthy(18);
            this.archer.setMoney(20);
            return  this.archer;
        }

        @Override
        public BaseCharacter KnightCharacterCreate() {
            
            this.knight.setCharacterName("Knight");
            this.knight.setId(3);
            this.knight.setDamage(8);
            this.knight.setHealthy(24);
            this.knight.setMoney(5);
            return  this.knight;
        }

        @Override
        public BaseCharacter SamuraiCharacterCreate() {
        
            this.samurai.setCharacterName("Samurai");
            this.samurai.setId(1);
            this.samurai.setDamage(5);
            this.samurai.setHealthy(21);
            this.samurai.setMoney(15);
            return  this.samurai;
        }

        @Override
        public void idControl(int _id) {
            switch(_id)
            {
                case 1:
                    System.out.println( this.samurai.getCharacterName()+"- Character Selected.");
                    System.out.println("*********************************************************************************************");
                    this.baseCharacterWorker.ShowInformation(SamuraiCharacterCreate());
                    break;
                case 2:
                    System.out.println( this.archer.getCharacterName()+"- Character Selected.");
                    System.out.println("*********************************************************************************************");
                    this.baseCharacterWorker.ShowInformation(ArcherCharacterCreate());
                    break;
                case 3:
                    System.out.println( this.knight.getCharacterName()+"- Character Selected.");
                    System.out.println("*********************************************************************************************");
                    this.baseCharacterWorker.ShowInformation(KnightCharacterCreate());
                    break; 
                default:
                    System.out.println( this.samurai.getCharacterName()+"- Character Selected.");
                    System.out.println("*********************************************************************************************");
                    this.baseCharacterWorker.ShowInformation(SamuraiCharacterCreate());
                break;
            }
        }
    
}
