package com.example.withoutdagger.adapter;

import com.example.withoutdagger.pojo.DetailsModel;
import com.example.withoutdagger.pojo.NewsModel;

public interface RequestData {
    void requestData(NewsModel newsModel);
    void dataResponse(DetailsModel detailsModel);
}
