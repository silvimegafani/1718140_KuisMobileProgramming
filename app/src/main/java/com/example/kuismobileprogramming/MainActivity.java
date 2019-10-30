package com.example.kuismobileprogramming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.papa),"Anas Makrub", "Papa"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.mamam),"Sumini", "Mama"));
        keluargaArrayList.add(new Keluarga(getDrawable (R.drawable.kakak),"Ludia Septiana", "Kakak"));
        keluargaArrayList.add(new Keluarga(getDrawable (R.drawable.iparr),"Muhammad Nur Salim", "Kakak Ipar"));
        keluargaArrayList.add(new Keluarga(getDrawable (R.drawable.saya),"Silvi Dwi Megafani", "Anak"));
        keluargaArrayList.add(new Keluarga(getDrawable (R.drawable.keponakan),"Almeera Sabrina Salma", "Keponakan"));
    }
}
