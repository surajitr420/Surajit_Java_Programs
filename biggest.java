public class biggest {

    public static void main(String[] args) {
        int a = 8, b = 8, c = 8;
        if (a > b && a > c) {
            System.out.println("a = " + a + " is greatest");
        } else if (b > a && b > c) {
            System.out.println("b = " + b + " is greatest");
        } else if(c > a && c > b) {
            System.out.println("c = " + c + " is the greatest");
        }else{
            System.out.println("There are equal number");
        }
    }
}



