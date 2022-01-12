package com.example.withoutdagger.repositry;

import com.example.withoutdagger.apiService.NewsApiService;
import com.example.withoutdagger.apiService.NetworkModule;
import com.example.withoutdagger.pojo.DetailsModel;
import com.example.withoutdagger.pojo.NewsModel;
import com.example.withoutdagger.viewModel.NewsViewModel;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

public class NewRepository {
    public NewsApiService newsApiService;

    @Inject
    public NewRepository(NewsApiService newsApiService) {
         this.newsApiService =newsApiService ;

     }

    public Observable<List<NewsModel>> getNews() {
        return newsApiService.getNews();
    }

    public Observable<DetailsModel> getDetails(int NewsID, HashMap<String, String> map) {
        return newsApiService.getDetails(NewsID, map);

    }

}
