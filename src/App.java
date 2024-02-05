class MyClass {
void task() {
        for (int i=0;i<10;i++){
            System.out.println("doc-"+i+"-myclass");
        }
    }
    }

public class App {
    public static void main(String[] args) {

        System.out.println("111233333");

        MyClass m=new MyClass();
        m.task();

        for (int i=0;i<10;i++){
            System.out.println("doc-"+i+"-app");
        }

        System.out.println("2223");

    }
}