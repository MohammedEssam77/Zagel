package com.example.withoutdagger.repositry;

//public class Repository {
//    private PostsClient postsClient;
//    public NewsApiService newsApiService;
//    public MutableLiveData<List<NewsModel>> postsMutableLiveData = new MutableLiveData<>();
//    public MutableLiveData<DetailsModel> postDetails = new MutableLiveData<>();
//    private static final String TAG = "postViewModel";
//    private final CompositeDisposable disposable = new CompositeDisposable();
//    NewsViewModel newsViewModel ;
//    public Repository() {
//
//        newsApiService = postsClient.getRetrofit().create(NewsApiService.class);
//    }
//
//    public MutableLiveData<List<NewsModel>> getNews() {
//        Single<List<NewsModel>> observable = newsApiService.getNews()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//        observable.subscribe(o -> postsMutableLiveData.setValue(o), e -> Log.d(TAG, "getPosts:" + e));
//        return postsMutableLiveData;
//    }
//
//    public void getDetails(int NewsID, HashMap<String,String> map) {
//       disposable.add(newsViewModel.getDetails(NewsID, map)
//               .subscribeOn(Schedulers.io())
//               .observeOn(AndroidSchedulers.mainThread())
//               .subscribe(result->postDetails.setValue(result),
//                       error -> Log.e(TAG, "getDetails: " + error.getMessage()))
//       );
//    }
//
//}

//    private MutableLiveData<DetailsModel> newsDetails = new MutableLiveData<>();
//    private MutableLiveData<NewsModel> news = new MutableLiveData<>();
//    NewsApiService newsApiService ;
//    public Repository repository;
//
//    public NewsViewModel() {
//        repository = new Repository();
//    }
//
//    public MutableLiveData<DetailsModel> getSelected() {
//        return newsDetails;
//    }
//
//    public Observable <DetailsModel>getDetails(int NewsID, HashMap<String,String> map){
//        return newsApiService.getDetails(NewsID,map);
//
//    }
//    public MutableLiveData<List<NewsModel>> getNews() {
//        return repository.getNews();
//    }
//
//}