package Entity.Base;

import Player.Player;

public abstract class BaseLocation {

    protected Player player;
    protected String locationName;
    protected String propertys;
    protected int id;
    
    public BaseLocation() {
    }

    public BaseLocation(Player player, String locationName, int id ,String propertys) {
        this.player = player;
        this.locationName = locationName;
        this.propertys = propertys;
        this.id = id;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String name) {
        this.locationName = name;
    }

    public String getPropertys() {
        return propertys;
    }

    public void setPropertys(String propertys) {
        this.propertys = propertys;
    }

    public abstract boolean getLocation();
}
