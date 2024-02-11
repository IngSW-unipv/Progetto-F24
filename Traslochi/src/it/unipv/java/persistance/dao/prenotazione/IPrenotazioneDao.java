package it.unipv.java.persistance.dao.prenotazione;

import java.util.List;
 
import it.unipv.java.model.DataAccessFacade;
 

public interface IPrenotazioneDao {
	public List<DataAccessFacade> getAllPrenotazioni();
    public boolean getPrenotazione(DataAccessFacade c);
    public boolean createPrenotazione(DataAccessFacade  p);
    public boolean updatePrenotazione(DataAccessFacade p);
    public boolean deletePrenotazione(DataAccessFacade p);
}
