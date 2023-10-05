// class Box{
//     double height ,width, depth ;

// }
// public class boxVol{
//     public static void main(String[] args){
//         Box b1 = new Box();
//         double vol;
//         b1.height=10;
//         b1.width=10;
//         b1.depth=10;
//         vol = b1.height*b1.width*b1.depth;
//         System.out.println("Volume of the box is "+vol);
//     }
// }




class Box {
    double height, width, depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void volume() {
        System.out.println("Volume of the box is " + (height * width * depth));
    }
}

public class boxVol {

    public static void main(String[] args) {
        Box b1 = new Box(10, 10, 10);

        b1.volume();
    }
}

