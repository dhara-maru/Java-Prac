//Nested / inner class

class parent {

    public void displayp() {
        System.out.println("Hey, i'm Parent class.");
    }

    class child {

        public void displayc() {
            System.out.println("Hey, i'm Child class.");
        }
    }
}

class nestedclassdemo {

    public static void main(String[] args) {
        parent p1 = new parent();
        p1.displayp();

        parent.child c1 = p1.new child(); //we have to put the object of super class before 'new' keyword. that means we're allocating memory for this entity's child.
        c1.displayc();

    }
}
