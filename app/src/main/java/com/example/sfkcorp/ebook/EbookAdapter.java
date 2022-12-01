package com.example.sfkcorp.ebook;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sfkcorp.R;

import java.util.List;

public class EbookAdapter extends RecyclerView.Adapter<EbookAdapter.EbookViewHolder> {
 private Context context;
 private List<ebookdata> list;

    public EbookAdapter(Context context, List<ebookdata> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public EbookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ebookfile,parent,false);
        return new EbookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EbookViewHolder holder,final int position) {

        holder.ebookName.setText(list.get(position).getPdfTitle());
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,pdfViewer.class);
            intent.putExtra("pdfUrl",list.get(holder.getAbsoluteAdapterPosition()).getPdfUrl());
            context.startActivity(intent);
        }
    });
    holder.ebookDownload.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(list.get(holder.getAbsoluteAdapterPosition()).getPdfUrl()));
            context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class  EbookViewHolder extends RecyclerView.ViewHolder {
        private TextView ebookName;
        private ImageView ebookDownload;
        public EbookViewHolder(@NonNull View itemView) {
            super(itemView);
            ebookName = itemView.findViewById(R.id.ebookName);
            ebookDownload = itemView.findViewById(R.id.ebookDownload);
        }
    }}