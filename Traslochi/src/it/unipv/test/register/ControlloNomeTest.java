package it.unipv.test.register;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import it.unipv.java.model.RegisterData;
import it.unipv.java.util.responsabilitychain.handlers.ControlloNome;

public class ControlloNomeTest {

    @Test
    public void testNomeValido() {
        RegisterData dati = new RegisterData();
        // Un esempio di nome valido
        dati.setNomeInserito("Mario");
        ControlloNome controllo = new ControlloNome();

        assertTrue(controllo.controllaParametro(dati), "Il nome dovrebbe essere considerato valido");
    }

    @Test
    public void testNomeVuoto() {
        RegisterData dati = new RegisterData();
        // Un esempio di nome vuoto
        dati.setNomeInserito("");
        ControlloNome controllo = new ControlloNome();

        assertFalse(controllo.controllaParametro(dati), "Il nome dovrebbe fallire per essere vuoto");
    }

    @Test
    public void testNomeConNumeri() {
        RegisterData dati = new RegisterData();
        // Un esempio di nome con numeri
        dati.setNomeInserito("Mario2");
        ControlloNome controllo = new ControlloNome();

        assertFalse(controllo.controllaParametro(dati), "Il nome dovrebbe fallire per la presenza di numeri");
    }

    @Test
    public void testNomeConSimboli() {
        RegisterData dati = new RegisterData();
        // Un esempio di nome con simboli
        dati.setNomeInserito("Mario!");
        ControlloNome controllo = new ControlloNome();

        assertFalse(controllo.controllaParametro(dati), "Il nome dovrebbe fallire per la presenza di simboli");
    }

    @Test
    public void testNomeLunghezzaMinima() {
        RegisterData dati = new RegisterData();
        // Un esempio di nome con lunghezza inferiore al minimo (se applicabile)
        dati.setNomeInserito("Ma");
        ControlloNome controllo = new ControlloNome();

        assertFalse(controllo.controllaParametro(dati), "Il nome dovrebbe fallire se non rispetta la lunghezza minima");
    }
}

