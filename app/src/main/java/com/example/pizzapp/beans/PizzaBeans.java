package com.example.pizzapp.beans;


public class PizzaBeans {
    private int id;
    private String nom;
    private int prix;
    private int image;
    private String description;
    private String ingredients;

    public PizzaBeans(int id, String nom, int prix, int image, String description, String ingredients) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.image = image;
        this.description = description;
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getIngredients() {
        return ingredients;
    }
}
