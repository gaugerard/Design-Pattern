package Interceptor;

/*
* Advantages :

Improved reusability: Common code is centralized in pluggable components enhancing reuse.

Increased flexibility: Generic common components can be applied and removed declaratively, improving flexibility.

Disadvantages :

Information sharing is inefficient in intercepting pattern.
*/

public class InterceptorFilterPattern {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("Downloads");

    }
}
