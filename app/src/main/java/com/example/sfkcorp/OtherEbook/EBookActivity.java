package com.example.sfkcorp.OtherEbook;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sfkcorp.R;
import com.example.sfkcorp.ebook.EbookAdapter;
import com.example.sfkcorp.ebook.ebookdata;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class EBookActivity extends AppCompatActivity {

    private RecyclerView ebookRecycler;
    private DatabaseReference reference;
    private List<ebookdata> list;
    private EbookAdapter adapter;
    private ShimmerFrameLayout shimmerFrameLayout;
    InterstitialAd mInterstitialAd;
    TemplateView templateView;
    AdLoader adLoader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook);

        //shimmerFrameLayout = findViewById(R.id.shimmer_view_container);
        ebookRecycler = findViewById(R.id.ebookRecycler);
        reference = FirebaseDatabase.getInstance().getReference().child("Que");


        getData();
        MobileAds.initialize(this);
        AdLoader adLoader = new AdLoader.Builder(this, "ca-app-pub-3940256099942544/2247696110")
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
    }

    private void getData() {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for(DataSnapshot snapshot : dataSnapshot.getChildren()){
                    ebookdata data = snapshot.getValue(ebookdata.class);
                    list.add(data);

                }
                adapter = new EbookAdapter(com.example.sfkcorp.OtherEbook.EBookActivity.this,list);
                ebookRecycler.setLayoutManager(new LinearLayoutManager(com.example.sfkcorp.OtherEbook.EBookActivity.this));
                ebookRecycler.setAdapter(adapter);
               //shimmerFrameLayout.stopShimmer();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(com.example.sfkcorp.OtherEbook.EBookActivity.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}