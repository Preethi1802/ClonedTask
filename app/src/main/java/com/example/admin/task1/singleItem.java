package com.example.admin.task1;

/**
 * Created by Admin on 8/2/2017.
 */

public class singleItem
{
    private int image, imgView1, imgView2, imgView3,imgView4;
    private String mobileName, mobileModel, mobilePrize, mobileRating, ratingInWords;

    public singleItem(int image, int imgView1, int imgView2, int imgView3, int imgView4,
                      String mobileName, String mobileModel, String mobilePrize,
                      String mobileRating, String ratingInWords)
    {
        this.image = image;
        this.imgView1 = imgView1;
        this.imgView2 = imgView2;
        this.imgView3 = imgView3;
        this.imgView4 = imgView4;
        this.mobileName = mobileName;
        this.mobileModel = mobileModel;
        this.mobilePrize = mobilePrize;
        this.mobileRating = mobileRating;
        this.ratingInWords = ratingInWords;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImgView1() {
        return imgView1;
    }

    public void setImgView1(int imgView1) {
        this.imgView1 = imgView1;
    }

    public int getImgView2() {
        return imgView2;
    }

    public void setImgView2(int imgView2) {
        this.imgView2 = imgView2;
    }

    public int getImgView3() {
        return imgView3;
    }

    public void setImgView3(int imgView3) {
        this.imgView3 = imgView3;
    }

    public int getImgView4() {
        return imgView4;
    }

    public void setImgView4(int imgView4) {
        this.imgView4 = imgView4;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public String getMobilePrize() {
        return mobilePrize;
    }

    public void setMobilePrize(String mobilePrize) {
        this.mobilePrize = mobilePrize;
    }

    public String getMobileRating() {
        return mobileRating;
    }

    public void setMobileRating(String mobileRating) {
        this.mobileRating = mobileRating;
    }

    public String getRatingInWords() {
        return ratingInWords;
    }

    public void setRatingInWords(String ratingInWords) {
        this.ratingInWords = ratingInWords;
    }
}
