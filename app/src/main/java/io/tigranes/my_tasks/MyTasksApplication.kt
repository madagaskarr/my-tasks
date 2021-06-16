package io.tigranes.my_tasks

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.tigranes.my_tasks.di.DaggerApplicationComponent

class MyTasksApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().application(this).build()
    }
}