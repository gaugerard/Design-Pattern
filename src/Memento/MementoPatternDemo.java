package Memento;

public class MementoPatternDemo {
    public static void main(String[] args) {

        // Originator creates and stores states in Memento objects.
        Originator originator = new Originator();
        // Caretaker object is responsible to restore object state from Memento.
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        // Originator saves the state in a Memento.
        // Then --> the CareTaker add the Memento to its Memento's List.
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        // Originator saves the state in a Memento.
        // Then --> the CareTaker add the Memento to its Memento's List.
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}