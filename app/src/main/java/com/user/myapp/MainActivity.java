package com.user.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.user.myapp.DrawerActivities.AboutUs;
import com.user.myapp.DrawerActivities.Contacts;
import com.user.myapp.DrawerActivities.Help;
import com.user.myapp.DrawerActivities.Images;
import com.user.myapp.DrawerActivities.News;
import com.user.myapp.DrawerActivities.Videos;


public class MainActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        initToolbar();
        initNavigationView();
    }

    private void initToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

    }


    private void initNavigationView(){
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.view_news_open, R.string.view_news_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();
                Intent intent;
                switch (item.getItemId()){
                    case R.id.aboutItem:
                        intent = new Intent(MainActivity.this, AboutUs.class);
                        startActivity(intent);
                        break;
                    case R.id.newsItem:
                        intent = new Intent(MainActivity.this, News.class);
                        startActivity(intent);
                        break;
                    case R.id.activity_images:
                        intent = new Intent(MainActivity.this, Images.class);
                        startActivity(intent);
                        break;
                    case R.id.videosItem:
                        intent = new Intent(MainActivity.this, Videos.class);
                        startActivity(intent);
                        break;
                    case R.id.helpItem:
                        intent = new Intent(MainActivity.this, Help.class);
                        startActivity(intent);
                        break;
                    case R.id.contactsItem:
                        intent = new Intent(MainActivity.this, Contacts.class);
                        startActivity(intent);
                        break;

                }
                return true;
            }
        });
    }

}
