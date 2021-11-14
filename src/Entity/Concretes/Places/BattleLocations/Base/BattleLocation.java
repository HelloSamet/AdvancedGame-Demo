package Entity.Concretes.Places.BattleLocations.Base;

import Entity.Base.BaseLocation;
import Entity.Base.BaseMonster;
import Entity.Concretes.Goods.Base.Goods;
import Player.Player;

public abstract class BattleLocation extends BaseLocation {

    protected BaseMonster baseMonster;
    protected Goods goods;
    

    public BattleLocation() {
    }

    public BattleLocation(Player player, String _locationName,int _id,BaseMonster _baseMonster, String _propertys,Goods _goods) {
        super(player, _locationName,_id,_propertys);
        setBaseMonster(_baseMonster);
        setGoods(_goods);
    }

    public BaseMonster getBaseMonster() {
        return baseMonster;
    }

    public void setBaseMonster(BaseMonster baseMonster) {
        this.baseMonster = baseMonster;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public boolean getLocation(){
        return true;
    }
    

}
