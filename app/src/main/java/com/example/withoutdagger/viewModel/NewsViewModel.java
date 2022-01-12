package com.example.withoutdagger.viewModel;

import android.util.Log;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.withoutdagger.apiService.NewsApiService;
import com.example.withoutdagger.apiService.NetworkModule;
import com.example.withoutdagger.pojo.DetailsModel;
import com.example.withoutdagger.pojo.NewsModel;
import com.example.withoutdagger.repositry.NewRepository;

import java.util.HashMap;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class NewsViewModel extends ViewModel {
    public MutableLiveData<List<NewsModel>> postsMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<DetailsModel> postDetails = new MutableLiveData<>();
    private final CompositeDisposable disposable = new CompositeDisposable();
    NewRepository newRepository;
    private static final String TAG = "postViewModel";

    @ViewModelInject
    public NewsViewModel(NewRepository newRepository) {
        this.newRepository = newRepository;
    }

    public MutableLiveData<List<NewsModel>> getn() {
        return postsMutableLiveData;
    }

    public MutableLiveData<DetailsModel> getDetail() {
        return postDetails;
    }


    public void getDetails(int NewsID, HashMap<String, String> map) {
        disposable.add(newRepository.getDetails(NewsID, map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(result -> postDetails.setValue(result),
                        error -> Log.e(TAG, "getDetails: " + error.getMessage()))
        );
    }

    public MutableLiveData<List<NewsModel>> getNew() {
        Observable<List<NewsModel>> observable = newRepository.getNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        observable.subscribe(o -> postsMutableLiveData.setValue(o), e -> Log.d(TAG, "getPosts:" + e));
        return postsMutableLiveData;
    }

}
