package com.example.withoutdagger.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.withoutdagger.adapter.NewsAdapter;
import com.example.withoutdagger.databinding.FragmentNewsBinding;
import com.example.withoutdagger.pojo.NewsModel;
import com.example.withoutdagger.viewModel.NewsViewModel;

import java.util.HashMap;
import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class NewsFragment extends Fragment {
    private NewsAdapter adapter;
    NewsViewModel viewModel;
    private FragmentNewsBinding binding;
    private HashMap<String, String> map;

    public NewsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentNewsBinding.inflate(inflater, container, false);
        viewModel = new ViewModelProvider(this).get(NewsViewModel.class);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        map = new HashMap<>();
        map.put("page", "1");
        initRecyclerView();
        viewModel.getNew();
        observeData();
    }

    private void initRecyclerView() {
        binding.newsRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL));
        adapter = new NewsAdapter(getContext());
        binding.newsRecyclerView.setAdapter(adapter);
    }

    private void observeData() {

        viewModel.getn().observe(getViewLifecycleOwner(), new Observer<List<NewsModel>>() {
            @Override
            public void onChanged(List<NewsModel> newsModels) {
                adapter.setList(newsModels);
            }
        });

    }
}

