package com.example.outfitmakerfake.Entity;

import java.util.ArrayList;
import java.util.List;

public class Armadio {

    private String idArmadio;
    private List<Capo> listaCapi;

    public Armadio(String idArmadio, List<Capo> listaCapi) {
        this.idArmadio = idArmadio;
        this.listaCapi = listaCapi;
    }


    public void aggiungiCapo(Capo capo){
        if(listaCapi.isEmpty()){
            listaCapi=new ArrayList<>();
        }
        listaCapi.add(capo);
    }
    public void setListaCapi(List<Capo> listaCapi) {
        this.listaCapi = listaCapi;
    }

    public String getIdArmadio() {
        return idArmadio;
    }

    public void setIdArmadio(String idArmadio) {
        this.idArmadio = idArmadio;
    }

    public List<Capo> getListaCapi() {
        return listaCapi;
    }
}
