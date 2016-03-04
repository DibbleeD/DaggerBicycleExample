package bicycle;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Created by derek on 16-03-03.
 */
public class BicycleMaker {

    public final Wheel frontWheel;
    public final Lazy<BackWheel> backWheel;
    public final Lazy<Handlebar> handlebar;
    public final Lazy<Frame> frame;
    public final Gear gear;

    @Inject
    BicycleMaker (Wheel frontWheel, Lazy<BackWheel> backWheel, Lazy<Handlebar> handlebar, Lazy<Frame> frame, Gear gear){
        this.frontWheel = frontWheel;
        this.backWheel = backWheel;
        this.handlebar = handlebar;
        this.frame = frame;
        this.gear = gear;
    }

    public void makeBike(){

        frame.get().add();

        frontWheel.add();

        backWheel.get().add();

        handlebar.get().add();

        gear.add();

        if (frame.get().isPlaced() && frontWheel.isAdded() && backWheel.get().isAdded() && handlebar.get().isAdded() && gear.isAdded()){
            System.out.println("Bicycle complete. You're weak if you need brakes!");
        }
        else {
            System.out.println("Bicycle not complete - something is missing");
        }
    }
}
