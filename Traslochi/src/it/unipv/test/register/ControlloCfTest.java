package it.unipv.test.register;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import it.unipv.java.model.RegisterData;
import it.unipv.java.util.responsabilitychain.handlers.ControlloCF;

public class ControlloCfTest {

    @Test
    public void testCfValido() {
        RegisterData dati = new RegisterData();
        // Un esempio di CF valido (fittizio)
        dati.setCfInserito("RSSMRA85M01H501Z");
        ControlloCF controllo = new ControlloCF();

        assertTrue(controllo.controllaParametro(dati), "Il CF dovrebbe essere considerato valido");
    }

    @Test
    public void testCfLunghezzaNonValida() {
        RegisterData dati = new RegisterData();
        // Un esempio di CF con lunghezza non valida
        dati.setCfInserito("RSSMRA85M01H50");
        ControlloCF controllo = new ControlloCF();

        assertFalse(controllo.controllaParametro(dati), "Il CF dovrebbe fallire per lunghezza non valida");
    }

    @Test
    public void testCfCaratteriNonValidi() {
        RegisterData dati = new RegisterData();
        // Un esempio di CF con caratteri non validi
        dati.setCfInserito("RSSMRA85M01H501?");
        ControlloCF controllo = new ControlloCF();

        assertFalse(controllo.controllaParametro(dati), "Il CF dovrebbe fallire per caratteri non validi");
    }

    @Test
    public void testCfFormatoNonValido() {
        RegisterData dati = new RegisterData();
        // Un esempio di CF con formato non valido
        dati.setCfInserito("85M01HRSSMRAH501");
        ControlloCF controllo = new ControlloCF();

        assertFalse(controllo.controllaParametro(dati), "Il CF dovrebbe fallire per formato non valido");
    }
}
