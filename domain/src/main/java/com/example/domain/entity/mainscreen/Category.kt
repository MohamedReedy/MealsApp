package com.example.domain.entity.mainscreen

import java.io.Serializable

data class Category(
    val idCategory: String ?= "",
    val strCategory: String ?= "",
    val strCategoryDescription: String ?= "",
    val strCategoryThumb: String ?= ""
) : Serializable