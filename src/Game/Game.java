package Game;

import Entity.Base.BaseLocation;
import Player.Player;

public class Game {
    protected Player player;
    protected BaseLocation Location;
    
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public BaseLocation getLocation() {
        return Location;
    }
    public void setLocation(BaseLocation location) {
        Location = location;
    }

    
}
