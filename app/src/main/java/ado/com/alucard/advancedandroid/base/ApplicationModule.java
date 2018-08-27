package ado.com.alucard.advancedandroid.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Provider of Dependencies
 */
@Module
public class ApplicationModule {

  private Application application;

  ApplicationModule(Application application) {
    this.application = application;
  }

  @Provides
  Context provideApplicationContext() {
    return application;
  }
}
