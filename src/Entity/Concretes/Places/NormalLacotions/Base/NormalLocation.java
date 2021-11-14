package Entity.Concretes.Places.NormalLacotions.Base;

import Entity.Base.BaseLocation;
import Player.Player;

public abstract class NormalLocation extends BaseLocation {
    int id;
    public NormalLocation(Player player, String _locationName,int _id ,String _propertys) {
        super(player, _locationName,_id, _propertys);
    }

    public NormalLocation() {
    }

    public  boolean getLocation(){
        return true;
    }
}
