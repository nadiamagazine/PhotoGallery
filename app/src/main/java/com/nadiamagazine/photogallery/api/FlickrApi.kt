package com.nadiamagazine.photogallery.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "73884025c7954ba9b7461d415734d600"

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}
