class myt extends Thread {
    myt(String name) {
        super(name); // bcoz it is extending the Thread class so we're using super() here.
    }

    public void run() {
        System.out.println("Starts");
    }
}

public class threadconst {
    public static void main(String[] args) {
        myt t1 = new myt("Dhara");
        myt t2 = new myt("hetvi");
        myt t3 = new myt("abc");
        t2.start();
        t1.start();
        t3.start();

        System.out.println("ID of this thread : " + t1.getId()); // it will give id
        System.out.println("Name of this thread : " + t1.getName()); // will give the name i passed in the parameterized
                                                                     // constructor
        System.out.println("ID of this thread : " + t2.getId());
        System.out.println("Name of this thread : " + t2.getName());

        System.out.println("ID of this thread : " + t3.getId());
        System.out.println("Name of this thread : " + t3.getName());
        System.out.println("class of this thread : " + t3.getClass());
        System.out.println("priority of this thread : " + t3.getPriority());
        System.out.println("stacktrace of this thread : " + t3.getStackTrace());
        System.out.println("state of this thread : " + t3.getState());
        System.out.println("threadgroup of this thread : " + t3.getThreadGroup());
        System.out.println("isAlive status of this thread : " + t3.isAlive());
        System.out.println("isDaemon status of this thread : " + t3.isDaemon());

    }
}