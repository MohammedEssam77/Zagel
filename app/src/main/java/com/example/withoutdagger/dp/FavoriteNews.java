//package com.example.withoutdagger.dp;
//
//import androidx.room.Entity;
//import androidx.room.PrimaryKey;
//
//@Entity(tableName = "favorite_table")
//
//public class FavoriteNews {
//    @PrimaryKey(autoGenerate = true)
//    private Integer id , SourceID;
//    private String Img , SectionTitle , SourceTitle , FormatedDate ,Title;
//
//    public FavoriteNews(Integer id, Integer sourceID, String img, String sectionTitle, String sourceTitle, String formatedDate, String title) {
//        this.id = id;
//        SourceID = sourceID;
//        Img = img;
//        SectionTitle = sectionTitle;
//        SourceTitle = sourceTitle;
//        FormatedDate = formatedDate;
//        Title = title;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getImg() {
//        return Img;
//    }
//
//    public void setImg(String img) {
//        Img = img;
//    }
//
//    public String getSectionTitle() {
//        return SectionTitle;
//    }
//
//    public void setSectionTitle(String sectionTitle) {
//        SectionTitle = sectionTitle;
//    }
//
//    public String getSourceTitle() {
//        return SourceTitle;
//    }
//
//    public void setSourceTitle(String sourceTitle) {
//        SourceTitle = sourceTitle;
//    }
//
//    public String getFormatedDate() {
//        return FormatedDate;
//    }
//
//    public void setFormatedDate(String formatedDate) {
//        FormatedDate = formatedDate;
//    }
//
//    public String getTitle() {
//        return Title;
//    }
//
//    public void setTitle(String title) {
//        Title = title;
//    }
//
//    public Integer getSourceID() {
//        return SourceID;
//    }
//}
