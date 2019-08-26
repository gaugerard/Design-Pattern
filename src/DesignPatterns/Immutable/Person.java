package DesignPatterns.Immutable;

/*
source : http://lkumarjain.blogspot.com/2016/02/immutable-design-pattern.html

* Implementation:

Don’t provide any methods that modify the object’s state (No method, other then constructor should modify the values of
class's instance variables)

Ensure that the class can’t be extended (Generally accomplished by making the class final to avoid sub classing)

Make all fields private and final (This prevents clients from obtaining access to mutable objects referred to by fields
and modifying these objects directly)

Ensure exclusive access to any mutable components (If your class has any fields that refer to mutable objects, ensure
that clients of the class cannot obtain references to these objects)

Any method that computes new state information must store the information in a new instance of the same class rather
then modifying the existing object's state.
* */

public final class Person {

    private final String name;
    private final int age;
    private final String[] friends;

    public Person(String name, int age,  String[] friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String[] getFriends() {
        return this.friends;
    }
}
