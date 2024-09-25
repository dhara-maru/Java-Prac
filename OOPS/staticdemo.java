
class student {

    String name;
    static String school;

    public static void changeschool() {
        student.school = "SU";

    }

}

public class staticdemo {

    public static void main(String[] args) {
        student.school = "DU"; //static stuff is accessed using class name bcoz it's the stuff of class. not object's.
        student s1 = new student();
        s1.name = "Dhara";
        System.out.println(s1.school);  //DU for now and if school name is changed then here it'll also reflext.
        s1.changeschool();
        System.out.println(s1.school);

    }
}
