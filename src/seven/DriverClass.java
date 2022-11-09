package seven;

public class DriverClass{
    public static void main(String[] args) throws Throwable {
        Test t1 = new Test();
        garbageCollector();
        Test.dispalyCount();

        Test t3 = t1;
        garbageCollector();
        Test.dispalyCount();

        Test t2 = new Test();
        Test.dispalyCount();

        Test t4 = t2;
        Test.dispalyCount();
        garbageCollector();

        t4 = null;
        garbageCollector();
        Test.dispalyCount();
    }

    static void garbageCollector() throws Throwable {
        System.out.println("Running garbage collection...");
        System.gc();

    }





}
