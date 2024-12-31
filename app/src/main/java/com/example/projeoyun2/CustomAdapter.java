package com.example.projeoyun2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<oyunClass> veriler;

    public CustomAdapter(Context context, ArrayList<oyunClass> veriler) {
        this.context = context;
        this.veriler = veriler;
    }

    @Override
    public int getCount() {
        return veriler.size();
    }

    @Override
    public Object getItem(int position) {
        return veriler.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View yeniGorunum = inflater.inflate(R.layout.oyun,null);

        TextView oyunAdi = yeniGorunum.findViewById(R.id.oyunAdi);
        TextView oyunYil = yeniGorunum.findViewById(R.id.oyunYıl);
        TextView oyunTur = yeniGorunum.findViewById(R.id.oyunTur);
        TextView oyunPuan = yeniGorunum.findViewById(R.id.oyunPuan);
        ImageView oyunImg = yeniGorunum.findViewById(R.id.oyunImg);

        oyunAdi.setText(veriler.get(position).getOyunAdi());
        oyunYil.setText(veriler.get(position).getOyunYil());
        oyunTur.setText(veriler.get(position).getOyunTur());
        oyunPuan.setText(veriler.get(position).getOyunPuan());
        oyunImg.setBackgroundColor(veriler.get(position).getOyunPoster());

        return yeniGorunum;
    }
}
