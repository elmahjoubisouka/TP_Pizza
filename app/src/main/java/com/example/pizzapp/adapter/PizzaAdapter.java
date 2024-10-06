package com.example.pizzapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzapp.R;
import com.example.pizzapp.beans.PizzaBeans;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<PizzaBeans> pizzas;
    private LayoutInflater inflater;

    public PizzaAdapter(List<PizzaBeans> pizzas, Activity activity) {
        this.pizzas = pizzas;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.item, parent, false);

        TextView nom = convertView.findViewById(R.id.nom);
        TextView prix = convertView.findViewById(R.id.prix);
        ImageView photo = convertView.findViewById(R.id.photo);

        nom.setText(pizzas.get(position).getNom());
        prix.setText( pizzas.get(position).getPrix() + "DH");
        photo.setImageResource(pizzas.get(position).getImage());

        return convertView;
    }
}
