package bicycle;

import javax.inject.Inject;

/**
 * Created by derek on 16-03-04.
 */
public class DecentBackWheel implements BackWheel {

    boolean isAdded;
    private final Frame frame;

    @Inject
    DecentBackWheel(Frame frame) {
        this.frame = frame;
    }

    @Override public void add(){
        if (frame.isPlaced()){
            isAdded = true;
            System.out.println("Back wheel added");
        }
    }

    @Override public boolean isAdded(){
        return isAdded;
    }

}
