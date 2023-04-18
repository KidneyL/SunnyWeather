package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)
data class Place(val name: String, val location: Location,
                 @SerializedName("formatted_address") val address: String)
//@SerializedName注解的方式，来让JSON字段和Kotlin字段之间建立
//映射关系
data class Location(val lng: String, val lat: String)
