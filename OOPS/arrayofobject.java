//array of objects

class student {

    int rno;
    String name;
    int marks;
}

class arrayofobject {

    public static void main(String[] args) {
        student s1 = new student();
        s1.rno = 1;
        s1.name = "dhara";
        s1.marks = 90;

        student s2 = new student();
        s2.rno = 2;
        s2.name = "hetvi";
        s2.marks = 90;

        student s3 = new student();
        s3.rno = 3;
        s3.name = "minaxi";
        s3.marks = 90;

        student s4 = new student();
        s4.rno = 4;
        s4.name = "pravin";
        s4.marks = 90;

        student students[] = new student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rno + " : " + students[i].name + " : " + students[i].marks);
        }

    }
}
