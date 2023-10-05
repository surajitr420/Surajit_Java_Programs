class Student {
    String name;
    int idNo;
}

class Teacher extends Student {
    void show() {
        System.out.println(name + " : " + idNo);
    }
}

public class sub_class {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Ram";
        t1.idNo = 555555;
        t1.show();
    }
}
