package bicycle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by derek on 16-03-03.
 */
public class BicycleMain {

    @Singleton
    @Component(modules = { BicycleFrameModule.class })
    public interface Bicycle {
        BicycleMaker maker();
    }

    public static void main(String[] args) {
        Bicycle bicycle = DaggerBicycleMain_Bicycle.builder().build();


        bicycle.maker().makeBike();
    }

}
