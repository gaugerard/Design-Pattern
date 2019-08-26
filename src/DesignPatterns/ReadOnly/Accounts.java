package DesignPatterns.ReadOnly;

public class Accounts implements AccountsReadOnly {

    private String name;

    public Accounts(){
        name = "unknown";
    }

    @Override
    public String getValue() {
        return name;
    }

    public void setValue(String name) {
        this.name = name;
    }
}
