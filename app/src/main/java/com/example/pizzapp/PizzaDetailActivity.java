package com.example.pizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int image = intent.getIntExtra("image", R.drawable.cheese);
        String description = intent.getStringExtra("description");
        String ingredients = intent.getStringExtra("ingredients");

        TextView nameView = findViewById(R.id.pizzaName);
        ImageView imageView = findViewById(R.id.pizzaImage);
        TextView descriptionView = findViewById(R.id.pizzaDescription);
        TextView ingredientsView = findViewById(R.id.pizzaRecette);

        nameView.setText(name);
        imageView.setImageResource(image);
        descriptionView.setText(description);
        ingredientsView.setText(ingredients);
    }
}
