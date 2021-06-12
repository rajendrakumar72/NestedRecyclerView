package com.example.nestedrecyclerview;

public class ChildModel {
    private int heroImage;
    private String movieName;

    public ChildModel(int heroImage, String movieName) {
        this.heroImage = heroImage;
        this.movieName = movieName;
    }

    public int getHeroImage() {
        return heroImage;
    }

    public String getMovieName() {
        return movieName;
    }
}
