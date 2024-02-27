package it.unipv.java.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;

public class PrenotazioneData {
	private String idPrenotazione;
	private String idCliente;
	private String idResponsabile;
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

	public void setImportoPagato(float f) {
		this.importoPagato = calcolaImporto();
	}

	public String getScadGiorno() {
		return scadGiorno;
	}

	public String getIdResponsabile() {
		return idResponsabile;
	}

	public void setIdResponsabile(String idResponsabile) {
		this.idResponsabile = idResponsabile;
	}

	public float calcolaImporto() {
		long giorni = calcolagiorni(this.dataRitiro, this.dataConsegna);
		float tariffaMinima = 300;
		float aggiuntaPerGiorno = 50;

		float importo = tariffaMinima + (giorni * aggiuntaPerGiorno);

		return importo;
	}

	public long calcolagiorni(String datain, String datafin) {
		
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date1 = myFormat.parse(datain);
			Date date2 = myFormat.parse(datafin);
			long diff = date2.getTime() - date1.getTime();
			return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public boolean savePrenotazione() {
		if (validaDati()) {
			this.setIdPrenotazione(UUID.randomUUID().toString());
			this.setImportoPagato(importoPagato); // Calcola automaticamente l'importo
			boolean createSuccess = PersistanceFacade.getInstance().createPrenotazione(this);
			return createSuccess;
		} else {
			return false;
		}
	}

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

	private String generateUniqueId() {
		return UUID.randomUUID().toString();

	}
	public List<PrenotazioneData> mostratuttePrenotazioni() {
		return PersistanceFacade.getInstance().mostraPrenotazioni();
	}
	
	public List<PrenotazioneData> getPrenotazioniUtente(User um) {
		return PersistanceFacade.getInstance().getPrenotazioniCliente();
		}
		
	public void setScadGiorno(String textField_7) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
        return "Indirizzo di Ritiro: " + indirizzodiRitiro + ", Indirizzo di Consegna: " + indirizzoDiConsegna + ", Data di Ritiro: " + dataRitiro + ", Data di Consegna: " + dataConsegna
        		+ ", Importo da Pagare: " + calcolaImporto() + "\n";
    }
}
