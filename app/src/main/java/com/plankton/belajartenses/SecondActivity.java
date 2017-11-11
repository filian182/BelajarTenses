package com.plankton.belajartenses;


import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //iklan banner admob
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(mToolbar);
        WebView webView = (WebView) findViewById(R.id.webView);

        if(getSupportActionBar()!=null) {                                ////backToolbar
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }                                                            ////backToolbar

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("CatagoryName"));}

        if (mToolbar.getTitle().toString().equalsIgnoreCase("1. Simple Present")) {
            webView.loadUrl("file:///android_asset/new/1.Simple_Present.html");
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("2. Present Continuous")) {
            webView.loadUrl("file:///android_asset/new/2.Present_Continuous.html");
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("3. Present Perfect")) {
            webView.loadUrl("file:///android_asset/new/3.Present_Perfect.html");
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("4. Present Perfect Continuous")) {
            webView.loadUrl("file:///android_asset/new/4.Present_Perfect_Continuous.html");
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("5. Simple Past")) {
            webView.loadUrl("file:///android_asset/new/5.Simple_Past.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("6. Past Continuous")) {
            webView.loadUrl("file:///android_asset/new/6.Past_Continuous.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("7. Past Perfect")) {
            webView.loadUrl("file:///android_asset/new/7.Past_Perfect.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("8. Past Perfect Continuous")) {
            webView.loadUrl("file:///android_asset/new/8.Past_Perfect_Continuous.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("9. Simple Future")) {
            webView.loadUrl("file:///android_asset/new/9.Simple_Future.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("10. Future Continuous")) {
            webView.loadUrl("file:///android_asset/new/10.Future_Continuous.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("11. Future Perfect")) {
            webView.loadUrl("file:///android_asset/new/11.Future_Perfect.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("12. Future Perfect Continuous")) {
            webView.loadUrl("file:///android_asset/new/12.Future_Perfect_Continuous.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("13. Past Future")) {
            webView.loadUrl("file:///android_asset/new/13.Past_Future.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("14. Past Future Continuous")) {
            webView.loadUrl("file:///android_asset/new/14.Past_Future_Continuous.html");

            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("15. Past Future Perfect")) {
            webView.loadUrl("file:///android_asset/new/15.Past_Future_Perfect.html");
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("16. Past Future Perfect Continuous")) {
            webView.loadUrl("file:///android_asset/new/16.Past_Future_Perfect_Continuous.html");
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }

    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
   //
//
//
//
//
//
//
//
//
