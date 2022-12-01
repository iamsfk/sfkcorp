package com.example.sfkcorp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.sfkcorp.sslcebookactivity.PucAct;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    RelativeLayout sslc,puc,engg,ug,pg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView =(NavigationView) findViewById(R.id.navigationview);


        toolbar = findViewById(R.id.toolbar);
        engg = findViewById(R.id.engg);
        engg.setOnClickListener(this);
        sslc = findViewById(R.id.sslc);
        sslc.setOnClickListener(this);
        puc = findViewById(R.id.puc);
        puc.setOnClickListener(this);
        ug = findViewById(R.id.ug);
        ug.setOnClickListener(this);
        pg = findViewById(R.id.pg);
        pg.setOnClickListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigationopen, R.string.navigationclose);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()){

                    case R.id.refer_menu:
                        intent = new Intent(MainActivity.this, about.class);
                        startActivity(intent);
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
                    case R.id.share_menu:
                        try {
                            intent = new Intent(Intent.ACTION_SEND);
                            intent.setType("text/plain");
                            intent.putExtra(Intent.EXTRA_SUBJECT, "Checkout this cool appliaction");
                            String shareMessage="https://play.google.com/store/apps/details?="+BuildConfig.APPLICATION_ID+"\n\n";
                            intent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                            startActivity(Intent.createChooser(intent, "Pocket Notes"));
                        } catch (Exception e){
                            Toast.makeText(MainActivity.this, "Error occured", Toast.LENGTH_SHORT).show();
                        }break;
                    case R.id.home_menu:
                        Toast.makeText(MainActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.pg:
                        Toast.makeText(MainActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.logout_menu:
                        intent = new Intent(MainActivity.this, Privacy.class);
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                return true;
            }
        });
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }



    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {

            case R.id.engg:
                intent = new Intent(MainActivity.this, Notes.class);
                startActivity(intent);
                break;
            case R.id.sslc:
                intent = new Intent(MainActivity.this, Sslcsubs.class);
                startActivity(intent);
                break;
            case R.id.puc:
                intent = new Intent(MainActivity.this, PucAct.class);
                startActivity(intent);
                break;
            case R.id.ug:
                intent = new Intent(MainActivity.this, UgActivity.class);
                startActivity(intent);
                break;
            case R.id.pg:
                intent = new Intent(MainActivity.this, PgActivity.class);
                startActivity(intent);
                break;

        }
    }
}