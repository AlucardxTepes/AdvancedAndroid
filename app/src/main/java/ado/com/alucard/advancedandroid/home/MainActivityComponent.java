package ado.com.alucard.advancedandroid.home;

import ado.com.alucard.advancedandroid.di.ActivityScope;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Subcomponent built on top of the Application Component
 */
@ActivityScope
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity>{

  @Subcomponent.Builder
  abstract class Builder extends AndroidInjector.Builder<MainActivity> {

  }
}
