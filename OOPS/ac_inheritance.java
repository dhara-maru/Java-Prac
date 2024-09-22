//AC : Inheritance

class shape {

    String color;

    String color(String colorname) {
        this.color = colorname;
        return colorname;

    }

}

class circle extends shape {

    void getarea(int r) {
        System.out.println("Area is " + (3.14) * r * r);
    }
}

class triangle extends shape {

    void howmanyangles() {
        System.out.println("3 angles");
    }
}

class ac_inheritance {

    public static void main(String[] args) {
        shape s1 = new shape();
        s1.color = "red";
        System.out.println(s1.color("red"));

        triangle t1 = new triangle();
        System.out.println(t1.color("blue"));
        t1.howmanyangles();

        circle c1 = new circle();
        System.out.println(c1.color("yellow"));
        c1.getarea(30);
    }

}
