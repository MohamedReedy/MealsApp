package com.example.data.repo.mainscreen

import com.example.data.remote.mainscreen.MealsApi
import com.example.domain.entity.mainscreen.MainScreenItems
import com.example.domain.repo.MainScreenRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

 class MainRepoImpl (private val mealsApi: MealsApi) : MainScreenRepo {
     override suspend fun getMeaLsFromRemote(): MainScreenItems = withContext(Dispatchers.IO){
         return@withContext mealsApi.getMeals()
     }
 }

