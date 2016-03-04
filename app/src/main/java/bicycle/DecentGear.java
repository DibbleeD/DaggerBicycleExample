package bicycle;

import javax.inject.Inject;

/**
 * Created by derek on 16-03-03.
 */
public class DecentGear implements Gear {
    boolean isAdded;
    private final Frame frame;
    private final BackWheel wheel;

    @Inject
    DecentGear(Frame frame, BackWheel wheel) {
        this.frame = frame;
        this.wheel = wheel;
    }

    @Override public void add() {
        if (frame.isPlaced()) {
            System.out.println("frame placed");
            if (wheel.isAdded()){
                System.out.println("wheel placed");
            }
        }
        if (frame.isPlaced() && wheel.isAdded()) {
            isAdded = true;
            System.out.println("gear added");
        }
    }

    @Override public boolean isAdded(){
        return isAdded;
    }
}
