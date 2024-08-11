package com.ync.connect.di

import com.ync.connect.viewmodel.MainActivityViewModel
import com.ync.connect.viewmodel.impl.MainActivityViewModelImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface ViewModelModule {

    @Binds
    @Singleton
    fun bindMainActivityViewModel(mainActivityViewModelImpl: MainActivityViewModelImpl): MainActivityViewModel

}