package mypackage;

public class main {
    public static void main(String[] args) {
        packagecreatedemo sumobj = new packagecreatedemo();
        packagedisplaydemo dispobj = new packagedisplaydemo();

        int resultHere = sumobj.sum(4, 10);

        dispobj.setResult(resultHere);
        dispobj.display();

    }

}
