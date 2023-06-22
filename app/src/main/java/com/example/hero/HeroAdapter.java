package com.example.hero;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    public final List<Hero> heroes;

    public HeroAdapter(Context context, List<Hero> heroes){
        this.inflater = LayoutInflater.from(context);
        this.heroes = heroes;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hero hero = heroes.get(position);
        holder.heroView.setImageResource(hero.getHeroResource());
        holder.nameView.setText(hero.getName());
        holder.heroDescriptionView.setText(hero.getHeroDescription());
        holder.hartView.setText(hero.getHart());

    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView heroView;
        final TextView nameView, heroDescriptionView, hartView;

        ViewHolder(View view){
            super(view);
            heroView = view.findViewById(R.id.heroResource);
            nameView = view.findViewById(R.id.name);
            heroDescriptionView = view.findViewById(R.id.heroDescription);
            hartView = view.findViewById(R.id.hart);
        }

    }
}
