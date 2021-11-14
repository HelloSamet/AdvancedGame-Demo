package Player;

import Entity.Base.BaseCharacter;
import Entity.Concretes.Inventory.Inventory;

public class Player {
    private String userName;
    private Inventory inventory;
    private BaseCharacter baseCharacter;
    

    public Player() {
    }

    public Player(String userName) {
        this.userName = userName;
        this.inventory=new Inventory();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public BaseCharacter getBaseCharacter() {
        return baseCharacter;
    }

    public void setBaseCharacter(BaseCharacter baseCharacter) {
        this.baseCharacter = baseCharacter;
    }

    
}
