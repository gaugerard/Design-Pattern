package Immutable;

import java.util.ArrayList;
import java.util.Arrays;

public class ImmutableDemo {

    public static void main(String[] args){
        String[] friends = {"Jean", "Charles", "Vulgaire"};
        Person person = new Person("Gauthier", 22, friends );

        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(Arrays.toString(person.getFriends()));
    }
}
