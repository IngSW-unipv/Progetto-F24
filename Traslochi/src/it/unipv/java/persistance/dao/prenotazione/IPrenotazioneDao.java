package it.unipv.java.persistance.dao.prenotazione;

import java.util.List;

public class IPrenotazioneDao {
	public List<Prenotazione> getAllPrenotazioni();
    public Prenotazione getPrenotazione(LoginModel login);
    public void createPrenotazione(RegisterModel register);
    public void updatePrenotazione(Prenotazione p);
    public void deletePrenotazione(Prenotazione p);
}
