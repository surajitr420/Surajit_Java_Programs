class A2{
    int x=5,y=6;

    void show(){
        System.out.println("x = "+x+"\ny = "+y);
    }
}


class B2 extends A2{
    int z=7;
    void show(){
        System.out.println("x = "+x+"\ny = "+y+ "\nz = "+z);

    }
}


public class Q21 {
    public static void main(String[] args){
        B2 ob =new B2();
        ob.show();
    }
}
