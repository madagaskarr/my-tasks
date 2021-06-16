package io.tigranes.my_tasks.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class ViewModelModule {
//    @Binds
//    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
//
//    @Singleton
//    @Binds
//    @IntoMap
//    @ViewModelKey(CreateCustomHabitViewModel::class)
//    abstract fun bindCreateCustomHabitViewModel(createCustomHabitViewModel: CreateCustomHabitViewModel): ViewModel
}