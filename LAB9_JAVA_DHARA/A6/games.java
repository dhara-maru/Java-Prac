interface playable {
    public void play();
}

class football implements playable {
    public void play() {
        System.out.println("Game Football starts!");
    }
}

class volleyball implements playable {
    public void play() {
        System.out.println("Game Volleyball starts!");
    }
}

class basketball implements playable {
    public void play() {
        System.out.println("Game Basketball starts!");
    }
}

public class games {
    public static void main(String[] args) {
        football f = new football();
        f.play();

        volleyball v = new volleyball();
        v.play();

        basketball b = new basketball();
        b.play();
    }
}