package it.unipv.java.model;

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
              DipendenteDAO.register(um);
          } else if (um.getUserType() == UserType.RESPONSABILE) {
              ResponsabileDAO.register(um);
          } else {
              ClienteDAO.register(um);
         }

         return true;
    }
}
