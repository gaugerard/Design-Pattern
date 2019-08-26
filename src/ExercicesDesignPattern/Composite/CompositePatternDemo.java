package ExercicesDesignPattern.Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Json person = new Json("Gauthier");

        Str schoolYear = new Str("class", "Master 1");
        Int age = new Int("age", 22);
        person.addElement(schoolYear);
        person.addElement(age);

        Json person1 = new Json("Xavier");

        Str schoolYear1 = new Str("class", "BodyGuard 1");
        Int age1 = new Int("age", 20);
        person1.addElement(schoolYear1);
        person1.addElement(age1);

        Json dictionary = new Json("JSON");
        dictionary.addElement(person);
        dictionary.addElement(person1);

        System.out.println(dictionary.showName());

    }
}