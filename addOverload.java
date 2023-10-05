public class addOverload {

    static void add(int a , int b){
        System.out.println(a+b);
    }
    static void add(double a , double b){

        System.out.println(a+b);
    }
    public static void main(String[] args){
        add(5,5);
        add(5,6.7);

    }
}
