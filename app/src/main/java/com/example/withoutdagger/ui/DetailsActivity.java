package com.example.withoutdagger.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.withoutdagger.R;
import com.example.withoutdagger.adapter.Constants;
import com.example.withoutdagger.adapter.RequestData;
import com.example.withoutdagger.pojo.DetailsModel;
import com.example.withoutdagger.pojo.NewsModel;
 import com.example.withoutdagger.viewModel.NewsViewModel;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    NewsModel newsModel;
    Context context;
    NewsViewModel viewModel;
    TextView sourceTxt, textTitle, dateTxt;
    Button btnSectionTitle;
    ImageView coverImage, sourceImg;
     DetailsModel detailsModel;
    private static final String TAG = "Error d";
    private Integer NewsID;
    private HashMap<String, String> queries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
//        sourceTxt = findViewById(R.id.sourceTx);
//        textTitle = findViewById(R.id.textTitle);
//        dateTxt = findViewById(R.id.dateTxt);
//        btnSectionTitle = findViewById(R.id.btnSectionTitl);
//        coverImage = findViewById(R.id.coverImage);
//        sourceImg = findViewById(R.id.sourceImg);
//
//        Bundle bundle = getIntent().getExtras();
//        if (bundle != null) {
//            newsModel = bundle.getParcelable("myNewsObj");
//            viewModel.select(newsModel);
//        }
//        repository.getDetails(NewsID,queries);
//        viewModel = new ViewModelProvider(this).get(NewsViewModel.class);
//
//        viewModel.getSelected().observe(this, new Observer<DetailsModel>() {
//            @Override
//            public void onChanged(DetailsModel detailsModel) {
//                sourceTxt.setText(detailsModel.getSectionTitle());
//                textTitle.setText(detailsModel.getBreif());
//                btnSectionTitle.setText(detailsModel.getSectionTitle());
//                dateTxt.setText(detailsModel.getFormatedDate());
//                setImage(coverImage, newsModel);
//                Picasso.with(context)
//                        .load(Uri.parse(Constants.loadSourceImg(newsModel.getSourceID())))
//                        .into(sourceImg);
//                Log.d(TAG, "onerrod: ");
//            }
//        });
//    }
//
//    private void setImage(ImageView image, NewsModel newsModel) {
//        if (newsModel.getRatio() == null || newsModel.getRatio().equals("") ||
//                newsModel.getRatio().equals("1.55") || newsModel.getRatio().equals("0")) {
//            image.setVisibility(View.GONE);
//        } else {
//            WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
//            Display display = wm.getDefaultDisplay();
//            DisplayMetrics outMetrics = new DisplayMetrics();
//            display.getMetrics(outMetrics);
//            int width = outMetrics.widthPixels;
//            int height = (int) (width / Double.parseDouble(newsModel.getRatio()));
//
//            image.setVisibility(View.VISIBLE);
//            image.getLayoutParams().width = width;
//            image.getLayoutParams().height = height;
//
//            Picasso.with(context)
//                    .load(Uri.parse(Constants.mediaURL + newsModel.getImg()))
//                    .placeholder(R.drawable.placeholder_img)
//                    .into(image);
//        }
//
   }

}