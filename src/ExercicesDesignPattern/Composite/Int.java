package ExercicesDesignPattern.Composite;

public class Int extends IComponent {

    private String id;
    private int value;

    Int(String id, int value){
        this.id = id;
        this.value = value;
    }

    @Override
    public String showName(){
        return ("Int "+ id + " : " + value + ";");

    }

    @Override
    public int showSize(){
        return value;
    }
}
