package com.example.nestedrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChildRecyclerViewAdapter extends RecyclerView.Adapter<ChildRecyclerViewAdapter.ViewHolder> {
    private ArrayList<ChildModel> childModelArrayList;
    Context cxt;

    public ChildRecyclerViewAdapter(ArrayList<ChildModel> childModelArrayList, Context cxt) {
        this.childModelArrayList = childModelArrayList;
        this.cxt = cxt;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.child_recyclerview_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ChildModel childModel=childModelArrayList.get(position);
        holder.txtMovieName.setText(childModel.getMovieName());
        holder.ivPoster.setImageResource(childModel.getHeroImage());
    }

    @Override
    public int getItemCount() {
        return childModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtMovieName;
        ImageView ivPoster;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMovieName=itemView.findViewById(R.id.movie_name);
            ivPoster=itemView.findViewById(R.id.heroImages);
        }
    }
}
