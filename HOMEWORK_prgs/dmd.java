class phone {
    void showtime() {
        System.out.println("time is 3 pm");
    }

    void on() {
        System.out.println("phone is on");
    }
}

class smartphone extends phone {
    void playmusic() {
        System.out.println("Nee irukurriye ola kottayyaa...Suma nadakurriye thaval kottayya 🎧🎶");
    }

    @Override
    void on() {
        System.out.println("Smartphone is on");
    }
}

public class dmd {
    public static void main(String[] args) {
        phone myphone = new smartphone(); // allowed bcoz smartphone(subclass) is a phone(superclass) too!
        myphone.showtime(); // allowed bcoz smartphone(sub) can showtime too
        // myphone.playmusic(); //not allowed bcoz the superclass is phone and not all
        // phones are smartphones
        myphone.on(); // will call smartphone(subclass's)'s on() method bcoz the object assigned is of
                      // smartphone's
    }
}