package com.example.joker.androidtest;

public class hero {

    private String nameTextView;
    private int heroImageView;

    public hero (String nameTextView) {
        this.nameTextView = nameTextView;
        this.heroImageView = heroImageView;
    }

    public String getNameTextView() { return nameTextView ; }

    public void setNameTextView(String nameTextView)
    {
        this.nameTextView = nameTextView;
    }


    public int getHeroImageView() {
        return  heroImageView;
    }

    public  void setHeroImageView(int heroImageView) {
        this.heroImageView =heroImageView;}

}
