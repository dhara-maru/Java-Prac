interface EventListener {
    public void performEvent();
}

interface MouseListener extends EventListener {
    public void mouseClicked();

    public void mousePressed();

    public void mouseReleased();

    public void mouseMoved();

    public void mouseDragged();

}

interface KeyListener extends EventListener {
    public void keyPressd();

    public void keyReleased();

}

class EventDemo implements MouseListener, KeyListener {

    public void mouseClicked() {
        System.out.println("Mouse clicked!");
    }

    public void mousePressed() {
        System.out.println("Mouse Pressed!");
    }

    public void mouseReleased() {
        System.out.println("Mouse released!");
    }

    public void mouseMoved() {
        System.out.println("Mouse moved");
    }

    public void mouseDragged() {
        System.out.println("Mouse dragged!");
    }

    public void performEvent() {
        System.out.println("Event Performed!");
    }

    public void keyPressd() {
        System.out.println("key pressed!");
    }

    public void keyReleased() {
        System.out.println("key released!");
    }

}

public class eventprg {
    public static void main(String[] args) {
        EventDemo e = new EventDemo();
        e.performEvent();
        e.mouseClicked();
        e.mouseDragged();
        e.mouseMoved();
        e.mousePressed();
        e.mouseReleased();
        e.keyPressd();
        e.keyReleased();
    }
}
