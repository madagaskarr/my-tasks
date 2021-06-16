package io.tigranes.my_tasks.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import io.tigranes.my_tasks.MyTasksApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ApplicationModule::class,
    ViewModelModule::class,
    ActivityModule::class,
//    FragmentModule::class
])
interface ApplicationComponent: AndroidInjector<MyTasksApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: MyTasksApplication): Builder

        fun build(): ApplicationComponent
    }

    override fun inject(app: MyTasksApplication)
}