package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recyler_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Yuda Hendriawan","06111640000010","085235244417"));
        mahasiswaArrayList.add(new Mahasiswa("M Ilham D F","06111640000003","08523524XXXXX"));
        mahasiswaArrayList.add(new Mahasiswa("Shafira Herlinawati","06111640000013","085235xxxxxxx"));
        mahasiswaArrayList.add(new Mahasiswa("Adillatul Lathiifatun Jannah","03111640000055","089624701355"));

    }
}
