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

import android.widget.TextView;
import android.widget.Toast;

import com.example.projetolocalizao.R;

import com.example.projetolocalizao.model.ListLocalizacaoAdapter;
import com.example.projetolocalizao.model.Lugar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListLocalizacaoAdapter adapter;
    private RecyclerView lugarRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        lugarRecyclerView = findViewById(R.id.recyclerViewLugar);
        lugarRecyclerView.setLayoutManager(layoutManager);
        List<Lugar> lugar = new ArrayList<>();


        adapter = new ListLocalizacaoAdapter(lugar, this);
        lugarRecyclerView.setAdapter(adapter);


    }

    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), CadastroLugar.class);
        startActivity(intent);
    }
}
