import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Thread myFirst=new Thread(()->{
            System.out.println("hi1");
        });
        Thread myFirst1=new Thread(()->{
            System.out.println("hi2");
        });
        Thread myFirst3=new Thread(()->{
            System.out.println("hi3");
        });
        myFirst.start();
        myFirst1.start();
        myFirst3.start();
        System.out.println("hiout");
    }
}