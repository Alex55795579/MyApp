package com.user.myapp.DrawerActivities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.user.myapp.MainActivity;
import com.user.myapp.R;

public class AboutUs extends MainActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//         TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_about_us, null, false);
        drawerLayout.addView(contentView, 0);



        button = (Button) findViewById(R.id.btn_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUs.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
