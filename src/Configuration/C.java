package Configuration;

public class C implements ConfigElement {

    private A a;

    @Override
    public Object configure() throws BadPreCondition{
        System.out.println("C is Linked to " + a.toString());
        return null;
    }

    public final A getA() {
        return a;
    }
    public final void setA(A a) {
        this.a = a;
    }

    public String toString() {
        return "C";
    }
}
