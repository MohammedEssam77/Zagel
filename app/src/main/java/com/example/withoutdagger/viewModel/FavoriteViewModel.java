package com.example.withoutdagger.viewModel;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

//import com.example.withoutdagger.dp.FavoriteNews;
import com.example.withoutdagger.repositry.NewRepository;

import java.util.List;

//public class FavoriteViewModel extends ViewModel {
//    private NewRepository repository ;
//    private LiveData <List<FavoriteNews>>getFavNews;
//    @ViewModelInject
//    private FavoriteViewModel (NewRepository newRepository)
//    {
//        this.repository = newRepository ;
//        getFavNews =  newRepository.getFav();
//
//
//    }
//    public LiveData<List<FavoriteNews>>getGetFavNews (){
//        return getFavNews;
//    }
//    public void clearList(){
//        repository.clearFavList();
//    }
//
//}
