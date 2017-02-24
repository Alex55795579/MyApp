package com.user.myapp.DrawerActivities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

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
                Toast toast = Toast.makeText(AboutUs.this, "Button 1 pressed", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                LinearLayout toastImage = (LinearLayout) toast.getView();
                ImageView imView = new ImageView(AboutUs.this);
                imView.setImageResource(R.drawable.ic_plus_black_18dp);
                toastImage.addView(imView, 0);
                toast.show();
            }
        });

    }
}
