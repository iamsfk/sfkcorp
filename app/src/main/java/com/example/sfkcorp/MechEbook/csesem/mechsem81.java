package com.example.sfkcorp.MechEbook.csesem;

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
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class mechsem81 extends AppCompatActivity {

    private RecyclerView ebookRecycler;
    private DatabaseReference reference;
    private List<ebookdata> list;
    private EbookAdapter adapter;
    private ShimmerFrameLayout shimmerFrameLayout;
    InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook);

      //  shimmerFrameLayout = findViewById(R.id.shimmer_view_container);
        ebookRecycler = findViewById(R.id.ebookRecycler);
        reference = FirebaseDatabase.getInstance().getReference().child("pf");


        getData();

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
                adapter = new EbookAdapter(mechsem81.this,list);
                ebookRecycler.setLayoutManager(new LinearLayoutManager(mechsem81.this));
                ebookRecycler.setAdapter(adapter);
              //  shimmerFrameLayout.stopShimmer();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(mechsem81.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
