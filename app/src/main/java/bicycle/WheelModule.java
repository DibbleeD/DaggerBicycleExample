package bicycle;

import dagger.Module;
import dagger.Provides;

/**
 * Created by derek on 16-03-03.
 */

@Module
public class WheelModule {

    @Provides Wheel provideWheel(DecentFrontWheel wheel){ return wheel; }
}
