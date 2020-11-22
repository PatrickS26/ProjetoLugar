package com.example.projetolocalizao.model;

public class Lugar {
    private String DataCadastro;
    private String Descricao;
    private double Lat;
    private double Long;

    public String getDataCadastro() {

        return DataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {

        DataCadastro = dataCadastro;
    }

    public String getDescricao() {

        return Descricao;
    }

    public void setDescricao(String descricao) {

        Descricao = descricao;
    }


    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLong() {
        return Long;
    }

    public void setLong(double aLong) {
        Long = aLong;
    }
}
