
public class overloading {
    static double area(double r){
        double a=3.14*r*r;
        return a;
    }
    static double area(double l, double w){
        double a=l*w;
        return a;
    }
    static int area(int l, int w){
        int a=l*w;
        return a;
    }
    static double areaSquare(double a){
        double area=a*a;
        return area;
    }
    static int areaSquare(int a){
        int area=a*a;
        return area;
    }

    public static void main(String[] args){
        System.out.println("Area of the circle is : "+area(8));

        System.out.println("If parameters are in double Area of the rectangle is : "+area(4.5 ,5.6));

        System.out.println("If parameters are in integer Area of the rectangle is : "+area(4 ,5));

        System.out.println("If parameters are in integer Area of the Square is : "+areaSquare(4));

        System.out.println("If parameters are in double Area of the Square is : "+areaSquare(4.1));


    }
}
