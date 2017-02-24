package com.user.myapp.DrawerActivities;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.user.myapp.MainActivity;
import com.user.myapp.R;

public class Images extends MainActivity {

    Button btn, btn1, btn2;
    ImageView imageView;
    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//         TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_images, null, false);
        drawerLayout.addView(contentView, 0);

        Log.d(TAG, "find view");
        btn = (Button) findViewById(R.id.im1_btn);
        btn1 = (Button) findViewById(R.id.im2_btn);
        btn2 = (Button) findViewById(R.id.im3_btn);
        imageView = (ImageView) findViewById(R.id.im_v);

        View.OnClickListener vol = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()){
                    case R.id.im1_btn:
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_contact_mail_black_18dp));
                        Log.d(TAG, "button 1 pressed");
                        break;
                    case R.id.im2_btn:
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_archive_black_18dp));
                        Log.d(TAG, "button 2 pressed");
                        break;
                    case R.id.im3_btn:
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_magnify_black_18dp));
                        Log.d(TAG, "button default pressed");
                        break;

                }
            }
        };
        btn.setOnClickListener(vol);
        btn1.setOnClickListener(vol);
        btn2.setOnClickListener(vol);

    }

}
