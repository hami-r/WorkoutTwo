package eight;

public class SwapByReference {
    public static void main(String[] args) {
        Obj a = new Obj (10);
        Obj b = new Obj (-20);
        System.out.println("Before swapping, a = " + a.number + " and b = " + b.number);
        swap(a, b);
        System.out.println("After swapping, a = " + a.number + " and b is " + b.number);
    }
    public static void swap(Obj  a,Obj  b) {
        System.out.println("Before swapping(Inside), a = " + a.number + " b = " + b.number);
        // Swap n1 with n2
        Obj c = new Obj (a.number);
        a.number = b.number;
        b.number = c.number;
        System.out.println("After swapping(Inside), a = " + a.number + " b = " + b.number);
    }
}
