package it.unipv.test.register;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import it.unipv.java.model.RegisterData;
import it.unipv.java.util.responsabilitychain.handlers.ControlloPassword;

public class ControlloPasswordTest {

    @Test
    public void testPasswordValida() {
        RegisterData dati = new RegisterData();
        // Assumendo che una password valida debba avere almeno 8 caratteri, una lettera maiuscola, un numero e un simbolo
        dati.setPasswordInserita("Valida1!");
        ControlloPassword controllo = new ControlloPassword();

        assertTrue(controllo.controllaParametro(dati), "La password dovrebbe essere considerata valida");
    }

    @Test
    public void testPasswordTroppoCorta() {
        RegisterData dati = new RegisterData();
        // Assumendo che la lunghezza minima sia 8 caratteri
        dati.setPasswordInserita("V1!");
        ControlloPassword controllo = new ControlloPassword();

        assertFalse(controllo.controllaParametro(dati), "La password dovrebbe essere considerata troppo corta");
    }

    @Test
    public void testPasswordMancanzaNumero() {
        RegisterData dati = new RegisterData();
        // Assumendo che la password debba contenere almeno un numero
        dati.setPasswordInserita("Valida!");
        ControlloPassword controllo = new ControlloPassword();

        assertFalse(controllo.controllaParametro(dati), "La password dovrebbe fallire per mancanza di numeri");
    }

    @Test
    public void testPasswordMancanzaMaiuscola() {
        RegisterData dati = new RegisterData();
        // Assumendo che la password debba contenere almeno una lettera maiuscola
        dati.setPasswordInserita("valida1!");
        ControlloPassword controllo = new ControlloPassword();

        assertFalse(controllo.controllaParametro(dati), "La password dovrebbe fallire per mancanza di lettere maiuscole");
    }

    @Test
    public void testPasswordMancanzaSimbolo() {
        RegisterData dati = new RegisterData();
        // Assumendo che la password debba contenere almeno un simbolo
        dati.setPasswordInserita("Valida1");
        ControlloPassword controllo = new ControlloPassword();

        assertFalse(controllo.controllaParametro(dati), "La password dovrebbe fallire per mancanza di simboli");
    }
}
