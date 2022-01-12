package com.example.withoutdagger.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.withoutdagger.R;
import com.example.withoutdagger.databinding.FragmentDetailBinding;
import com.example.withoutdagger.databinding.FragmentNewsBinding;
import com.example.withoutdagger.pojo.DetailsModel;
import com.example.withoutdagger.pojo.NewsModel;
import com.example.withoutdagger.repositry.NewRepository;
 import com.example.withoutdagger.viewModel.NewsViewModel;

import java.util.HashMap;

import dagger.hilt.android.AndroidEntryPoint;


@AndroidEntryPoint
public class DetailFragment extends Fragment {
    private FragmentDetailBinding binding;
    NewsViewModel viewModel;
    private HashMap<String,String> map;
    private Integer NewsID;

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        map = new HashMap<>();
        DetailFragmentArgs args = DetailFragmentArgs.fromBundle(getArguments());
        NewsID= args.getNewsID();
        viewModel.getDetails(NewsID, map);

        viewModel.getDetail().observe(getViewLifecycleOwner(), new Observer<DetailsModel>() {
            @Override
            public void onChanged(DetailsModel detailsModel) {
                binding.sourceTx.setText(detailsModel.getSectionTitle());
                binding.textTitle.setText(detailsModel.getBreif());
                binding.btnSectionTitl.setText(detailsModel.getSectionTitle());
                binding.dateTxt.setText(detailsModel.getFormatedDate());
            }
        });
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        viewModel = new ViewModelProvider(this).get(NewsViewModel.class);
        return view;
    }
}