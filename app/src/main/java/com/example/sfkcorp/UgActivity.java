package com.example.sfkcorp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.sfkcorp.BaSem.Basem;
import com.example.sfkcorp.BcaSem.Bcasem;
import com.example.sfkcorp.bcom.bcomSem;
import com.example.sfkcorp.bscSem.BscSem;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.material.navigation.NavigationView;

public class UgActivity extends AppCompatActivity  {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    private InterstitialAd mInterstitialAd;
    TemplateView templateView;
    AdLoader adLoader;


    RelativeLayout ba,bcom,bsc,bca;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug);

        //drawerLayout = findViewById(R.id.drawerlayout);
        // navigationView =(NavigationView) findViewById(R.id.navigationview);


        toolbar = findViewById(R.id.toolbar);
        ba = findViewById(R.id.ba);
        //ba.setOnClickListener(this);
        bcom = findViewById(R.id.bcom);
       // bcom.setOnClickListener(this);
        bsc = findViewById(R.id.bsc);
       // bsc.setOnClickListener(this);
        bca = findViewById(R.id.bca);
        //bca.setOnClickListener(this);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        MobileAds.initialize(this);
        AdLoader adLoader = new AdLoader.Builder(this, "ca-app-pub-2940628810690757/1876081380")
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().build();
                        TemplateView template = findViewById(R.id.my_template);
                        template.setStyles(styles);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(UgActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(UgActivity.this, Basem.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(UgActivity.this, Basem.class);
                    startActivity(intent);
                }

            }
        });
        bcom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(mInterstitialAd!=null){

                mInterstitialAd.show(UgActivity.this);
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        Intent intent = new Intent(UgActivity.this, bcomSem.class);
                        startActivity(intent);
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            } else {
                Intent intent = new Intent(UgActivity.this, bcomSem.class);
                startActivity(intent);
            }

        }
    });
        bsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(UgActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(UgActivity.this, BscSem.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(UgActivity.this, BscSem.class);
                    startActivity(intent);
                }

            }
        });
        bca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(UgActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(UgActivity.this, Bcasem.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(UgActivity.this, Bcasem.class);
                    startActivity(intent);
                }

            }
        });


    }
    public void  setAds(){
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,getString(R.string.inter22), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error

                        mInterstitialAd = null;
                    }
                });}



}