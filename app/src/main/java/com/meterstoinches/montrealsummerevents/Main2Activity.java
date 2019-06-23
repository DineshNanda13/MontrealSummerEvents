package com.meterstoinches.montrealsummerevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView imageView;
    int images;
    String names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.imageView2);

        Bundle bundle=getIntent().getExtras();
        images=bundle.getInt("images");
        names=bundle.getString("names");

        imageView.setImageResource(images);
    }
}
