package bicycle;

import javax.inject.Inject;

/**
 * Created by derek on 16-03-03.
 */
public class DecentHandlebar implements Handlebar {
    boolean isPlaced;
    private final Frame frame;

    @Inject
    DecentHandlebar(Frame frame) {
        this.frame = frame;
    }

    @Override
    public void add() {
        if (frame.isPlaced()) {
            isPlaced = true;
            System.out.println("handlebar added");
        }
    }

    @Override
    public boolean isAdded(){
        return isPlaced;
    }
}
