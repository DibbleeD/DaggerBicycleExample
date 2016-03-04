package bicycle;

import javax.inject.Inject;

/**
 * Created by derek on 16-03-03.
 */
public class DecentFrontWheel implements Wheel {

    boolean isBackWheel;
    boolean isAdded;
    private final Frame frame;

    @Inject
    DecentFrontWheel(Frame frame) {
        this.frame = frame;
    }

    @Override public void add(){
        if (frame.isPlaced()){
            isAdded = true;
            System.out.println("Wheel added - but it is not the back wheel");
        }
    }

    @Override public boolean isAdded(){
        return isAdded;
    }

}
