package DesignPatterns.ReadOnly;

public class MainReadOnly {

    public static void main(String[] args){
        Manager m = new Manager();
        Employee e = new Employee();

        Accounts a = new Accounts();

        // we link the Accounts a to the variable allAccess of the Manager.
        m.allAccess = a;
        m.allAccess.setValue("Andrew");

        System.out.println(m.allAccess.getValue());

        // We link the Accounts a to the variable accountsReadOnly
        // Which is of type "AccountsReadOnly" ==> it only gets the getValue method
        // Which is implemented by the Accounts object "a".
        // Technically "a" has implement both functions Set and Get but since the Employee only access it trough
        // a AccountsReadOnly object, he is limited to the getValue().
        e.accountsReadOnly = a;
        System.out.println(e.accountsReadOnly.getValue());
    }

}
