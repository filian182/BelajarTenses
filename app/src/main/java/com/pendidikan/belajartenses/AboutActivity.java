package com.pendidikan.belajartenses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar mToolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(mToolbar);

        if(getSupportActionBar()!=null) {                                ////backToolbar
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }////backToolbar

        mToolbar.setTitle(R.string.tentang);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}