package com.example.RestServer;

import com.example.RestServer.service.QuadratService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadratServiceTest {

    private final QuadratService quaService = new QuadratService();

    @Test
    void testDefaultState() {
        assertEquals(0, quaService.getQuadrat()); //Wert1: Was wir erwarten / Wert2: berechneter Wert
    }

    @Test
    void testquadratberechnung() {
        quaService.quadratberechnen(10);
        assertEquals(100, quaService.getQuadrat());
    }

    @Test
    void testMore() {
        quaService.quadratberechnen(0);
        assertEquals(0, quaService.getQuadrat());
    }

    @Test
    void testMinuswert() {
        quaService.quadratberechnen(-10);
        assertEquals(100, quaService.getQuadrat());//Test
    }

}