package io.tigranes.my_tasks.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.tigranes.my_tasks.BottomNavigationHostingActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun bindBottomNavigationHostingActivity(): BottomNavigationHostingActivity
}
