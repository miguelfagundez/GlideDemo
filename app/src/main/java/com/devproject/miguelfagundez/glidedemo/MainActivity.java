package com.devproject.miguelfagundez.glidedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    // Members
    private ImageView image;

    // Url
    private String urlSquare = "https://picsum.photos/2000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMembers();
        setupGlidePlaceHolder();
    }

    private void setupMembers() {
        image = findViewById(R.id.ivImage);
    }

    private void setupGlidePlaceHolder() {

        // Square Image
        Glide.with(MainActivity.this)
                .load(urlSquare)
                .placeholder(R.drawable.progress_bar)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(image);
    }
}
