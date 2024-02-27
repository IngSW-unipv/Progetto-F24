package it.unipv.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import it.unipv.java.controller.LoginController;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.DipendentView;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.WarningView;

import java.awt.event.ActionEvent;

class LoginControllerTest {
/*
    @Test
    void testLoginSuccessCliente() {
        // Simuliamo una login view
        LoginView loginView = new LoginView();
        ClienteView cv = new ClienteView();
        DipendentView dv= new DipendentView();
        ResponsabileView rv= new ResponsabileView();
        // Simuliamo un login controller
        LoginController loginController = new LoginController(loginView);
        
        // Simuliamo un login di successo per un cliente
        //Da METTERE DELLE VARIABILI UTILIZZABILI
        loginView.setEmail("cliente@example.com");
        loginView.setPassword("password123");
        
        // Simuliamo un'azione sul pulsante di login
        ActionEvent actionEvent = new ActionEvent(loginView.getLoginButton(), ActionEvent.ACTION_PERFORMED, "");
        loginController.getLoginButtonActionListener().actionPerformed(actionEvent);
        
        // Verifichiamo che la vista del cliente sia stata visualizzata
        assertTrue(cv.isVisible());
        assertFalse(dv.isVisible());
        assertFalse(rv.isVisible());
    }

    @Test
    void testLoginSuccessDipendente() {
        // Simuliamo una login view
        LoginView loginView = new LoginView();
        ClienteView cv = new ClienteView();
        DipendentView dv= new DipendentView();
        ResponsabileView rv= new ResponsabileView();
        // Simuliamo un login controller
        LoginController loginController = new LoginController(loginView);
        
        // Simuliamo un login di successo per un dipendente
        loginView.setEmail("dipendente@example.com");
        loginView.setPassword("password123");
        
        // Simuliamo un'azione sul pulsante di login
        ActionEvent actionEvent = new ActionEvent(loginView.getLoginButton(), ActionEvent.ACTION_PERFORMED, "");
        loginController.getLoginButtonActionListener().actionPerformed(actionEvent);
        
        // Verifichiamo che la vista del dipendente sia stata visualizzata
        assertFalse(cv.isVisible());
        assertTrue(dv.isVisible());
        assertFalse(rv.isVisible());
    }

    @Test
    void testLoginSuccessResponsabile() {
        // Simuliamo una login view
        LoginView loginView = new LoginView();
        ClienteView cv = new ClienteView();
        DipendentView dv= new DipendentView();
        ResponsabileView rv= new ResponsabileView();
        // Simuliamo un login controller
        LoginController loginController = new LoginController(loginView);
        
        // Simuliamo un login di successo per un responsabile
        loginView.setEmail("responsabile@example.com");
        loginView.setPassword("password123");
        
        // Simuliamo un'azione sul pulsante di login
        ActionEvent actionEvent = new ActionEvent(loginView.getLoginButton(), ActionEvent.ACTION_PERFORMED, "");
        loginController.getLoginButtonActionListener().actionPerformed(actionEvent);
        
        // Verifichiamo che la vista del responsabile sia stata visualizzata
        assertFalse(cv.isVisible());
        assertFalse(dv.isVisible());
        assertTrue(rv.isVisible());
    }

    @Test
    void testLoginFailure() {
        // Simuliamo una login view
        LoginView loginView = new LoginView();
        WarningView wv= new WarningView();
        
        // Simuliamo un login controller
        LoginController loginController = new LoginController(loginView);
        
        // Simuliamo un login fallito
        loginView.setEmail("utente@example.com");
        loginView.setPassword("passworderrata");
        
        // Simuliamo un'azione sul pulsante di login
        ActionEvent actionEvent = new ActionEvent(loginView.getLoginButton(), ActionEvent.ACTION_PERFORMED, "");
        loginController.getLoginButtonActionListener().actionPerformed(actionEvent);
        
        // Verifichiamo che la finestra di avviso sia stata visualizzata
        assertTrue(wv.isVisible());
    }
*/
}