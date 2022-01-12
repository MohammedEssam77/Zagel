package com.example.withoutdagger.pojo;

public class DetailsModel {

    private int ID;
    private String Title;
    private String Breif;
    private String Img;
    private String FormatedDate;
    private String SectionTitle;
    private int SourceID;
    private String SourceTitle;
    private String SourceNewsURL;
    private String SourceNewsURLIframe;
    private boolean IsSelectedSection;
    private boolean IsSelectedSource;
    private boolean IsSelectedFavorite;
    private boolean IsSelectedReadLater;
    private String Ratio;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getBreif() {
        return Breif;
    }

    public void setBreif(String breif) {
        Breif = breif;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public String getFormatedDate() {
        return FormatedDate;
    }

    public void setFormatedDate(String formatedDate) {
        FormatedDate = formatedDate;
    }

    public String getSectionTitle() {
        return SectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        SectionTitle = sectionTitle;
    }

    public int getSourceID() {
        return SourceID;
    }

    public void setSourceID(int sourceID) {
        SourceID = sourceID;
    }

    public String getSourceTitle() {
        return SourceTitle;
    }

    public void setSourceTitle(String sourceTitle) {
        SourceTitle = sourceTitle;
    }

    public String getSourceNewsURL() {
        return SourceNewsURL;
    }

    public void setSourceNewsURL(String sourceNewsURL) {
        SourceNewsURL = sourceNewsURL;
    }

    public String getSourceNewsURLIframe() {
        return SourceNewsURLIframe;
    }

    public void setSourceNewsURLIframe(String sourceNewsURLIframe) {
        SourceNewsURLIframe = sourceNewsURLIframe;
    }

    public boolean isSelectedSection() {
        return IsSelectedSection;
    }

    public void setSelectedSection(boolean selectedSection) {
        IsSelectedSection = selectedSection;
    }

    public boolean isSelectedSource() {
        return IsSelectedSource;
    }

    public void setSelectedSource(boolean selectedSource) {
        IsSelectedSource = selectedSource;
    }

    public boolean isSelectedFavorite() {
        return IsSelectedFavorite;
    }

    public void setSelectedFavorite(boolean selectedFavorite) {
        IsSelectedFavorite = selectedFavorite;
    }

    public boolean isSelectedReadLater() {
        return IsSelectedReadLater;
    }

    public void setSelectedReadLater(boolean selectedReadLater) {
        IsSelectedReadLater = selectedReadLater;
    }

    public String getRatio() {
        return Ratio;
    }

    public void setRatio(String ratio) {
        Ratio = ratio;
    }
}