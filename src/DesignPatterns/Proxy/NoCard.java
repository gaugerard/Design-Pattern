package DesignPatterns.Proxy;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine){

        atmMachine = newATMMachine;
    }

    public void insertCard(){
        System.out.println("Please Enter a PIN");
        atmMachine.setATMState(atmMachine.getYesCardState());

    }

    public void ejectCard(){
        System.out.println("Please a card first");
    }

    public void insertPin(int pinEntered){
        System.out.println("Please a card first");

    }

    public void requestCash(int cashToWithdraw){
        System.out.println("Please a card first");
    }
}
