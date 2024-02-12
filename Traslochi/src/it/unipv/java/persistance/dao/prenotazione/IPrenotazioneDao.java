package it.unipv.java.persistance.dao.prenotazione;

import java.util.List;
 
import it.unipv.java.model.DataAccessFacade;
import it.unipv.java.model.PrenotazioneModel;
 

public interface IPrenotazioneDao {
	public List<PrenotazioneModel> getAllPrenotazioni();
    public boolean getPrenotazione(DataAccessFacade c);
    public boolean createPrenotazione(PrenotazioneModel  p);
    public boolean updatePrenotazione(DataAccessFacade p);
    public boolean deletePrenotazione(DataAccessFacade p);
}
