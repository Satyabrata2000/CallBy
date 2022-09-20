package CallBy;

public class CallByValueExample2 {

    int data = 20;

    void change(CallByValueExample2 cv){
        cv.data = cv.data + 20; //changes will be in the instance variable
    }

    public static void main(String[] args) {

        CallByValueExample2 cv = new CallByValueExample2();
        System.out.println("before change " + cv.data);
        cv.change(cv); //passing object
        System.out.println("after change " + cv.data);
    }
}
