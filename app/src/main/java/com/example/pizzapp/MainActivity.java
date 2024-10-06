package com.example.pizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzapp.adapter.PizzaAdapter;
import com.example.pizzapp.beans.PizzaBeans;
import com.example.pizzapp.services.PizzaService;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private PizzaService ps = null;
    private PizzaAdapter adapter;
    private ListView list;
    private List<PizzaBeans> pizzaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ps = new PizzaService();
        ps.create(new PizzaBeans(1, "Pizza Margherita", 46, R.drawable.test, "Description\n \n La pizza Margherita est un plat emblématique de la cuisine italienne, réputée pour sa simplicité et sa fraîcheur. Elle est préparée avec une base de pâte à pizza, une sauce tomate, de la mozzarella fondue, et garnie de feuilles de basilic frais. Chaque bouchée offre un équilibre parfait entre le goût sucré de la tomate, la crémeux de la mozzarella et l'arôme frais du basilic.", "Ingrédients\n \n" +
                "Pâte à pizza\n" +
                "Sauce tomate (préparée à partir de tomates pelées, d'ail et d'huile d'olive)\n" +
                "Mozzarella (idéalement de la mozzarella di bufala)\n" +
                "Basilic frais\n" +
                "Huile d'olive extra vierge\n" +
                "Sel (pour assaisonner)"));
        ps.create(new PizzaBeans(2, "Pizza Chicago", 40, R.drawable.veggie, " Description\n \n La pizza Chicago, souvent appelée \"deep-dish pizza\", est célèbre pour sa croûte épaisse et moelleuse, qui forme une sorte de plat à tarte. Cette pizza est cuite dans un moule profond, ce qui lui permet de contenir une généreuse couche de garnitures. La sauce tomate est généralement versée sur le dessus, recouvrant le fromage et les ingrédients, ce qui la rend unique par rapport aux autres styles de pizza. Chaque bouchée offre une expérience riche et savoureuse, parfaite pour les amateurs de fromage et de garnitures copieuses.", "Ingrédients\n \n" +
                "Pâte à pizza profonde (faite avec de la farine, de l'eau, de la levure, de l'huile d'olive et du sel)\n" +
                "Fromage mozzarella (généralement en tranches ou en morceaux)\n" +
                "Saucisse italienne (coupée ou émiettée)\n" +
                "Oignons (émincés)\n" +
                "Poivrons (coupés en dés)\n" +
                "Champignons (tranchés)\n" +
                "Tomates concassées (pour la sauce)\n" +
                "Herbes et épices (comme l'origan et le basilic)\n" +
                "Parmesan (râpé, pour le dessus)"));

        ps.create(new PizzaBeans(3, "Pizza Napolitaine", 45, R.drawable.california, "Description\n \n La pizza napolitaine est un symbole de la cuisine italienne, particulièrement appréciée pour sa pâte fine et moelleuse, légèrement croustillante sur les bords. Originaire de Naples, cette pizza est souvent cuite dans un four à bois à haute température, ce qui lui confère une texture unique et un goût riche. La pizza napolitaine est traditionnellement garnie de sauce tomate San Marzano, de mozzarella di bufala, d'huile d'olive extra vierge et de basilic frais, ce qui en fait un plat simple mais d'une grande finesse.", "Ingrédients\n \n" +
                "Pâte à pizza (faite avec de la farine, de l'eau, de la levure, et du sel)\n" +
                "Sauce tomate San Marzano (ou autre tomate de qualité)\n" +
                "Mozzarella di bufala (ou mozzarella fiore di latte)\n" +
                "Basilic frais\n" +
                "Huile d'olive extra vierge\n" +
                "Sel (pour assaisonner)"));
        ps.create(new PizzaBeans(4, "Pizza de Detroit", 46, R.drawable.diavola, " Description\n \n La pizza de Detroit est un style de pizza unique, caractérisé par sa croûte épaisse et ses bords croustillants, souvent cuite dans une plaque rectangulaire en métal. Ce type de pizza est reconnu pour sa garniture généreuse de fromage qui s'étend jusqu'aux bords de la croûte, créant ainsi une croûte caramélisée. Contrairement aux pizzas traditionnelles, la sauce est souvent ajoutée sur le dessus des garnitures. La pizza de Detroit est généralement riche, savoureuse et idéale pour ceux qui aiment une pizza copieuse.", "Ingrédients\n \n" +
                "Pâte à pizza (faite avec de la farine, de l'eau, de la levure, de l'huile d'olive et du sel)\n" +
                "Fromage mozzarella (souvent en cubes ou en morceaux)\n" +
                "Saucisse italienne (ou autre viande, selon les préférences)\n" +
                "Oignons (émincés, souvent ajoutés sous le fromage)\n" +
                "Sauce tomate (ajoutée sur le dessus)\n" +
                "Herbes et épices (comme l'origan et le basilic)\n" +
                "Poivrons (facultatif, pour une touche de saveur supplémentaire)"));

        ps.create(new PizzaBeans(5, "Pizza Italienne ", 40, R.drawable.italienne, "Description\n\n La pizza italienne est un plat emblématique de la cuisine italienne, apprécié pour sa simplicité et la qualité de ses ingrédients. Elle est généralement préparée avec une pâte fine et croustillante, cuite à haute température dans un four à bois. La pizza italienne peut être garnie de manière variée, mais les combinaisons classiques mettent en valeur les saveurs des ingrédients frais. Que ce soit une Margherita avec des tomates, de la mozzarella et du basilic, ou une Quattro Stagioni avec des artichauts, des champignons, du jambon et des olives, chaque pizza est un équilibre parfait de goûts et de textures.", "Ingrédients\n\n" +
                "Les ingrédients d'une pizza italienne peuvent varier selon les préférences, mais les garnitures classiques comprennent :\n" +
                "\n" +
                "Pâte à pizza (faite avec de la farine, de l'eau, de la levure et du sel)\n" +
                "Sauce tomate (préparée à partir de tomates San Marzano ou d'autres tomates de qualité)\n" +
                "Fromage mozzarella (idéalement mozzarella di bufala)\n" +
                "Basilic frais\n" +
                "Huile d'olive extra vierge\n" +
                "Sel et poivre (pour assaisonner)"));

        ps.create(new PizzaBeans(6, "Pizza Meat", 40, R.drawable.meat, "Description\n\n La pizza viande est une variante copieuse qui regorge de différentes viandes, offrant un mélange de saveurs riches et savoureuses. C'est une option très appréciée par les amateurs de viande, généralement garnie de diverses viandes telles que la saucisse, le pepperoni, le jambon, le bacon et parfois même le poulet. Cette pizza est souvent recouverte de fromage fondant et de sauce tomate, le tout cuit à la perfection pour créer une croûte croustillante. La pizza viande est idéale pour les repas en famille ou entre amis, parfaite pour ceux qui aiment des plats robustes et réconfortants.", "Ingrédients\n\n" +
                "Les ingrédients d'une pizza viande peuvent varier, mais voici une liste typique :\n" +
                "\n" +
                "Pâte à pizza (faite avec de la farine, de l'eau, de la levure, de l'huile d'olive et du sel)\n" +
                "Sauce tomate (ou sauce marinara)\n" +
                "Fromage mozzarella (ou un mélange de fromages)\n" +
                "Saucisse italienne (coupée ou émiettée)\n" +
                "Pepperoni (tranché)\n" +
                "Jambon (en dés ou tranché)\n" +
                "Bacon (cuit et émietté)\n" +
                "Poulet grillé (facultatif)\n" +
                "Oignons (émincés, pour ajouter de la saveur)\n" +
                "Poivrons (facultatif, pour une touche de couleur et de croquant)\n" +
                "Herbes et épices (comme l'origan et le basilic)"));
        ps.create(new PizzaBeans(7, "Pizza Supreme", 66, R.drawable.supreme, "Description\n \n La pizza supreme est une option généreusement garnie, qui combine une variété d'ingrédients pour créer une expérience de saveur riche et satisfaisante. Souvent considérée comme la pizza parfaite pour les amateurs de plusieurs saveurs, elle est généralement chargée de viandes, de légumes et de fromages. Les garnitures typiques incluent de la saucisse, du pepperoni, des poivrons, des oignons, des olives et parfois des champignons. La pizza supreme est idéale pour les repas en famille ou entre amis, offrant un mélange de textures et de saveurs dans chaque bouchée.", "Ingrédients\n \n" +
                "Les ingrédients d'une pizza supreme peuvent varier, mais voici une liste typique :\n" +
                "\n" +
                "Pâte à pizza (faite avec de la farine, de l'eau, de la levure, de l'huile d'olive et du sel)\n" +
                "Sauce tomate (ou sauce marinara)\n" +
                "Fromage mozzarella (ou un mélange de fromages)\n" +
                "Saucisse italienne (coupée ou émiettée)\n" +
                "Pepperoni (tranché)\n" +
                "Oignons (émincés)\n" +
                "Poivrons (rouges ou verts, coupés en dés)\n" +
                "Olives noires (ou vertes, tranchées)\n" +
                "Champignons (facultatif, tranchés)\n" +
                "Herbes et épices (comme l'origan et le basilic)"));
        ps.create(new PizzaBeans(8, "Pizza perpperoni", 50, R.drawable.pepperroni, "Description\n \n La pizza pepperoni est l'un des styles de pizza les plus populaires, surtout aux États-Unis. Elle se caractérise par sa garniture généreuse de tranches de pepperoni, un salami épicé qui devient croustillant lorsqu'il est cuit. La combinaison du fromage fondant et de la sauce tomate avec le pepperoni savoureux crée une expérience délicieuse et satisfaisante. C'est un choix classique pour ceux qui apprécient les saveurs épicées et réconfortantes de la pizza.", "Ingrédients\n \n" +
                "Les ingrédients d'une pizza pepperoni typique comprennent :\n" +
                "\n" +
                "Pâte à pizza (faite avec de la farine, de l'eau, de la levure, de l'huile d'olive et du sel)\n" +
                "Sauce tomate (ou sauce marinara)\n" +
                "Fromage mozzarella (généralement en bonne quantité)\n" +
                "Pepperoni (tranché, réparti généreusement sur la pizza)\n" +
                "Herbes et épices (comme l'origan et le basilic, pour assaisonner)"));
        ps.create(new PizzaBeans(9, "Pizza Hawaïenne ", 55, R.drawable.hawaiin, "Description\n \n La pizza hawaïenne est une variante controversée qui combine des saveurs sucrées et salées. Elle est célèbre pour sa garniture de jambon et d'ananas, ce qui lui confère une touche tropicale. Le contraste entre le salé du jambon et le sucré de l'ananas crée une expérience gustative unique qui plaît à de nombreux amateurs de pizza. Bien que certains critiquent cette combinaison, elle reste un choix populaire dans de nombreuses pizzerias à travers le monde.", "Ingrédients\n \n" +
                "Les ingrédients d'une pizza hawaïenne typique comprennent :\n" +
                "\n" +
                "Pâte à pizza (faite avec de la farine, de l'eau, de la levure, de l'huile d'olive et du sel)\n" +
                "Sauce tomate (ou sauce marinara)\n" +
                "Fromage mozzarella (généralement en bonne quantité)\n" +
                "Jambon (en dés ou en tranches)\n" +
                "Ananas (frais ou en conserve, coupé en morceaux)\n" +
                "Herbes et épices (comme l'origan et le basilic, pour assaisonner)"));
        ps.create(new PizzaBeans(10, "Pizza Chicken", 54, R.drawable.chicken, "Description\n \n La pizza au poulet est une option savoureuse qui met en avant le poulet grillé ou rôti comme garniture principale. Elle est souvent associée à une variété d'autres ingrédients, comme des légumes, des fromages et des sauces, pour créer une combinaison délicieuse. Cette pizza est parfaite pour ceux qui aiment les plats riches en saveurs et qui souhaitent une alternative à la pizza classique à la viande. Les recettes varient, mais la pizza au poulet est généralement bien assaisonnée, offrant une expérience gastronomique réconfortante et satisfaisante.", "Ingrédients\n \n" +
                "Les ingrédients d'une pizza au poulet typique peuvent inclure :\n" +
                "\n" +
                "Pâte à pizza (faite avec de la farine, de l'eau, de la levure, de l'huile d'olive et du sel)\n" +
                "Sauce tomate ou sauce barbecue (selon les préférences)\n" +
                "Fromage mozzarella (ou un mélange de fromages)\n" +
                "Poulet grillé (coupé en morceaux ou en dés)\n" +
                "Oignons (émincés, pour ajouter de la saveur)\n" +
                "Poivrons (coupés en dés, pour une touche de couleur et de croquant)\n" +
                "Champignons (facultatif, pour plus de texture)\n" +
                "Herbes et épices (comme l'origan, le basilic ou le paprika)"));
        ps.create(new PizzaBeans(11, "Pizza Diavola", 49, R.drawable.diavola, "Description\n \n La pizza Diavola est un plat traditionnel italien, connue pour son goût épicé et sa garniture généreuse. Le mot \"Diavola\" signifie \"diable\" en italien, ce qui reflète la nature piquante de cette pizza. Elle est généralement garnie de sauce tomate, de mozzarella, de pepperoni ou de salami épicé, et souvent d'autres ingrédients qui ajoutent de la chaleur, comme des piments ou du poivre. La combinaison de saveurs audacieuses et d'une croûte croustillante en fait un choix populaire pour les amateurs de pizza qui aiment les sensations fortes.", "Ingrédients\n \n" +
                "Les ingrédients d'une pizza Diavola typique comprennent :\n" +
                "\n" +
                "Pâte à pizza (faite avec de la farine, de l'eau, de la levure, de l'huile d'olive et du sel)\n" +
                "Sauce tomate (ou sauce marinara)\n" +
                "Fromage mozzarella (généralement en bonne quantité)\n" +
                "Salami épicé ou pepperoni (en tranches)\n" +
                "Piments rouges ou poivre (pour un peu de chaleur)\n" +
                "Herbes et épices (comme l'origan et le basilic, pour assaisonner)"));





        list = findViewById(R.id.list);
        pizzaList = ps.findAll();
        adapter = new PizzaAdapter(pizzaList, this);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PizzaBeans pizza = (PizzaBeans) adapter.getItem(position);

                Intent intent = new Intent(MainActivity.this, PizzaDetailActivity.class);
                intent.putExtra("name", pizza.getNom());
                intent.putExtra("price", pizza.getPrix());
                intent.putExtra("image", pizza.getImage());
                intent.putExtra("description", pizza.getDescription());
                intent.putExtra("ingredients", pizza.getIngredients());
                startActivity(intent);
            }
        });
    }
}
