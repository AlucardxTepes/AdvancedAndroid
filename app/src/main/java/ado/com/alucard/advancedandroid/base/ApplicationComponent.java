package ado.com.alucard.advancedandroid.base;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Responsible for injecting classes
 */
@Singleton
@Component(modules = {
    ApplicationModule.class,
    ActivityBindingModule.class,
})
public interface ApplicationComponent {
  void inject(MyApplication myApplication);
}
