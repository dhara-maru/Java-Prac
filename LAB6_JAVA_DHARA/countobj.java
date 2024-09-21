// L6 B6 : WAP that counts the number of objects created using static.

class countobjcls {

    static int objcount;

    countobjcls() {
        objcount++;
    }

    static int getcount() {
        return objcount;
    }

}

class countobj {

    public static void main(String[] args) {
        countobjcls o1 = new countobjcls();
        countobjcls o2 = new countobjcls();
        countobjcls o3 = new countobjcls();
        countobjcls o4 = new countobjcls();
        countobjcls o5 = new countobjcls();
        countobjcls o6 = new countobjcls();
        countobjcls o7 = new countobjcls();

        int result = countobjcls.getcount();
        System.out.println("Total objects are : " + result);

    }
}
