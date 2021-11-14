package Entity.Concretes.Monsters;

import Entity.Base.BaseMonster;

public class Zombie extends BaseMonster {
    //Zombi,1,3,10,4
    public Zombie() {
    }

    public Zombie(String monsterName, int id, int damage, int healthy, int money) {
        super(monsterName, id, damage, healthy, money);
    }
    
}
