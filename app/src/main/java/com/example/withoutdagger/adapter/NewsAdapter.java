package com.example.withoutdagger.adapter;


import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;


import com.example.withoutdagger.R;
import com.example.withoutdagger.databinding.FragmentNewsBinding;
import com.example.withoutdagger.databinding.NewsItemBinding;
import com.example.withoutdagger.fragments.NewsFragmentDirections;
import com.example.withoutdagger.pojo.NewsModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private List<NewsModel> mList;
    private Context mContext;
    private NewsItemBinding binding ;

    public NewsAdapter(Context mContext   ) {
        this.mContext = mContext;
         mList = new ArrayList<>();

    }
    public void setList(List<NewsModel> mList) {
        this.mList = mList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        binding = NewsItemBinding.inflate(inflater,parent,false);
        return new NewsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.NewsViewHolder holder, int position) {
        holder.binding.textTitle.setText(mList.get(position).getTitle());
        holder.binding.sourceTxt.setText(mList.get(position).getSectionTitle());
        holder.binding.btnTitle.setText(mList.get(position).getSectionTitle());

        setImageHolder(holder.binding.coverImage,mList.get(position));
        Picasso.with(mContext)
                .load(Uri.parse(Constants.loadSourceImg(mList.get(position).getSourceID())))
                .into(holder.binding.sourceImg);
        holder.binding.newsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewsFragmentDirections.ActionNewsFragmentToDetailFragment fragment =
                        NewsFragmentDirections.actionNewsFragmentToDetailFragment(mList.get(position).getID());
                Navigation.findNavController(v).navigate(fragment);
            }
        });

    }
    private void setImageHolder(ImageView image, NewsModel postModel) {
        if (postModel.getRatio() == null || postModel.getRatio().equals("") ||
                postModel.getRatio().equals("1.55") || postModel.getRatio().equals("0")) {
            image.setVisibility(View.GONE);
        } else {
            WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
            Display display = wm.getDefaultDisplay();
            DisplayMetrics outMetrics = new DisplayMetrics();
            display.getMetrics(outMetrics);
            int width = outMetrics.widthPixels;
            int height = (int) (width / Double.parseDouble(postModel.getRatio()));
            image.setVisibility(View.VISIBLE);
            image.getLayoutParams().width = width;
            image.getLayoutParams().height = height;
            Picasso.with(mContext)
                    .load(Uri.parse(Constants.mediaURL + postModel.getImg()))
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(image);
        }
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class NewsViewHolder extends RecyclerView.ViewHolder {
        private NewsItemBinding binding ;

        public NewsViewHolder(@NonNull NewsItemBinding binding) {

            super(binding.getRoot());
            this.binding = binding;


        }
    }
}