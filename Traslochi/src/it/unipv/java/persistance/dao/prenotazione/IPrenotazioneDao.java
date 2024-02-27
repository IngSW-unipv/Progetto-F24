package it.unipv.java.persistance.dao.prenotazione;

import java.util.List;

import it.unipv.java.model.PrenotazioneModel;

public interface IPrenotazioneDao {
	
	public List<PrenotazioneModel> getAllPrenotazioni();
	public List<PrenotazioneModel> getPrenotazioniUtente();
	public boolean createPrenotazione(PrenotazioneModel datiPrenotazione);
	public boolean updatePrenotazione(PrenotazioneModel datiPrenotazione);
	public boolean deletePrenotazione(PrenotazioneModel datiPrenotazione);
}
