package com.example.RestServer.dto;

public class Quadrat {
    private long ergebnis = 2;

    public long getErgebnis() {return ergebnis;
    }

    public void quadratberechnen(long zahl) {ergebnis = zahl*zahl;}

}
