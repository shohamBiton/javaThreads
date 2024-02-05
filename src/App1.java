class Printer {
    void print(int num) {
        for (int i=0;i<num;i++){
            System.out.println(i+"-Print");
        }
    }
}

class MyTread extends Thread{
    Printer pRef;

    MyTread(Printer p){
        pRef=p;
    }

    @Override
    public void run(){
        pRef.print(10);
    }
}
public class App1 {
    public static void main(String[] args) {
        System.out.println("111");
        Printer p=new Printer();
        MyTread mRef=new MyTread(p);
        mRef.start();
        p.print(5);
        System.out.println("222");

    }
    }
