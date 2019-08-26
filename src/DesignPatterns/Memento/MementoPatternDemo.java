package DesignPatterns.Memento;

public class MementoPatternDemo {
    public static void main(String[] args) {

        // Originator creates and stores states in DesignPatterns.Memento objects.
        Originator originator = new Originator();
        // Caretaker object is responsible to restore object state from DesignPatterns.Memento.
        CareTaker careTaker = new CareTaker();

        originator.setState("DesignPatterns.State #1");
        originator.setState("DesignPatterns.State #2");
        // Originator saves the state in a DesignPatterns.Memento.
        // Then --> the CareTaker add the DesignPatterns.Memento to its DesignPatterns.Memento's List.
        careTaker.add(originator.saveStateToMemento());

        originator.setState("DesignPatterns.State #3");
        // Originator saves the state in a DesignPatterns.Memento.
        // Then --> the CareTaker add the DesignPatterns.Memento to its DesignPatterns.Memento's List.
        careTaker.add(originator.saveStateToMemento());

        originator.setState("DesignPatterns.State #4");
        System.out.println("Current DesignPatterns.State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved DesignPatterns.State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved DesignPatterns.State: " + originator.getState());
    }
}