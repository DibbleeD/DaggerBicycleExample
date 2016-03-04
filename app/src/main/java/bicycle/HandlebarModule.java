package bicycle;

import dagger.Module;
import dagger.Provides;

/**
 * Created by derek on 16-03-04.
 */
@Module
public class HandlebarModule {
    @Provides
    Handlebar provideHandlebar(DecentHandlebar handlebar){ return handlebar; }

}
