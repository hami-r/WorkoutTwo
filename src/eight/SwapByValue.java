package eight;

public class SwapByValue {
    public static void main(String[] args){
        int a = 10;
        int b = -20;
        System.out.println("Before swapping, a = " + a + " and b = " + b);
        swap(a, b);
        System.out.println("After swapping, a = " + a + " and b is " + b);
    }
    public static void swap(int a, int b) {
        System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }
}