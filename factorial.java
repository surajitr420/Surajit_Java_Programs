import java.util.*;

public class factorial {

    static int fact(int n) {
        if (n == 0){
            return 1;
        }
        return n* fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        System.out.print("factorial of " + num + " is " + fact(num));
    }

}




