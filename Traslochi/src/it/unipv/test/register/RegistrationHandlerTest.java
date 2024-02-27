package it.unipv.test.register;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import it.unipv.java.model.RegisterData;
import it.unipv.java.util.responsabilitychain.RegistrationHandler;
import it.unipv.java.util.responsabilitychain.handlers.IControllo;

import java.util.Arrays;

class RegistrationHandlerTest {

    private RegistrationHandler handler;
    private RegisterData datiInseriti;

    @BeforeEach
    void setUp() {
        datiInseriti = new RegisterData(); 
        handler = new RegistrationHandler(datiInseriti);
     }

    @Test
    void executeChainControllo_AllPass() {
        // Implementazione di stub che simula il comportamento di componenti software esterni
        IControllo controlloStubPass = new IControllo() {
            @Override
            public boolean controllaParametro(RegisterData dati) {
                return true;  
            }
        };

         handler.buildChain();  
         handler.getCatenaControlli().clear();
        handler.getCatenaControlli().addAll(Arrays.asList(controlloStubPass, controlloStubPass, controlloStubPass));

        assertTrue(handler.executeChainControllo(), "Dovrebbe ritornare true se tutti i controlli passano");
    }

    @Test
    void executeChainControllo_FailOnFirst() {
         IControllo controlloStubFail = new IControllo() {
            @Override
            public boolean controllaParametro(RegisterData dati) {
                return false;  
            }
        };

         handler.buildChain();  
         handler.getCatenaControlli().clear();
        handler.getCatenaControlli().add(controlloStubFail);

        assertFalse(handler.executeChainControllo(), "Dovrebbe ritornare false se un controllo fallisce");
    }
    
  
}
