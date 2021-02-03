package mylib;
public abstract class Performance {
    private static long start = getMillis();
    private static long getMillis() {
        return System.currentTimeMillis();
    }
    public static void start() {
        start = getMillis();
        System.out.println("Засекли время...");
    }
    public static void check() {
        long finish = getMillis();
        System.out.println("Прошло милисекунд: " + (finish - start));
        start = getMillis();
    }
}
