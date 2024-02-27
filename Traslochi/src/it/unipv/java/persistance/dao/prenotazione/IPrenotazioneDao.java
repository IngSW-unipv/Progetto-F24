package it.unipv.java.persistance.dao.prenotazione;

import java.util.List;

import it.unipv.java.model.PrenotazioneData;

public interface IPrenotazioneDao {
	
	public List<PrenotazioneData> getAllPrenotazioni();
	public List<PrenotazioneData> getPrenotazioniUtente();
	public boolean createPrenotazione(PrenotazioneData datiPrenotazione);
	public boolean updatePrenotazione(PrenotazioneData datiPrenotazione);
	public boolean deletePrenotazione(PrenotazioneData datiPrenotazione);
}
