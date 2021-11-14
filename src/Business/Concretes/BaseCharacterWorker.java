package Business.Concretes;

import Business.Abstracts.IBaseCharacterWorkerService;
import Entity.Base.BaseCharacter;

public class BaseCharacterWorker implements IBaseCharacterWorkerService {

    @Override
    public void ShowInformation(BaseCharacter baseCharacter) {
       System.out.println
       (
           "\t\t\tCharacter Name : "+baseCharacter.getCharacterName()+"\nCharacter Id : "+baseCharacter.getId()+"\tCharacter Damage : "+baseCharacter.getDamage()+
           "\tCharacter Healthy : "+baseCharacter.getHealthy()+"\tCharacter Money : "+baseCharacter.getMoney()
       );
        
    }
    
}
