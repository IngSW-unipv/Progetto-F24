package it.unipv.java.model;

import java.util.Date;
import java.util.UUID;

public class PrenotazioneModel {
	private String idPrenotazione;
	private String idCliente;
	private String indirizzoDiConsegna;
	private String dataRitiro;
	private String dataConsegna;
	private String metodoPagamento;
	private float importoPagato;
	private String statoPrenotazione;
	private String indirizzodiRitiro;
	private String cvc;
	private String scadGiorno;
	private String scadMese;
	private String scadAnno;
	private DataAccessFacade dbAccess;

	// Getters
	public String getIdPrenotazione() {
		return idPrenotazione;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public String getIndirizzoDiConsegna() {
		return indirizzoDiConsegna;
	}

	public String getDataRitiro() {
		return dataRitiro;
	}

	public String getDataConsegna() {
		return dataConsegna;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public Float getImportoPagato() {
		return importoPagato;
	}

	public String getStatoPrenotazione() {
		return statoPrenotazione;
	}

	// Setters
	public void setIdPrenotazione(String string) {
		this.idPrenotazione = string;
	}

	public void setIdCliente(String id) {
		this.idCliente = id;
	}

	public void setIndirizzoDiConsegna(String indirizzoDiConsegna) {
		this.indirizzoDiConsegna = indirizzoDiConsegna;
	}

	public void setDataRitiro(String dataRitiro) {
		this.dataRitiro = dataRitiro;
	}

	public void setDataConsegna(String dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public void setMetodoDiPagamento(String metodoDiPagamento) {
		this.metodoPagamento = metodoDiPagamento;
	}

	public void setImportoPagato(Float importoPagato) {
		this.importoPagato = importoPagato;
	}

	public void setStatoPrenotazione(String statoPrenotazione) {
		this.statoPrenotazione = statoPrenotazione;
	}

	public String getIndirizzodiRitiro() {
		return indirizzodiRitiro;
	}

	public void setIndirizzodiRitiro(String indirizzodiRitiro) {
		this.indirizzodiRitiro = indirizzodiRitiro;
	}

	public String getCVC() {
		return cvc;
	}

	public void setCVC(String cvc) {
		this.cvc = cvc;
	}

	public String getScadMese() {
		return scadMese;
	}

	public void setScadMese(String scadMese) {
		this.scadMese = scadMese;
	}

	public String getScadAnno() {
		return scadAnno;
	}

	public void setScadAnno(String scadAnno) {
		this.scadAnno = scadAnno;
	}

	// Methods
	public boolean validaDati() {
		// Validazione Dati
		/*
		 * if (um.getNome() == null || um.getNome().trim().isEmpty()) { return false; }
		 * if (um.getCognome() == null || um.getCognome().trim().isEmpty()) { return
		 * false; } // Utilizza una regex per validare l'email if (um.getEmail() == null
		 * ||
		 * !um.getEmail().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}")) {
		 * return false; } // Controlla che la password sia lunga almeno 8 caratteri if
		 * (um.getPassword() == null || um.getPassword().length() < 8) { return false; }
		 */
		return true; // Tutti i controlli di validità superati
	}

	public boolean savePrenotazione() {
		// se i dati inseriti sono validi creo la prentoazione se no richiedo
		if (validaDati()) {
			this.setIdPrenotazione(generateUniqueId());
			if (dbAccess.createPrenotazione(this)) {
				//SE VA TUTTO BENE VA ALLA VIEW
				return true;
			} else {
				//SE VA TUTTO MALE VA ALLA VIEW
				return false;
			}

		} else {
			return false;
			// ritorno al prenotazione controller che ritorna alla view
		}

	}

	private String generateUniqueId() {
		 return UUID.randomUUID().toString();

	}

	public void setScadGiorno(String textField_7) {
		// TODO Auto-generated method stub

	}
}
