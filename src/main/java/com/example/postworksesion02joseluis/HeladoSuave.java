package com.example.postworksesion02joseluis;

public class HeladoSuave implements Helado {

    @Override
    public String getDescription() {
        return "Helado Suave";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}