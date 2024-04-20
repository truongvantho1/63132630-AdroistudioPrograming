package com.example.baitaptuanhocsoonline;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<Landscape> recyclerviewData;
    RecyclerView recyclerViewLandScape;


    @Override
    protected void onCreate(Bundle savedInstancegState) {
        super.onCreate(savedInstancegState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerviewData = getRecyclerviewData();
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutManager);
        landScapeAdapter = new LandScapeAdapter( this, recyclerviewData);

        

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    ArrayList<Landscape> getRecyclerviewData(){
        ArrayList dsDuLieu = new ArrayList<Landscape>();
        Landscape landscape1 = new Landscape("My", "LaCoMy");
        dsDuLieu.add(landscape1);
        dsDuLieu.add(new Landscape("Anh","LaCoAnh"));
        dsDuLieu.add(new Landscape("CoVietNam","LaCoVietNam"));
        return dsDuLieu;

    }
}