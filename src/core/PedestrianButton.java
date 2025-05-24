package src.core;

public class PedestrianButton {
    private boolean isPressed = false;

    public void pressButton() {
        isPressed = true;
        System.out.println("Pedestrian button pressed.");
    }

    public boolean isPressed() {
        boolean pressed = isPressed;
        isPressed = false;
        return pressed;
    }
}
