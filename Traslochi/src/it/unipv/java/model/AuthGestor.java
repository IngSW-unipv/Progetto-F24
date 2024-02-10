package it.unipv.java.model;

import it.unipv.java.persistance.dao.cliente.ClienteDao;
import it.unipv.java.persistance.dao.dipendente.DipendenteDao;
import it.unipv.java.persistance.dao.responsabile.ResponsabileDao;

public class AuthGestor {
    //SI OCCUPERA DI GESTIRE SE I DATI INSERITI e tramite il dominio dell'email verifica il tipo di user SONO DI UN DIPENDENTE,RESPONSABILE O CLIENTE
    RegisterModel rm;
    String id; //questo id puo essere idCliente,idResponsabile,idDipendente

    public AuthGestor() {
        // Costruttore vuoto
    }
    
    
    public static boolean registerUser(UserModel um) {
        // Estrae il dominio dall'email
        String dominio = um.getEmail().substring(um.getEmail().indexOf("@") + 1);

        // Determina il UserType in base al dominio dell'email
        if ("bidons.it".equals(dominio)) {
            um.isDipendente();
        } else if ("bidonsResp.it".equals(dominio)) {
            um.isResponsabile();
        } else {
        	 um.isCliente();	 
        }
 
          if (um.getUserType() == UserType.DIPENDENTE) {
        	  DipendenteDao d=new DipendenteDao();
        	  d.createDipendente(um);
          } else if (um.getUserType() == UserType.RESPONSABILE) {
        	  ResponsabileDao r=new ResponsabileDao();

              r.createResponsabile(um);
              
          } else {
         	  ClienteDao c=new ClientDao();
         	  c.createCliente(um) 
              
         }
         return true;
    }
}
