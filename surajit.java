class circle {
    double r;

    circle(double radius) {
        r = radius;
    }

    double area() {
        return 3.14 * r * r;
    }

    double circumference() {
        return 3.14 * r * 2;
    }

}

class Main {
    public static void main(String[] args) {
        circle c1 = new circle(6);
        System.out.println("Area of the circle is " + c1.area());
        System.out.println("Circumference of the circle is " + c1.circumference());
    }
}
