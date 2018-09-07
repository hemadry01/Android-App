package com.example.hemadry.food;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class FoodAdepter extends RecyclerView.Adapter<FoodAdepter.FoodViewHolder> {

    private Context context;
    private List<Detail>details;

    public FoodAdepter(Context context, List<Detail> details) {
        this.context = context;
        this.details = details;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.food_item,parent,false);
        FoodViewHolder holder = new FoodViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, final int position) {

        holder.imageIV.setImageResource(details.get(position).getImage());
        holder.nameTV.setText(details.get(position).getName());
        holder.detailTV.setText(details.get(position).getDetail());
        //holder.priceTV.setText(String.valueOf(details.get(position).getPrice()));
        holder.priceTV.setText(String.valueOf(details.get(position).getPrice()));

        holder.cardVW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,ItemActivity.class);

                intent.putExtra("Image",details.get(position).getImage());
                intent.putExtra("Title",details.get(position).getName());
                intent.putExtra("Description",details.get(position).getDetail());
                intent.putExtra("Price",details.get(position).getPrice());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return details.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        ImageView imageIV;
        TextView nameTV,detailTV,priceTV;
        LinearLayout cardVW;
        public FoodViewHolder(View itemView) {
            super(itemView);

            imageIV = itemView.findViewById(R.id.imageView);
            nameTV = itemView.findViewById(R.id.titleT);
            detailTV = itemView.findViewById(R.id.detail);
            priceTV = itemView.findViewById(R.id.price);
            cardVW = itemView.findViewById(R.id.cardView);
        }
    }
}
