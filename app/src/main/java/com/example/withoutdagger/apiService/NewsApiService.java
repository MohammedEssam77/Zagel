package com.example.withoutdagger.apiService;

import com.example.withoutdagger.pojo.DetailsModel;
import com.example.withoutdagger.pojo.NewsModel;

import java.util.HashMap;
import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface NewsApiService {
    @Headers({
            "Content-type: application/json",
            "DeviceToken: 29A2506C-7C1C-40B9-8640-9ECA36659401",
            "AuthToken: dVMFDDAcZ1"
    })
    @GET("Api/News/GetNewsHome/209361/0/0/20/0")
    Observable<List<NewsModel>> getNews();

    @Headers({
            "Content-type: application/json",
            "DeviceToken: 29A2506C-7C1C-40B9-8640-9ECA36659401",
            "AuthToken: dVMFDDAcZ1"
    })
    @GET("Api/News/Details/209361/{NewsID}")
    Observable<DetailsModel> getDetails(@Path("NewsID") int id, @QueryMap HashMap<String, String> queries);

}