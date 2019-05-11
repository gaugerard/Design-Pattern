package Mediator;

public class MediatorPatternDemo {

    public static void main(String[] args){
        User gauthier = new User("Gauthier");
        User john = new User("John");

        gauthier.sendMessage("Hi! John!");
        john.sendMessage("Hello! Gauthier!");
    }
}
