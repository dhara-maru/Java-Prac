//recursion demo 1

class fivetoone {

    static void mymethod(int par) {
        if (par == 0) {
            return;
        }
        System.out.println(par);
        mymethod(par - 1);

    }

    public static void main(String[] args) {
        mymethod(5);

        // for(int i=5; i>=1; i--){
        //     System.out.println(i+"\t");
        // }
    }
}
