package com.pendidikan.belajartenses;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ListView ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        ListView = findViewById(R.id.Listview);

        NavigationView navigationView = findViewById(R.id.menu);
        final DrawerLayout mdrawerLayout = findViewById(R.id.drawerLayout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mdrawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer);
        mdrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.catagory));

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("CatagoryName", ListView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        ListView.setAdapter(mAdapter);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressWarnings("NullableProblems")
            @Override
            public boolean onNavigationItemSelected(MenuItem menu) {
                //Memeriksa apakah item tersebut dalam keadaan dicek  atau tidak,
                if (menu.isChecked()) menu.setChecked(false);
                else menu.setChecked(true);
                //Menutup  drawer item klik
                mdrawerLayout.closeDrawers();
                //Memeriksa untuk melihat item yang akan dilklik dan melalukan aksi
                switch (menu.getItemId()) {
                    // pilihan menu item navigasi akan menampilkan pesan toast klik kalian bisa menggantinya
                    //dengan intent activity

                    case R.id.navigation4:

                    case R.id.navigation5:
                        Intent tentangintent =new Intent(getApplicationContext(),AboutActivity.class);
                        startActivity(tentangintent);
                        return true;

                    case R.id.action_share:
                        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        String shareBodyText = "https://play.google.com/store/apps/details?id=com.pendidikan.belajartenses";
                        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Aplikasi Belajar Tenses");
                        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
                        startActivity(Intent.createChooser(sharingIntent, "Bagikan dengan"));
                        return true;


                    default:
                        Toast.makeText(getApplicationContext(), "Kesalahan Terjadi ", Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
    }
    // Menginisasi Drawer Layout dan ActionBarToggle
    @Override
    public void onBackPressed () {

        {
            new AlertDialog.Builder(this)
                    .setMessage("Apakah anda yakin ingin keluar ?")
                    .setCancelable(false)
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {


                            MainActivity.this.finish();
                        }
                    })
                    .setNegativeButton("Tidak", null).show();
        }
    }
}