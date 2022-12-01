package com.example.sfkcorp.sslcebookactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sfkcorp.R;
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

public class Pcmb extends AppCompatActivity {
    RelativeLayout math,chemistry,biology,physics;
    private InterstitialAd mInterstitialAd;
    TemplateView templateView;
    AdLoader adLoader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcmb);

        math = findViewById(R.id.math);
        // sem1.setOnClickListener(this);
        biology = findViewById(R.id.biology);
        // sem2.setOnClickListener(this);
        chemistry = findViewById(R.id.chemistry);
        //sem3.setOnClickListener(this);
        physics = findViewById(R.id.physics);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        MobileAds.initialize(this);
        AdLoader adLoader = new AdLoader.Builder(this, "ca-app-pub-2940628810690757/6173870304")
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

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(Pcmb.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(Pcmb.this, Maths.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(Pcmb.this, Maths.class);
                    startActivity(intent);
                }

            }
        });
        biology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(Pcmb.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(Pcmb.this,Biology.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(Pcmb.this, Biology.class);
                    startActivity(intent);
                }

            }
        });
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(Pcmb.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(Pcmb.this, Physics.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(Pcmb.this, Physics.class);
                    startActivity(intent);
                }

            }
        });
        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(Pcmb.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(Pcmb.this,Chemistry.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(Pcmb.this, Chemistry.class);
                    startActivity(intent);
                }

            }
        });
    }
    public void  setAds(){
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,getString(R.string.inter16), adRequest,
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