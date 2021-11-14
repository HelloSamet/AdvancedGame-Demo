package Database.Concretes.MonsterDatabase;

import Database.Abstracts.MonsterService.IMonsterDatabaseService;
import Entity.Base.BaseMonster;
import Entity.Concretes.Monsters.Bear;
import Entity.Concretes.Monsters.Vampire;
import Entity.Concretes.Monsters.Zombie;

public class MonsterDatabase implements IMonsterDatabaseService {

    Bear bear;
    Vampire vampire;
    Zombie zombie;

    

    public MonsterDatabase() {
        this.bear = new Bear();
        this.vampire = new Vampire();
        this.zombie = new Zombie();
    }

    @Override
    public BaseMonster BearMonsterCreate() {
       this.bear.setMonsterName("Bear");
       this.bear.setId(3);
       this.bear.setDamage(7);
       this.bear.setHealthy(20);
       this.bear.setMoney(12);
       return this.bear;
    }

    @Override
    public BaseMonster VampireMonsterCreate() {
       this.vampire.setMonsterName("Vampire");
       this.vampire.setId(2);
       this.vampire.setDamage(4);
       this.vampire.setHealthy(14);
       this.vampire.setMoney(7);
       return this.vampire;
    }

    @Override
    public BaseMonster ZombieMonsterCreate() {
       this.zombie.setMonsterName("Zombie");
       this.zombie.setId(1);
       this.zombie.setDamage(3);
       this.zombie.setHealthy(10);
       this.zombie.setMoney(4);
       return this.zombie;
    }

   public void setBear(Bear bear) {
      this.bear = bear;
   }

   public Bear getBear() {
      return this.bear;
   }

   public void setVampire(Vampire vampire) {
      this.vampire = vampire;
   }

   public Vampire getVampire() {
      return this.vampire;
   }

   public void setZombie(Zombie zombie) {
      this.zombie = zombie;
   }

   public Zombie getZombie() {
      return this.zombie;
   }

   
    
    
}
