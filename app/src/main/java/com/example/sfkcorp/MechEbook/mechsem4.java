package com.example.sfkcorp.MechEbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sfkcorp.R;
import com.example.sfkcorp.mechsemmodule.csesem.mechsem41;
import com.example.sfkcorp.mechsemmodule.csesem.mechsem42;
import com.example.sfkcorp.mechsemmodule.csesem.mechsem43;
import com.example.sfkcorp.mechsemmodule.csesem.mechsem44;
import com.example.sfkcorp.mechsemmodule.csesem.mechsem45;
import com.example.sfkcorp.mechsemmodule.csesem.mechsem91;
import com.example.sfkcorp.mechsemmodule.csesem.mechsem92;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class mechsem4 extends AppCompatActivity {
    Button button,button2,button3,button4,button5,button11,button12;
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;
    TemplateView templateView;
    AdLoader adLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mechsem4);

        button = findViewById(R.id.button);
        // button.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        //button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        //button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        // button4.setOnClickListener(this);
        button5 = findViewById(R.id.button5);
        //button5.setOnClickListener(this);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(mechsem4.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(mechsem4.this, mechsem41.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(mechsem4.this, mechsem41.class);
                    startActivity(intent);
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(mechsem4.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(mechsem4.this, mechsem42.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(mechsem4.this, mechsem42.class);
                    startActivity(intent);
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(mechsem4.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(mechsem4.this, mechsem43.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(mechsem4.this, mechsem43.class);
                    startActivity(intent);
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(mechsem4.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(mechsem4.this, mechsem44.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(mechsem4.this, mechsem44.class);
                    startActivity(intent);
                }

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(mechsem4.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(mechsem4.this, mechsem45.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(mechsem4.this, mechsem45.class);
                    startActivity(intent);
                }

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(mechsem4.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(mechsem4.this, mechsem91.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(mechsem4.this, mechsem91.class);
                    startActivity(intent);
                }

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mInterstitialAd!=null){

                    mInterstitialAd.show(mechsem4.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent intent = new Intent(mechsem4.this, mechsem92.class);
                            startActivity(intent);
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                } else {
                    Intent intent = new Intent(mechsem4.this, mechsem92.class);
                    startActivity(intent);
                }

            }
        });
    }
    public void  setAds(){
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,getString(R.string.unitad), adRequest,
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