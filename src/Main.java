import mylib.*;
public class Main {
    public static void main(String[] args) {
        About.print();
        Performance.start();
        long sum = 0;
        for (int i = 0; i < 100_000; i++) sum+=i;
        Performance.check();
        sum = 0;
        for (int i = 0; i < 1_000_000; i++) sum+=i;
        Performance.check();
    }
}
