//package com.example.withoutdagger.dp;
//
//import androidx.lifecycle.LiveData;
//import androidx.room.Dao;
//import androidx.room.Insert;
//import androidx.room.Query;
//
//import java.util.List;
//
//@Dao
//public interface FavoriteDao {
//    @Insert
//    Void insert(FavoriteNews favoriteNews);
//
//    @Query("DELETE FROM favorite_table WHERE id = :NewsID")
//    void delete(int NewsID);
//
//    @Query("DELETE FROM favorite_table")
//    void clearFavoriteList();
//
//    @Query("SELECT * FROM favorite_table")
//    LiveData<List<FavoriteNews>> getFavoriteList();
//
//    @Query("SELECT * FROM favorite_table WHERE id = :NewsID ")
//    FavoriteNews getFavoriteListNews(int NewsID);
//
//
//}
