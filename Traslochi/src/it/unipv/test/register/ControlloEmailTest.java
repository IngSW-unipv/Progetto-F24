package it.unipv.test.register;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import it.unipv.java.model.RegisterData;
import it.unipv.java.util.responsabilitychain.handlers.ControlloEmail;

public class ControlloEmailTest {

    @Test
    public void testEmailValida() {
        RegisterData dati = new RegisterData();
        dati.setEmailInserita("test@example.com");
        ControlloEmail controllo = new ControlloEmail();

        assertTrue(controllo.controllaParametro(dati));
    }

    @Test
    public void testEmailNonValida() {
        RegisterData dati = new RegisterData();
        dati.setEmailInserita("testexample.com");
        ControlloEmail controllo = new ControlloEmail();

        assertFalse(controllo.controllaParametro(dati));
    }
}
