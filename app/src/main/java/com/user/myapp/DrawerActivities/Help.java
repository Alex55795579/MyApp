package com.user.myapp.DrawerActivities;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.user.myapp.MainActivity;
import com.user.myapp.R;

public class Help extends MainActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//         TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_help, null, false);
        drawerLayout.addView(contentView, 0);

        imageView = (ImageView) findViewById(R.id.context_image);
        registerForContextMenu(imageView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
      getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(Help.this, getString(R.string.context_item_toast1), Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
                Toast.makeText(Help.this, getString(R.string.context_item_toast2), Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Toast.makeText(Help.this, getString(R.string.context_item_toast3), Toast.LENGTH_LONG).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
