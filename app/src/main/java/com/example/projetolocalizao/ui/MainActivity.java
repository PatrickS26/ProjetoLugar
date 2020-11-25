package com.example.projetolocalizao.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projetolocalizao.R;
import com.example.projetolocalizao.model.Lugar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View lugarRecyclerView = findViewById(R.id.list_item);
        ArrayList<Lugar> lugar = new ArrayList<>();


        Adapter adapter = new Adapter(lugar, this);
        lugarRecyclerView.setAdapter(adapter);


        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        RecyclerView myItems = findViewById(R.id.list_item);
        myItems.setLayoutManager(layoutManager);


    }

    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), CadastroLugar.class);
        startActivity(intent);
    }
}
