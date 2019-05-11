package Proxy;

public class TestATMMachine {

    public static void main(String[] args){
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        atmMachine.requestCash(2000);

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        GetATMData realATMMachine = new ATMMachine();

        GetATMData atmProxy = new ATMProxy();

        System.out.println("\nCurrent ATM State " + atmProxy.getATMData());

        System.out.println("\nCash in ATM Machine " + atmProxy.getCashInMachine());

        // atmProxy.setcashInMachine(10); ==> will prevent the set of cash value :)

        // realATMMachine.setcashInMachine(10); ==> will also prevent this from happening because realATMMachine is a GetATMData


        // /!\ The proxy prevents us from modifying important data. ex: Here with the ATMMachine object, we can modify the cash amount.
        atmMachine.setCashInMachine(100000);
        System.out.println(atmMachine.getCashInMachine());
    }
}
