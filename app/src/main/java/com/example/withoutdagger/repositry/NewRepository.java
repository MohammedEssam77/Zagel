package com.example.withoutdagger.repositry;

import androidx.lifecycle.LiveData;

import com.example.withoutdagger.apiService.NewsApiService;
import com.example.withoutdagger.apiService.NetworkModule;
//import com.example.withoutdagger.dp.FavoriteDao;
//import com.example.withoutdagger.dp.FavoriteNews;
//import com.example.withoutdagger.dp.NewsDatabase;
import com.example.withoutdagger.pojo.DetailsModel;
import com.example.withoutdagger.pojo.NewsModel;
import com.example.withoutdagger.viewModel.NewsViewModel;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

public class NewRepository {
    public NewsApiService newsApiService;
  //  public FavoriteDao favoriteDao;

    @Inject
    public NewRepository(NewsApiService newsApiService){ //FavoriteDao favoriteDao) {
        this.newsApiService = newsApiService;
    //    this.favoriteDao = favoriteDao;
    }

    public Observable<List<NewsModel>> getNews() {
        return newsApiService.getNews();
    }

    public Observable<DetailsModel> getDetails(int NewsID, HashMap<String, String> map) {
        return newsApiService.getDetails(NewsID, map);

    }

//    public void insertNews(FavoriteNews favoriteNews) {
//        favoriteDao.insert(favoriteNews);
//
//    }

//    public void deleteNews(int NewsID) {
//        favoriteDao.delete(NewsID);
//    }
//
//    public void clearFavList() {
//        favoriteDao.clearFavoriteList();
//    }
//
//    public LiveData<List<FavoriteNews>> getFav() {
//        return favoriteDao.getFavoriteList();
//
//    }
//
//    public FavoriteNews getFavNews(int NewsID) {
//        return favoriteDao.getFavoriteListNews(NewsID);
//    }
}
