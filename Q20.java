class A1{
    int i=6;
}

class B1 extends A1{

}

public class Q20 {
    public static void main(String[] args){
        B1 ob1 = new B1();
        A1 ob2 = new A1();
        System.out.println(ob1.i);

        System.out.println(ob2.i);


    }
}
