package Configuration;

public class MyConfig implements Configuration{

    private A a;
    private B b;
    private C c;

    public MyConfig setA(A _a){
        a = _a;
        return this;
    }

    public MyConfig setB(B _b){
        b = _b;
        return this;
    }


    public MyConfig setC(C _c){
        c = _c;
        return this;
    }

    @Override
    public void configure() throws BadPreCondition {
        if (a == null || b == null || c == null){
            throw new BadPreCondition();
        }

        a.setB(b); // a is linked to B
        a.setC(c); // a has a link with B object
        b.setC(c); // b has a link with C
        c.setA(a); // c has a link with A
        a.configure();
        b.configure();
        c.configure();
    }
}
