package com.example.recyclerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<Contact> contacts=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler);
        ContactAdapter Adapter= new ContactAdapter(contacts);
        recyclerView.setAdapter(Adapter);
        Contact contact=new Contact("Harun Or Rashid","01783098708",R.drawable.ic_man);
        contacts.add(contact);
       contact=new Contact ("Harun Or Rashid","01783098708",R.drawable.ic_man);
        contacts.add(contact);
        contact=new Contact("Harun Or Rashid","01783098708",R.drawable.ic_man);
        contacts.add(contact);
        contact=new Contact("Harun Or Rashid","01783098708",R.drawable.ic_man);
        contacts.add(contact);
    }
}
