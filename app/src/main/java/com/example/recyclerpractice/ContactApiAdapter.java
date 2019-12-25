package com.example.recyclerpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactApiAdapter extends RecyclerView.Adapter<ContactApiAdapter.ViewHolder> {
    private List<ContactPojo> contactPojos;

    public ContactApiAdapter(List<ContactPojo> contactPojos) {
        this.contactPojos = contactPojos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view =layoutInflater.inflate(R.layout.contact_list,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//            ContactPojo contactPojo=contactPojos.get(position);
            TextView name=holder.aName;
            TextView phone=holder.aPhone;
           // name.setText(contactPojo.getName());
            phone.setText(position);
            phone.setText(position);
    }

    @Override
    public int getItemCount() {
        return contactPojos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView aName;
        TextView aPhone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            aName=(TextView) itemView.findViewById(R.id.name);
            aPhone=(TextView) itemView.findViewById(R.id.phone);

        }
    }
}
