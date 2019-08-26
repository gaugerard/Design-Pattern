package DesignPatterns.Interceptor;

class AuthenticationFilter implements Filter {

    public void execute(String request) {
        System.out.println("Authenticating : " + request);
    }
}
