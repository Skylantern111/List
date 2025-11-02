
package com.example.list;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.android.car.ui.toolbar.MenuItem;
import com.example.list.R;
import com.example.list.MenuItem;
import java.util.List;


public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuItemViewHolder> {

    private final List<MenuItem> menuItems;
    private final OnQuantityChangeListener listener;

    public interface OnQuantityChangeListener{
        void onQuantityChanged(MenuItem item, int newQuantity);
    }

    public MenuAdapter(List<MenuItem> menuItems, OnQuantityChangeListener listener){
        this.menuItems = menuItems;
        this.listener = listener;
    }

    public class MenuItemViewHolder extends RecyclerView.ViewHolder{
        public TextView itemName;
        public TextView itemRating;
        public ImageView itemImage;
        public TextView tvQuantity;
        public ImageButton btnPlus;
        public ImageButton btnMinus;

        public MenuItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.item_name);
            itemRating = itemView.findViewById(R.id.item_rating);
            itemImage = itemView.findViewById(R.id.item_image);
            tvQuantity = itemView.findViewById(R.id.tv_quantity);
            btnPlus = itemView.findViewById(R.id.btn_plus);
            btnMinus = itemView.findViewById(R.id.btn_minus);

            btnPlus.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    MenuItem item = menuItems.get(position);
                    item.setQuantity(item.getQuantity() + 1);
                    tvQuantity.setText(String.valueOf(item.getQuantity()));
                    listener.onQuantityChanged(item, item.getQuantity());
                }
            });

            btnMinus.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    MenuItem item = menuItems.get(position);
                    if (item.getQuantity() > 0) {
                        item.setQuantity(item.getQuantity() - 1);
                        tvQuantity.setText(String.valueOf(item.getQuantity()));
                        listener.onQuantityChanged(item, item.getQuantity());
                    }
                }
            });
        }
    }

    @NonNull
    @Override
    public MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_menu_food, parent, false);
        return new MenuItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemViewHolder holder, int position) {
        MenuItem item = menuItems.get(position);

        holder.itemName.setText(item.getName());
        holder.itemRating.setText(String.valueOf(item.getRating()));
        holder.tvQuantity.setText(String.valueOf(item.getQuantity()));
        holder.itemImage.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }
}