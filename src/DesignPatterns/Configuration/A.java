package DesignPatterns.Configuration;

public class A implements ConfigElement {
    private B b;
    private C c;

    @Override
    public Object configure() throws BadPreCondition{
        System.out.println("A is Linked to " + b.toString() + ", " + c.toString());
        return null;
    }

    public final B getB() {
        return b;
    }
    public final void setB(B b) {
        this.b = b;
    }

    public final C getC() {
        return c;
    }
    public final void setC(C c) {
        this.c = c;
    }

    public String toString() {
        return "A";
    }
}
