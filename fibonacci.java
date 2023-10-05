
public class fibonacci {

    static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        int num = 3, count;
        for (count = 0; count < num; count++) {
            System.out.println(fib(count));
        }
    }
}
