package com.user.myapp.DrawerActivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.user.myapp.R;

public class News extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        textView = (TextView) findViewById(R.id.tv_news);
        textView.setText("fil.txt");
    }
}
