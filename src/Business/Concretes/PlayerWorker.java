package Business.Concretes;

import Business.Abstracts.IPlayerWorkerService;
import Entity.Base.BaseCharacter;
import Player.Player;

public class PlayerWorker implements IPlayerWorkerService {
    private Player player;

    
    
    public Player getPlayer() {
        return player;
    }



    public void setPlayer(Player player) {
        this.player = player;
    }


    public PlayerWorker(){
        
    }

    public PlayerWorker(Player player) {
        this.player = player;
    }



    @Override
    public void SelectCharacter(BaseCharacter baseCharacter) {
        player.setBaseCharacter(baseCharacter);
        
    }
    
}
