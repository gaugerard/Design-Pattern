package DesignPatterns.Proxy;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine){

        atmMachine = newATMMachine;
    }


    public void insertCard(){
        System.out.println("We don't have money");

    }

    public void ejectCard(){
        System.out.println("We don't have money. You didn't enter a card");

    }

    public void insertPin(int pinEntered){
        System.out.println("Already Entered PIN");

    }

    public void requestCash(int cashToWithdraw){
        System.out.println("We don't have money");
    }
}
