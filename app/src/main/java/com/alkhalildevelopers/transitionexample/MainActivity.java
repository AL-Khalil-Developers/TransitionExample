package com.alkhalildevelopers.transitionexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView ;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        textView = findViewById(R.id.textViewID);
        imageView = findViewById(R.id.imageViewID);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String> (imageView,"imageTransition");
                pairs[1] = new Pair<View,String>(textView,"textViewTransition");

                ActivityOptions activityOptions = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                }
                startActivity(new Intent(MainActivity.this,Main2Activity.class),activityOptions.toBundle());

            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String> (imageView,"imageTransition");
                pairs[1] = new Pair<View,String>(textView,"textViewTransition");

                ActivityOptions activityOptions = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                }
                startActivity(new Intent(MainActivity.this,Main2Activity.class),activityOptions.toBundle());
            }
        });
    }
}
