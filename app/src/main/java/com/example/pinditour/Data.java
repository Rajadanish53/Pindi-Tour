package com.example.pinditour;

public class Data {
    String image,description, name,location,timing,ratings,img1,img2,detail;

    public Data(String image, String description, String name, String location, String timing, String ratings, String img1, String img2, String detail) {
        this.image = image;
        this.description = description;
        this.name = name;
        this.location = location;
        this.timing = timing;
        this.ratings = ratings;
        this.img1 = img1;
        this.img2 = img2;
        this.detail = detail;
    }

    public Data(){

}

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
