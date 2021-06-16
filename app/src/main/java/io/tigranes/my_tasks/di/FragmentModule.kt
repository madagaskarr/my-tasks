package io.tigranes.my_tasks.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.tigranes.my_tasks.add_task.AddTaskFragment
import io.tigranes.my_tasks.dashboard.DashboardFragment

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun bindAddTaskFragment(): AddTaskFragment

    @ContributesAndroidInjector
    abstract fun bindDashboardFragment(): DashboardFragment

}