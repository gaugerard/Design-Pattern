package ExercicesDesignPattern.Composite;

import java.util.ArrayList;

public class Json extends IComponent {

    private String id;
    private ArrayList<IComponent> elements;

    Json(String id){
        this.id = id;
        this.elements = new ArrayList<IComponent>();
    }

    @Override
    public String showName(){
        StringBuilder info = new StringBuilder();
        info.append("Json ").append(id).append(" { ");
        for (IComponent component : elements){
            info.append("\n").append(component.showName());
        }
        info.append("}");
        return info.toString();
    }

    @Override
    public int showSize(){
        int value = 0;
        for (IComponent component : elements){
            value += component.showSize();
        }
        return value;
    }

    void addElement(IComponent element){
        elements.add(element);
    }

    void removeElement(IComponent element){
        elements.remove(element);
    }

    ArrayList<IComponent> getElements(){
        return elements;
    }


}
