package com.example.githubdemo.net

import com.example.githubdemo.moudels.User
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * @author 14512 on 2019/4/16
 */
interface ApiService {

    @GET("users/{user_name}/repos")
    fun getUser(@Path("user_name") userName: String, @Query("page") page: Int): Observable<List<User>>
}
