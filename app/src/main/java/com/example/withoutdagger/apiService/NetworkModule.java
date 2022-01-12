package com.example.withoutdagger.apiService;

import com.example.withoutdagger.pojo.NewsModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import dagger.hilt.android.components.ApplicationComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
@Module
@InstallIn(ApplicationComponent.class)
public  class NetworkModule {

    @Provides
    @Singleton
    public static NewsApiService newsApiService(){
        return new Retrofit.Builder()
                .baseUrl("http://apiversion10.thezagelapp.com//")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build()
                .create(NewsApiService.class);

    }
}



