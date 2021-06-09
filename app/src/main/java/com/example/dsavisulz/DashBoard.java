package com.example.dsavisulz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class DashBoard extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        ConstraintLayout cl=findViewById(R.id.dashboard_layout);
        AnimationDrawable ad=(AnimationDrawable) cl.getBackground();
        ad.setEnterFadeDuration(1000);
        ad.setExitFadeDuration(1000);
        ad.start();

    }

    public void sorted(View view) {
        PopupMenu popup=new PopupMenu(this,view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.sorting);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Bubble_sort:
                Intent intend=new Intent(this, BubbleSort.class);
                startActivity(intend);
                finish();
                return true;


        }
        return false;
    }

}
