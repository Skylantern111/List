package com.example.list;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
//import android.widget.Toast;
import androidx.activity.EdgeToEdge;
//import com.example.list.MenuAdapter;
//import com.example.list.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MenuAdapter.OnQuantityChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.menu_recycler_view);

        List<MenuItem> menuList = getDummyData();

        MenuAdapter adapter = new MenuAdapter(menuList, this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onQuantityChanged(MenuItem item, int newQuantity) {
        //Toast.makeText(this, item.getName() + " quantity is now: " + newQuantity, Toast.LENGTH_SHORT).show();
    }


    private List<MenuItem> getDummyData() {
        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(1, "Vegitable Salad", 4.7f, 2, 12.99, R.drawable.image_salad));
        list.add(new MenuItem(2, "Cake Combo", 4.5f, 1, 8.50, R.drawable.image_cake_combo));
        list.add(new MenuItem(3, "Chicken Keto Salad", 3.9f, 0, 15.75, R.drawable.image_salad_keto));
        list.add(new MenuItem(4, "Porota", 4.1f, 0, 3.99, R.drawable.image_porota));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));
        list.add(new MenuItem(5, "Chicken Sandwich", 4.2f, 0, 6.25, R.drawable.image_sandwich_chicken));



        return list;
    }

    
}