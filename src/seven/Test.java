package seven;


public class Test {
    public static int count = 0;
    Test() {
        System.out.println("Object created...");
        count++;
    }

    public static void dispalyCount() {
        System.out.println("Number of objects alive: " + count);
    }

    @Override
    protected void finalize(){
        System.out.println("Object is destroyed...");
        Test.count--;
    }


}
