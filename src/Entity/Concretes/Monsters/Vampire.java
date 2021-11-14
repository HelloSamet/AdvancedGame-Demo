package Entity.Concretes.Monsters;

import Entity.Base.BaseMonster;

public class Vampire extends BaseMonster {
    //Vampir,2,4,14,7
    public Vampire() {
    }

    public Vampire(String monsterName, int id, int damage, int healthy, int money) {
        super(monsterName, id, damage, healthy, money);
    }
    
}
