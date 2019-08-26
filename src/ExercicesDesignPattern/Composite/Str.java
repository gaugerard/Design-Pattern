package ExercicesDesignPattern.Composite;

public class Str extends IComponent{

    private String id;
    private String value;

    Str(String id, String value){
        this.id = id;
        this.value = value;
    }

    @Override
    public String showName(){
        return ("Str "+ id + " : " + value + ";");

    }

    @Override
    public int showSize(){
        return value.length();
    }
}
