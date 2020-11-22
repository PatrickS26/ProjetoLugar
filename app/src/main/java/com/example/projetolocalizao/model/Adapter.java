package com.example.projetolocalizao.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetolocalizao.R;

import java.util.List;

class Adapter extends RecyclerView.Adapter <ViewHolder>{

    private List<Lugar> lugar;
    private Context context;

    Adapter (List<Lugar>lugar, Context context){
        this.lugar = lugar;
        this.context = context;
    }

    

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
        LayoutInflater inflater = LayoutInflater.from(context); View v =
                inflater.inflate(R.layout.list_item, parent, false); return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Lugar l = lugar.get(position);

        holder.dataNomeTextView.setText(context.getString(R.string.data_nome,
                l.getNomeLugar(),DateHelper.format(l.getDataCadastro())) );
    }
    @Override
    public int getItemCount() {
        return lugar.size();
    }
}