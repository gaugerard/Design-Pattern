package Interceptor;

class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("Log: " + request);
    }
}