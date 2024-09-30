package com.example.domain.repo;

import com.example.domain.entity.mainscreen.MainScreenItems;

interface MainScreenRepo {
     suspend fun getMeaLsFromRemote(): MainScreenItems
}
