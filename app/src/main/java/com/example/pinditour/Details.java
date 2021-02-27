package com.example.pinditour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class Details extends AppCompatActivity {
    ImageView mainimgt,mainimgt1,mainimgt2;
String mainimg,mainimg1,mainimg2,mainname,detail,location,timing,rating;
TextView mainnamet,descriptiont,locationt,timingt,ratingt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
//        Getting of all the instances ids
        mainimgt=findViewById(R.id.mainimg);
        mainimgt1=findViewById(R.id.mainimg1);
        mainimgt2=findViewById(R.id.mainimg2);
        mainnamet=findViewById(R.id.mainname);
        descriptiont=findViewById(R.id.description);
        locationt=findViewById(R.id.location);
        timingt=findViewById(R.id.timing);
        ratingt=findViewById(R.id.rating);

//        Getting data from intent
        Intent getdata = getIntent();
        mainimg=getdata.getStringExtra("image");
        mainimg1=getdata.getStringExtra("image1");
        mainimg2=getdata.getStringExtra("image2");
        timing=getdata.getStringExtra("timing");
        String description=getdata.getStringExtra("description");
        detail=getdata.getStringExtra("detail");
        location = getdata.getStringExtra("location");
        rating=getdata.getStringExtra("rating");
        mainname=getdata.getStringExtra("name");
//        setting all the text
        locationt.setText(location);
        timingt.setText(timing);
        ratingt.setText(rating);
        if(detail==null){
            descriptiont.setText(description);
        }else{
            descriptiont.setText(detail);
        }

        mainnamet.setText(mainname);

        //Gliding of images
        Glide.with(this).load(mainimg).into(mainimgt);
        Glide.with(this).load(mainimg1).into(mainimgt1);
        Glide.with(this).load(mainimg2).into(mainimgt2);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent goback = new Intent(Details.this,MainScreen.class);
        startActivity(goback);
        finish();
    }
}