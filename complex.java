import java.util.*;

class Complex_Number {
    int a, b;
    Scanner sc = new Scanner(System.in);

    void getNum() {
        System.out.print("Enter the real part  : ");
        a = sc.nextInt();
        System.out.print("Enter the imaginary part  : ");
        b = sc.nextInt();
    }

    void show() {
        System.out.println("The complex number is " + a + " + "+b+"i");
    }

    void Add(Complex_Number A, Complex_Number B){
        Complex_Number Sum = new Complex_Number();
        Sum.a= A.a +B.a;
        Sum.b=A.b+B.b;
        Sum.show();
    }
}



public class complex {
    public static void main(String[] args) {
        Complex_Number c1 = new Complex_Number();
        c1.getNum();
        c1.show();
        Complex_Number c2 = new Complex_Number();
        c2.getNum();
        c2.show();
        c1.Add(c1, c2);
        
    }
}
