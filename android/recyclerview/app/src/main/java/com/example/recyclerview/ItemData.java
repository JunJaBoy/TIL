package com.example.recyclerview;

public class ItemData {
    String title;
    String content;
    int image;

    public ItemData(int image, String title, String content) {
        this.image = image;
        this.content = content;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    }
