package com.example.sfkcorp.OtherEbook;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sfkcorp.Others.Ec;
import com.example.sfkcorp.Others.cse;
import com.example.sfkcorp.Others.eee;
import com.example.sfkcorp.Others.mech;
import com.example.sfkcorp.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class QuetionBranch extends AppCompatActivity  {
    ImageView Sem1, mechs, civil, ec, eee;
    RelativeLayout other;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quetion_branch);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        Sem1 = findViewById(R.id.cse);
        //Sem1.setOnClickListener(this);
        mechs = findViewById(R.id.mech);
        // mechs.setOnClickListener(this);
        civil = findViewById(R.id.civil);
        //civil.setOnClickListener(this);
        ec = findViewById(R.id.ec);
        // ec.setOnClickListener(this);
        eee = findViewById(R.id.eee);
        //eee.setOnClickListener(this);
        other = findViewById(R.id.other);
        //other.setOnClickListener(this);

        setAds();

        Sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(QuetionBranch.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent   intent = new Intent(QuetionBranch.this, cse.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(QuetionBranch.this, cse.class);
                    startActivity(intent);
                }

            }
        });
        mechs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(QuetionBranch.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent   intent = new Intent(QuetionBranch.this, mech.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(QuetionBranch.this, mech.class);
                    startActivity(intent);
                }

            }
        });
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(QuetionBranch.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent   intent = new Intent(QuetionBranch.this, com.example.sfkcorp.Others.civil.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(QuetionBranch.this, com.example.sfkcorp.Others.civil.class);
                    startActivity(intent);
                }

            }
        });
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(QuetionBranch.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent   intent = new Intent(QuetionBranch.this, Ec.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(QuetionBranch.this, Ec.class);
                    startActivity(intent);
                }

            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(QuetionBranch.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent   intent = new Intent(QuetionBranch.this, com.example.sfkcorp.Others.eee.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(QuetionBranch.this, eee.class);
                    startActivity(intent);
                }

            }
        });


    }
    public void  setAds(){
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,getString(R.string.inter6), adRequest,
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



