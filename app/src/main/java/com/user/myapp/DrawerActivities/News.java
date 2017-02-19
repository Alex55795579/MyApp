package com.user.myapp.DrawerActivities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.user.myapp.MainActivity;
import com.user.myapp.R;

public class News extends MainActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//         TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_news, null, false);
        drawerLayout.addView(contentView, 0);

        textView = (TextView) findViewById(R.id.tv_news);
        textView.setText("fil.txt");
    }
}
