package bicycle;

import dagger.Module;
import dagger.Provides;

/**
 * Created by derek on 16-03-03.
 */

@Module
public class GearModule {

    @Provides
    Gear provideGear(DecentGear gear){ return gear; }
    }
