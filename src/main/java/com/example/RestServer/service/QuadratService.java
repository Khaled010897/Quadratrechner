package com.example.RestServer.service;

import com.example.RestServer.dto.Quadrat;
import org.springframework.stereotype.Service;

@Service
public class QuadratService {
    private final Quadrat quadrat = new Quadrat();

    public void quadratberechnen(long zahl) { quadrat.quadratberechnen(zahl);
    }

    public Long getQuadrat() { return quadrat.getErgebnis();
    }
}