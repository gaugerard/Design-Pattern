package Threads.ExeSlide11;

public class Job implements Runnable{

    private Account account;
    private int somme;

    Job(Account ac, int s){
        account = ac;
        somme = s;
    }

    @Override
    public void run() {
        account.retrait(somme);
    }
}
