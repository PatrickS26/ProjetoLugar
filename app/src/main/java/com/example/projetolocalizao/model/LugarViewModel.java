package com.example.projetolocalizao.model;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class LugarViewModel extends AndroidViewModel {

    private LugarRepository lugarRepository;
    private LiveData<List<Lugar>> lugarResponseLiveData;
    private LiveData<Boolean> salvoComSucessoLiveData;


    public LugarViewModel(@NonNull Application application) {
        super(application);
        Log.d("RESPOSTA","CRIACAO DA VIEWMODEL");
        lugarRepository = new LugarRepository();
        lugarResponseLiveData = lugarRepository.getAllLugares();
        salvoComSucessoLiveData = lugarRepository.getSalvoSucesso();
    }
    public void getLugares() {
        lugarRepository.getLugares();
    }
    public LiveData<List<Lugar>> getLugaresResponseLiveData() {
        return lugarResponseLiveData;
    }
    public LiveData<Boolean> getSalvoSucesso() {
        return salvoComSucessoLiveData;
    }
    public void salvarLugar(Lugar lugar){
        lugarRepository.salvarLugar(lugar);
    }


}
