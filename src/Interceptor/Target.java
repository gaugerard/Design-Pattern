package Interceptor;

class Target {

    public void execute(String request) {
        System.out.println("Executing : " + request);
    }
}