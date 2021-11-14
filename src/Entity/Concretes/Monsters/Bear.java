package Entity.Concretes.Monsters;

import Entity.Base.BaseMonster;

public class Bear extends BaseMonster {
    //Ayı,3,7,20,12
    public Bear() {
    }

    public Bear(String monsterName, int id, int damage, int healthy, int money) {
        super(monsterName, id, damage, healthy, money);
    }
    
}
