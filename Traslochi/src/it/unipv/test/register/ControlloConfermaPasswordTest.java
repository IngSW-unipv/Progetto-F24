package it.unipv.test.register;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import it.unipv.java.model.RegisterData;
import it.unipv.java.util.responsabilitychain.handlers.ControlloConfermaPassword;

public class ControlloConfermaPasswordTest {

    @Test
    public void testConfermaPasswordValida() {
        RegisterData dati = new RegisterData();
        dati.setPasswordInserita("Password123");
        dati.setConfermaPasswordInserita("Password123");
        ControlloConfermaPassword controllo = new ControlloConfermaPassword();

        assertTrue(controllo.controllaParametro(dati));
    }

    @Test
    public void testConfermaPasswordNonValida() {
        RegisterData dati = new RegisterData();
        dati.setPasswordInserita("Password123");
        dati.setConfermaPasswordInserita("Password321");
        ControlloConfermaPassword controllo = new ControlloConfermaPassword();

        assertFalse(controllo.controllaParametro(dati));
    }
}
