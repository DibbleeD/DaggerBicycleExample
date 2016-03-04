package bicycle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by derek on 16-03-04.
 */

@Module(includes = GearModule.class)
public class BackWheelModule {

    @Provides @Singleton
    BackWheel provideBackWheel(DecentBackWheel wheel){
        return wheel;
    }
}
