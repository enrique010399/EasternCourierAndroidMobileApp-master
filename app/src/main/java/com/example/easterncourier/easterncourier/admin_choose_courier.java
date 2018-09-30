package com.example.easterncourier.easterncourier;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class admin_choose_courier extends AppCompatActivity implements Adapter_admin_choose_courier.OnItemClickListener {


    ArrayList<adminChooseCourierItem> list ;
    DatabaseReference reference;
    RecyclerView recyclerView;

    Adapter_admin_choose_courier adapter_admin_choose_courier;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_choose_courier);

        recyclerView=(RecyclerView) findViewById(R.id.rv_chooseCourier);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<adminChooseCourierItem>();

        reference= FirebaseDatabase.getInstance().getReference().child("Courier Accounts");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                    adminChooseCourierItem adminChooseCourierItem1= dataSnapshot1.getValue(adminChooseCourierItem.class);
                    list.add(adminChooseCourierItem1);

                }

                adapter_admin_choose_courier=new Adapter_admin_choose_courier(admin_choose_courier.this,list);
                recyclerView.setAdapter(adapter_admin_choose_courier);
                adapter_admin_choose_courier.setOnItemClickListener(admin_choose_courier.this);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }

    @Override
    public void onItemClick(int position) {
        Intent intent=new Intent(admin_choose_courier.this,admin_requests.class);
        Toast.makeText(admin_choose_courier.this,"Courier Successfully Assigned", Toast.LENGTH_LONG).show();

        adminChooseCourierItem adminChooseCourierItem1=list.get(position);

        startActivity(intent);

    }
}
