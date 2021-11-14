package Business.Concretes;

import Business.Abstracts.IBaseMonsterWorkerService;
import Entity.Base.BaseMonster;

public class BaseMonsterWorker implements IBaseMonsterWorkerService {

    @Override
    public void ShowInformation(BaseMonster _baseMonster) {
       System.out.println
       (
        "\t\t\tMonster Name : "+_baseMonster.getMonsterName()+"\tMonster Id : "+_baseMonster.getId()+"\tMonster Damage : "+_baseMonster.getDamage()+
        "\tMonster Healthy : "+_baseMonster.getHealthy()+"\tMonster Money : "+_baseMonster.getMoney()
       );
        
    }
    
}
