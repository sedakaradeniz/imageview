package com.sedaproje.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void changeİmage(View view){
        ImageView imageView =findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.metallica2);


   }


}
