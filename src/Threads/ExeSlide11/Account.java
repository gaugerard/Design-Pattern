package Threads.ExeSlide11;

public class Account {
    private int solde;

    Account(){solde = 1000;}

    // synchronized allowed only one thread at a time to have access to this method.
    synchronized public boolean retrait(int montant){
        if(solde >= montant){
            solde = solde-montant;
            System.out.println("Moins " + Integer.toString(montant));
            return true;
        } else {
            System.out.println("Pas asser d'argent sur le compte");
            return false;
        }
    }
}
