package ru.yandexpraktikum.notekeeper

import android.app.Application
import ru.yandexpraktikum.notekeeper.di.ApplicationComponent
import ru.yandexpraktikum.notekeeper.di.DaggerApplicationComponent

class NoteKeeperApp: Application() {
    lateinit var daggerAppComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        daggerAppComponent = DaggerApplicationComponent.factory().create(this)
    }
}