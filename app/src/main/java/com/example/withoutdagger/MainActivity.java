package com.example.withoutdagger;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.withoutdagger.databinding.ActivityMainBinding;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    NavController navController;
    ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        navController = Navigation.findNavController(this, R.id.fragment);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.bottom_nav_menu,menu);
        NavController navController = Navigation.findNavController(this,R.id.fragment);
        binding.smoothBar.setupWithNavController(menu,navController);
        return true;
    }

}

//        binding.smoothBar.setOnItemSelectedListener(new OnItemSelectedListener() {
//            @Override
//            public boolean onItemSelect(int i) {
//
//                switch (i){
//                    case 0:
//                        navController.navigate(R.id.home);
//                        return true;
//                    case 1:
//                        navController.navigate(R.id.favorite);
//                        return true;
//                    case 2:
//                        navController.navigate(R.id.searchMovies);
//                        return true;
//                }
//                return  false;
//            }
//        });
//
//    }


//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        navController = Navigation.findNavController(MainActivity.this,R.id.news_nav);

//        binding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_main, null, false);
//        setContentView(binding.getRoot());
//        recyclerView = findViewById(R.id.news_recyclerView);
//        adapter = new NewsAdapter(this );
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(adapter);
//
//        viewModel = new ViewModelProvider(this).get(NewsViewModel.class);
//        viewModel.getNews().observe(this, new Observer<List<NewsModel>>() {
//            @Override
//            public void onChanged(List<NewsModel> newsModels) {
//                adapter.setList(newsModels);
//
//            }
//        });
//
//    }
//
//    @Override
//    public void recyclerViewListClicked(int position) {
//        Intent intent = new Intent(this, DetailsActivity.class);
//        Bundle bundle = new Bundle();
//        bundle.putParcelable("myNewsObj",getNews.get(position));
//        intent.putExtras(bundle);
//        startActivity(intent);
//
//    }
//
//    @Override
//    public void setFav(int pos, int newsID, boolean isSelect) {
//
//    }
//
//    @Override
//    public void setReadLater(int pos, int newsID, boolean isSelect) {
//

