class Student{
    int a;
    Student(){

    }
    Student (String name){
        this();
        System.out.println(name);
    }
    Student (String name , int rollno){
        this(name);
        System.out.println(rollno);
    }
}
public class constructor_chaining {
    public static void main(String[] args){
        new Student("Ram", 56);
        
    }
}
