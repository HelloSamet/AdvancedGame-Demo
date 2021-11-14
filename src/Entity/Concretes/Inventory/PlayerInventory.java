package Entity.Concretes.Inventory;

import Player.Player;

public class PlayerInventory {

    Player player;
    

    public PlayerInventory() {
        this.player=new Player();   
    }


    public void ShowInventory(){
        player.getInventory();
    }

    
    
    
}
