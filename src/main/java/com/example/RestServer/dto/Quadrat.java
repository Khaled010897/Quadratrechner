package com.example.RestServer.dto;

public class Quadrat {
    private long ergebnis = 0;

    public long getErgebns() {return ergebnis;
    }

    public void quadratberechnen(long zahl) {ergebnis = zahl*zahl;}

}
