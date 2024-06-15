package com.example.fitfinessee.ArticlePage;

public class ArticleModel {
    private String title, content, headline;
    private int image;

    public ArticleModel(String title, String content, int image) {
        this.title = title;
        this.content = content;
        this.image = image;
    }



    public ArticleModel(String headline){
        this.headline = headline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
}