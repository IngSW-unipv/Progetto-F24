package it.unipv.java.persistance.dao.prenotazione;

import java.util.List;

import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.SingleSessioneAttiva;

public interface IPrenotazioneDao {
	public List<PrenotazioneModel> getAllPrenotazioni();

	public  List <PrenotazioneModel> getPrenotazione();

	public boolean createPrenotazione(PrenotazioneModel p);

	public boolean updatePrenotazione(PrenotazioneModel p);

	public boolean deletePrenotazione(PrenotazioneModel p);
}
