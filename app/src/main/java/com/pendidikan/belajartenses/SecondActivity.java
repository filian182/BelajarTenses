package com.pendidikan.belajartenses;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //iklan banner admob
        PublisherAdView mPublisherAdView = findViewById(R.id.adView);
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder().build();
        mPublisherAdView.loadAd(adRequest);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.SMART_BANNER);
        //iklan banner admob

        Toolbar mToolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(mToolbar);
        TextView textView1= findViewById(R.id.textView1);
        TextView textView2= findViewById(R.id.textView2);
        TextView textView3= findViewById(R.id.textView3);
        TextView textView4= findViewById(R.id.textView4);
        TextView textView5= findViewById(R.id.textView5);
        TextView textView6= findViewById(R.id.textView6);

        if(getSupportActionBar()!=null) {                                ////backToolbar
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }                                                            ////backToolbar

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("CatagoryName"));}

        if (mToolbar.getTitle().toString().equalsIgnoreCase("TENSES (BENTUK WAKTU)")) {
            textView1.setText(R.string.Penjelasan);
            textView2.setText(R.string.PenjelasanTenses);
            textView3.setText(R.string.kalimatNominal);
            textView4.setText(R.string.kalimatNominal1);
            textView5.setText(R.string.kalimatVerbal);
            textView6.setText(R.string.kalimatVerbal1);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }if (mToolbar.getTitle().toString().equalsIgnoreCase("1. Simple Present")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses1);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses11);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses111);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("2. Present Continuous")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses2);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses22);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses333);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("3. Present Perfect")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses3);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses33);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses333);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("4. Present Perfect Continuous")) {
            textView1.setText(R.string.description);
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses4);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses44);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses444);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("5. Simple Past")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses5);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses55);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses555);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("6. Past Continuous")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses6);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses66);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses666);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("7. Past Perfect")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses7);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses77);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses777);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("8. Past Perfect Continuous")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses8);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses88);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses888);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("9. Simple Future")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses9);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses99);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses999);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("10. Future Continuous")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses10);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses1010);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses101010);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("11. Future Perfect")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses1111);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses111111);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses11111111);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("12. Future Perfect Continuous")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses12);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses1212);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses121212);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("13. Past Future")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses13);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses1313);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses131313);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("14. Past Future Continuous")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses14);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses1414);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses141414);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("15. Past Future Perfect")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses15);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses1515);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses151515);
            mToolbar.setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.lightgreen500));


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("16. Past Future Perfect Continuous")) {
            textView1.setText(R.string.description);
            textView2.setText(R.string.tenses16);
            textView3.setText(R.string.formula);
            textView4.setText(R.string.tenses1616);
            textView5.setText(R.string.example);
            textView6.setText(R.string.tenses161616);
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
