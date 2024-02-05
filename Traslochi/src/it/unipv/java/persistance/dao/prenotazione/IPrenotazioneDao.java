package it.unipv.java.persistance.dao.prenotazione;

import java.util.List;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.Prenotazione;
import it.unipv.java.model.RegisterModel;

public interface IPrenotazioneDao {
	public List<Prenotazione> getAllPrenotazioni();
    public Prenotazione getPrenotazione(LoginModel login);
    public void createPrenotazione(RegisterModel register);
    public void updatePrenotazione(Prenotazione p);
    public void deletePrenotazione(Prenotazione p);
}
