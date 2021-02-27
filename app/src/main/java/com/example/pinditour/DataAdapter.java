package com.example.pinditour;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.makeramen.roundedimageview.RoundedImageView;

public class DataAdapter extends FirebaseRecyclerAdapter<Data,DataAdapter.Myviewholder>{
    public DataAdapter(@NonNull FirebaseRecyclerOptions<Data> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull Myviewholder holder, int position, @NonNull Data model) {
        holder.name.setText(model.getName());
        holder.description.setText(model.getDescription());
        Glide.with(holder.img.getContext()).load(model.getImage()).into(holder.img);
        holder.wrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextscreen = new Intent(v.getContext(),Details.class);
                nextscreen.putExtra("location",model.getLocation());
                nextscreen.putExtra("name",model.getName());
                nextscreen.putExtra("description",model.getDescription());
                nextscreen.putExtra("image",model.getImage());
                nextscreen.putExtra("image1",model.getImg1());
                nextscreen.putExtra("image2",model.getImg2());
                nextscreen.putExtra("timing",model.getTiming());
                nextscreen.putExtra("rating",model.getRatings());
                nextscreen.putExtra("detail",model.getDetail());
                v.getContext().startActivity(nextscreen);
            }
        });
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false);
        return new Myviewholder(view);
    }

    class Myviewholder extends RecyclerView.ViewHolder{
        CardView wrapper;
        RoundedImageView img;
        TextView name,description;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            wrapper=itemView.findViewById(R.id.wrapper);
            img=itemView.findViewById(R.id.img);
            name=itemView.findViewById(R.id.name);
            description=itemView.findViewById(R.id.description);
        }
    }

}
