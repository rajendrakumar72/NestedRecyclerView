package com.example.nestedrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ParentRecyclerViewAdapter extends RecyclerView.Adapter<ParentRecyclerViewAdapter.ViewHolder> {
        private ArrayList<ParentModel> parentModelArrayList;
        Context cxt;

    public ParentRecyclerViewAdapter(ArrayList<ParentModel> parentModelArrayList, Context cxt) {
        this.parentModelArrayList = parentModelArrayList;
        this.cxt = cxt;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recyclerview_items,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ParentModel currentModel=parentModelArrayList.get(position);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(cxt,LinearLayoutManager.HORIZONTAL,false);

        holder.childRecyclerView.setLayoutManager(layoutManager);
        holder.childRecyclerView.setHasFixedSize(true);

        holder.txtCategory.setText(currentModel.getMovieCategory());
        ArrayList<ChildModel> arrayList=new ArrayList<>();

        //added in the first child row
        if (parentModelArrayList.get(position).getMovieCategory().equals("Category 1")){
            arrayList.add(new ChildModel(R.drawable.bliss,"Bliss"));
            arrayList.add(new ChildModel(R.drawable.borat_2,"Borat 2"));
            arrayList.add(new ChildModel(R.drawable.coming_2_america,"Coming 2 America"));
            arrayList.add(new ChildModel(R.drawable.godzilla_vs_kong,"Godzilla Vs Kong"));
            arrayList.add(new ChildModel(R.drawable.mortal_kombat,"Mortal Kombat"));
            arrayList.add(new ChildModel(R.drawable.teneposterfinal7_thumb,"Tenet"));
        }
        //added second child row
        if (parentModelArrayList.get(position).getMovieCategory().equals("Category 2")){
            arrayList.add(new ChildModel(R.drawable.hitmans_wifes_bodyguard_poster_thumb,"Hitman's Wifes Bodygaurd"));
            arrayList.add(new ChildModel(R.drawable.judas_and_othe_black_messiah,"Judas And Othe Black Messiah"));
            arrayList.add(new ChildModel(R.drawable.justice_league,"Justice League"));
            arrayList.add(new ChildModel(R.drawable.notimetodie,"No Time To Die"));
            arrayList.add(new ChildModel(R.drawable.vanquish_poster_thumb,"Vanquish"));
            arrayList.add(new ChildModel(R.drawable.oxygen_poster_thumb,"Oxygen"));
        }

        if (parentModelArrayList.get(position).getMovieCategory().equals("Category 3")){
            arrayList.add(new ChildModel(R.drawable.bright_burn,"Bright Burn"));
            arrayList.add(new ChildModel(R.drawable.doctor_sleep,"Doctor Sleep"));
            arrayList.add(new ChildModel(R.drawable.dream_horse,"Dream Horse"));
            arrayList.add(new ChildModel(R.drawable.you_should_have_left,"You Should Have Left"));
            arrayList.add(new ChildModel(R.drawable.sputnik,"Sputnik"));
            arrayList.add(new ChildModel(R.drawable.the_water_man,"The Water Man"));
        }

        if (parentModelArrayList.get(position).getMovieCategory().equals("Category 4")){
            arrayList.add(new ChildModel(R.drawable.soul,"Soul"));
            arrayList.add(new ChildModel(R.drawable.jojo_rabbit,"Jojo Rabbit"));
            arrayList.add(new ChildModel(R.drawable.jumanji,"Jumanji"));
            arrayList.add(new ChildModel(R.drawable.star_wars_rise_of_skwalker,"StarWars Rise Of SkyWalker"));
            arrayList.add(new ChildModel(R.drawable.greenknight,"Green Knight"));
            arrayList.add(new ChildModel(R.drawable.peter_rabbit_2_thumb,"Peter Rabbit 2"));
        }

        if (parentModelArrayList.get(position).getMovieCategory().equals("Category 5")){
            arrayList.add(new ChildModel(R.drawable.mortal_kombat,"Mortal Kombat"));
            arrayList.add(new ChildModel(R.drawable.judas_and_othe_black_messiah,"Judas And Othe Black Messiah"));
            arrayList.add(new ChildModel(R.drawable.justice_league,"Justice League"));
            arrayList.add(new ChildModel(R.drawable.notimetodie,"No Time To Die"));
            arrayList.add(new ChildModel(R.drawable.vanquish_poster_thumb,"Vanquish"));
            arrayList.add(new ChildModel(R.drawable.oxygen_poster_thumb,"Oxygen"));
        }

        if (parentModelArrayList.get(position).getMovieCategory().equals("Category 6")){
            arrayList.add(new ChildModel(R.drawable.bright_burn,"Bright Burn"));
            arrayList.add(new ChildModel(R.drawable.doctor_sleep,"Doctor Sleep"));
            arrayList.add(new ChildModel(R.drawable.dream_horse,"Dream Horse"));
            arrayList.add(new ChildModel(R.drawable.you_should_have_left,"You Should Have Left"));
            arrayList.add(new ChildModel(R.drawable.sputnik,"Sputnik"));
            arrayList.add(new ChildModel(R.drawable.the_water_man,"The Water Man"));
        }

        ChildRecyclerViewAdapter childRecyclerViewAdapter=new ChildRecyclerViewAdapter(arrayList,holder.childRecyclerView.getContext());
        holder.childRecyclerView.setAdapter(childRecyclerViewAdapter);
    }

    @Override
    public int getItemCount() {
        return parentModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtCategory;
        RecyclerView childRecyclerView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtCategory=itemView.findViewById(R.id.movieCategory);
            childRecyclerView=itemView.findViewById(R.id.child_RV);
        }
    }
}
