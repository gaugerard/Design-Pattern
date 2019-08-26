package DesignPatterns.Mediator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatRoom {

    static List<String> savedPictures = new ArrayList<String>();

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " ["+ user.getName() + "] : " + message);
    }

    public static void showImage(User user, String image){
        System.out.println(new Date().toString() + " ["+ user.getName() + "] : Image -> " + image);
        savedPictures.add(image);
    }

}
