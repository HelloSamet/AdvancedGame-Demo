package Entity.Concretes.Places.NormalLacotions.Concretes;

import Entity.Concretes.Places.NormalLacotions.Base.NormalLocation;
import Player.Player;

public class SafeHouse extends NormalLocation {

   
    public SafeHouse(Player player, String _locationName,int _id , String _propertys) {
        super(player, _locationName,_id, _propertys);
    }


    public SafeHouse() {
    }


    @Override
    public boolean getLocation() {
        player.getBaseCharacter().setHealthy(player.getBaseCharacter().getrHealthy());
        System.out.println("You are Healed...!");
        System.out.println("you are in the safe house now");
        return false;
    }
    
}
