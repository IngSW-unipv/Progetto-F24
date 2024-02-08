package it.unipv.java.persistance.dao.prenotazione;

import java.util.List;

import it.unipv.java.model.Cliente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.Prenotazione;
import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.RegisterModel;

public interface IPrenotazioneDao {
	public List<Prenotazione> getAllPrenotazioni();
    public Prenotazione getPrenotazione(Cliente c);
    public boolean createPrenotazione(PrenotazioneModel p);
    public boolean updatePrenotazione(Prenotazione p);
    public boolean deletePrenotazione(Prenotazione p);
}
