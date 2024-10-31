// abstract class pen {
//     void write() {
//         System.out.println("Writing with abstract pen");
//     }

//     void refill() {
//         System.out.println("Refilling my abstract pen");
//     }
// }

// class doms extends pen {
//     void write() {
//         System.out.println("Writing with Doms pen");
//     }

//     void refill() {
//         System.out.println("Refilling my Doms pen");
//     }
// }

// class fountainpen extends pen {
//     void changeNib() {
//         System.out.println("Changing the nib of fountain pen");
//     }
// }

// interface basicanimal {
//     void sleep();

//     void eat();
// }

// class human extends monkey implements basicanimal {
//     public void sleep() {
//         System.out.println("human is sleeping");
//     }

//     public void eat() {
//         System.out.println("human eats rice");
//     }

//     void jump() {
//         System.out.println("Human is jumping..");
//     }

//     void bites() {
//         System.out.println("Human is biting");
//     }
// }

// class monkey {
//     void jump() {
//         System.out.println("Jumping ....");
//     }

//     void bites() {
//         System.out.println("Biting on food");
//     }
// }
// abstract class telephone {
// telephone() {
// System.out.println("Inside smartphone constructor");
// }

// abstract void lift();

// abstract void disconnected();
// }

// class smartphone extends telephone {
// void lift() {
// System.out.println("Smartphone lift");
// }

// void disconnected() {
// System.out.println("Smartphone disconnected");
// }
// }
interface tvremote {
    public void startbtn();

    void stopbtn();
}

interface smartvremote extends tvremote {
    void pause();

    public void replay();
}

class tv implements tvremote, smartvremote {
    public void startbtn() {
        System.out.println("Tv starts");
    }

    public void stopbtn() {
        System.out.println("tv stops");
    }

    public void pause() {
        System.out.println("tv pauses");
    }

    public void replay() {
        System.out.println("Tv replays");
    }
}

public class abspendemo {
    public static void main(String[] args) {

        tv mytv = new tv();
        mytv.startbtn();
        mytv.stopbtn();
        mytv.pause();
        mytv.replay();
        // smartphone realme = new smartphone();
        // realme.disconnected();
        // realme.lift();

        // doms mypen = new doms();
        // mypen.write();
        // mypen.refill();

        // fountainpen fp1 = new fountainpen();
        // fp1.write();
        // fp1.refill();
        // fp1.changeNib();

        // human d = new human();
        // d.jump();
        // d.bites();
        // d.eat();
        // d.sleep();

    }
}