//package com.example.withoutdagger.adapter;
//
//import android.content.Context;
//import android.net.Uri;
//import android.util.DisplayMetrics;
//import android.view.Display;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.WindowManager;
//import android.widget.ImageView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.withoutdagger.R;
//import com.example.withoutdagger.databinding.NewsItemBinding;
//import com.example.withoutdagger.dp.FavoriteNews;
//import com.example.withoutdagger.pojo.NewsModel;
//import com.squareup.picasso.Picasso;
//
//import java.util.List;
//
//public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.FavoriteViewHolder> {
//    private List<FavoriteNews> mList;
//    private Context context;
//    private NewsItemBinding binding ;
//
//    public FavoriteAdapter(Context context, List<FavoriteNews> newsList) {
//        this.context = context;
//        this.mList = newsList;
//    }
//
//    public void setNewsList(List<FavoriteNews> newsList) {
//        this.mList = newsList;
//        notifyDataSetChanged();
//    }
//
//    @NonNull
//    @Override
//    public FavoriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(context);
//        binding = NewsItemBinding.inflate(inflater, parent, false);
//        return new FavoriteViewHolder(binding);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull FavoriteViewHolder holder, int position) {
//
//        holder.binding.textTitle.setText(mList.get(position).getTitle());
//        holder.binding.sourceTxt.setText(mList.get(position).getSectionTitle());
//        holder.binding.btnTitle.setText(mList.get(position).getSectionTitle());
//
//        Picasso.with(context)
//                .load(Uri.parse(Constants.loadSourceImg(mList.get(position).getSourceID())))
//                .into(holder.binding.sourceImg);
//        holder.binding.newsLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//    }
//    private void setImageHolder(ImageView image, NewsModel postModel) {
//        if (postModel.getRatio() == null || postModel.getRatio().equals("") ||
//                postModel.getRatio().equals("1.55") || postModel.getRatio().equals("0")) {
//            image.setVisibility(View.GONE);
//        } else {
//            WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
//            Display display = wm.getDefaultDisplay();
//            DisplayMetrics outMetrics = new DisplayMetrics();
//            display.getMetrics(outMetrics);
//            int width = outMetrics.widthPixels;
//            int height = (int) (width / Double.parseDouble(postModel.getRatio()));
//            image.setVisibility(View.VISIBLE);
//            image.getLayoutParams().width = width;
//            image.getLayoutParams().height = height;
//            Picasso.with(context)
//                    .load(Uri.parse(Constants.mediaURL + postModel.getImg()))
//                    .placeholder(R.drawable.ic_launcher_background)
//                    .into(image);
//        }
//    }
//
//
//    @Override
//    public int getItemCount() {
//        return mList.size();
//    }
//    class FavoriteViewHolder extends RecyclerView.ViewHolder {
//
//        private NewsItemBinding binding;
//
//        public FavoriteViewHolder(NewsItemBinding binding) {
//            super(binding.getRoot());
//            this.binding = binding;
//        }
//    }
//}
