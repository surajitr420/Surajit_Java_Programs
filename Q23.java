class Figure {
    double a , b;

    void area() {
        System.out.println("Area = " + (a * b));
    }

}

class rectangle extends Figure {

}

class triangle extends Figure {
    void area() {
        double areaTriangle = 0.5*a*b;
        System.out.println("Area = " +areaTriangle);
    }
}

public class Q23 {
    public static void main(String[] args){
        rectangle r1= new rectangle();
        r1.a=9.8;
        r1.b=4;
        r1.area();

        triangle t1 = new triangle();
        t1.a=6;
        t1.b=7;
        t1.area();

    }

}
