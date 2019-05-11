package Proxy_1;

public class ProxyImage implements Image {

    // ProxyImage removes to manually load the image from the disk. Here it is the realImage that will load from the
    // disk.

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display(){

        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
