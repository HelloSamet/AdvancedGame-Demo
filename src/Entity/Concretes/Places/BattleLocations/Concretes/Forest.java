package Entity.Concretes.Places.BattleLocations.Concretes;

import Entity.Base.BaseMonster;
import Entity.Concretes.Goods.Base.Goods;
import Entity.Concretes.Places.BattleLocations.Base.BattleLocation;
import Player.Player;

public class Forest extends BattleLocation {

    

    public Forest(Player player, String _locationName, int _id, BaseMonster _baseMonster, String _propertys,
            Goods _goods) {
        super(player, _locationName, _id, _baseMonster, _propertys, _goods);
    }

    public Forest() {
    }
    //Orman Vampir(1-3) Savaş+ganimet Odun

    
}
