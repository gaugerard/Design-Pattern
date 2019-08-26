package DesignPatterns.PlayerRole;

public abstract class AbstractRole {

    protected Object[] attributes = null;
    private Player player;

    protected AbstractRole(){}

    public void configure(Object[] objects){
        attributes = objects;
    }

    public void setPlayer(Player player){
        assert player!=null;

        this.player=player;
    }

    public Player getPlayer(){
        return player;
    }
}
