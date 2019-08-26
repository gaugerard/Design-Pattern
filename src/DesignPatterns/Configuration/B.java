package DesignPatterns.Configuration;

public class B implements ConfigElement{

    private C c;

    @Override
    public Object configure() throws BadPreCondition{
        System.out.println("B is Linked to " + c.toString());
        return null;
    }

    public final C getC() {
        return c;
    }
    public final void setC(C c) {
        this.c = c;
    }

    public String toString() {
        return "B";
    }
}
