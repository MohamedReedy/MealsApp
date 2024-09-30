package com.example.mealsapp.di

import com.example.data.remote.mainscreen.MealsApi
import com.example.data.repo.mainscreen.MainRepoImpl
import com.example.domain.repo.MainScreenRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent:: class)
object RepoModule {
    @Provides
    fun provideMainScreenRepo (
        api: MealsApi
    ): MainScreenRepo {
        return MainRepoImpl (api)
    }

}
