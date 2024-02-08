package it.unipv.java.persistance.dao.prenotazione;

import java.util.List;

import it.unipv.java.model.ClienteModel;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.RegisterModel;

public interface IPrenotazioneDao {
	public List<PrenotazioneModel> getAllPrenotazioni();
    public PrenotazioneModel getPrenotazione(ClienteModel c);
    public boolean createPrenotazione(PrenotazioneModel p);
    public boolean updatePrenotazione(PrenotazioneModel p);
    public boolean deletePrenotazione(PrenotazioneModel p);
}
