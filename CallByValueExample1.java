package CallBy;

public class CallByValueExample1 {

    int data = 50;

    void change(int data){
        data = data+100; //changes will be in the local variable only
    }

    public static void main(String[] args) {
        CallByValueExample1 cv = new CallByValueExample1();
        System.out.println("before change " + cv.data);
        cv.change(500);
        System.out.println("after change " + cv.data);
    }
}
