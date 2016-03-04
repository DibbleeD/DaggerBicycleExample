package bicycle;

/**
 * Created by derek on 16-03-03.
 */
public class DecentFrame implements Frame {
    boolean placed;

    @Override public boolean isPlaced() {
        return placed;
    }

    @Override public void add(){
        this.placed = true;
        System.out.println("frame added");
    }
}
