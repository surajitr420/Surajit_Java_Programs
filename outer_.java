class Outer {
    static int outer_x = 5;

    void test() {

    }

    static class Inner {
        void display() {
            System.out.println(outer_x);
        }
    }
}

public class outer_ {
    public static void main(String[] args) {

        Outer.Inner ob2 = new Outer.Inner();
        ob2.display();
    }
}
