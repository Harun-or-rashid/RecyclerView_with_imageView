package com.example.recyclerpractice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private List<Contact> contacts ;

    public ContactAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView cName;
        TextView cPhone;
        ImageView cImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cImage=(ImageView) itemView.findViewById(R.id.img);
            cName=(TextView)itemView.findViewById(R.id.name);
            cPhone=(TextView)itemView.findViewById(R.id.phone);
        }
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.contact_list,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {
            Contact contact=contacts.get(position);
           TextView name=holder.cName;
           name.setText(contact.getName());
          holder.cPhone.setText(contact.getPhone());
          holder.cImage.setImageResource(contact.getImage());


    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }


}
