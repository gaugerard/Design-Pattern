package DesignPatterns.Proxy_1;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("loading " + this.filename + " from disk.");
    }

    @Override
    public void display(){
        System.out.println("displaying file " + filename);
    }
}
