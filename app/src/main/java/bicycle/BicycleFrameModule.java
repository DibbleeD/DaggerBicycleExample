package bicycle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by derek on 16-03-03.
 */

@Module(includes = {WheelModule.class, BackWheelModule.class, HandlebarModule.class, GearModule.class})
public class BicycleFrameModule {
    @Provides
    @Singleton Frame provideFrame(){
        return new DecentFrame();
    }
}
