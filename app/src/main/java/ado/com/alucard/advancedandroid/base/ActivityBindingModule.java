package ado.com.alucard.advancedandroid.base;

import android.app.Activity;

import ado.com.alucard.advancedandroid.home.MainActivity;
import ado.com.alucard.advancedandroid.home.MainActivityComponent;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
    MainActivityComponent.class,
})
public abstract class ActivityBindingModule {

  // Provide injector to main activity
  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);

}
