package com.sosa.leslindesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BucketAdapter extends RecyclerView.Adapter<BucketAdapter.ViewHolder> {

    Context context;
    List<BucketModel> list;

    public BucketAdapter(Context context, List<BucketModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_bucket,parent,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        BucketModel model=list.get(position);

        holder.layout_background.setBackgroundResource(model.getBackground());
        holder.tv_name.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        ConstraintLayout layout_background;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name=itemView.findViewById(R.id.tv_bucket);
            layout_background=itemView.findViewById(R.id.layout_bucket);
        }
    }
}

