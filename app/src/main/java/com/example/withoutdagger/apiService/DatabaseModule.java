package com.example.withoutdagger.apiService;

import android.app.Application;

import androidx.room.Room;

//import com.example.withoutdagger.dp.FavoriteDao;
//import com.example.withoutdagger.dp.NewsDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

//@Module
//@InstallIn(ApplicationComponent.class)
//public class DatabaseModule {
//    @Provides
//    @Singleton
//    NewsDatabase provideNewsDataBase (Application application) {
//        return Room.databaseBuilder(application,NewsDatabase.class,"fav_DB")
//                .fallbackToDestructiveMigration()
//                .allowMainThreadQueries()
//                .build();
//
//
//    }
//    @Provides
//    @Singleton
//    FavoriteDao provideFavoriteDao (NewsDatabase newsDatabase){
//        return newsDatabase.favoriteDao();
//    }

//}
