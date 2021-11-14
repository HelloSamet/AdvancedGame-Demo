package Business.Concretes;

import Business.Abstracts.IBaseArmorWorkerService;
import Entity.Base.BaseArmor;

public class BaseArmorWorker implements IBaseArmorWorkerService {

    ShoppingCenterWorker shopp;
    @Override
    public void ShowInformation(BaseArmor _baseArmor) {
        System.out.println
        (
            "\t\t\tArmor Name : "+_baseArmor.getArmorName()+"\tArmor Id : "+_baseArmor.getId()+"\tArmor Absorbe : "+_baseArmor.getAbsorbe()+
            "\tArmor Money : "+_baseArmor.getMoney()
        );
    }

    @Override
    public void Add(BaseArmor baseArmor) {
       shopp.Add(baseArmor);
    }
    
}
