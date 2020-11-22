package com.example.projetolocalizao.model;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.projetolocalizao.R;

class ViewHolder extends RecyclerView.ViewHolder{

    TextView dataNomeTextView;
    TextView lugarTextView;

    ViewHolder(View v){
        super (v);
        this.dataNomeTextView =
                v.findViewById(R.id.dataNomeTextView);
        this.lugarTextView =
                v.findViewById(R.id.lugarTextView);
    }
}
