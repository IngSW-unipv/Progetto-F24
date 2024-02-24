package it.unipv.java.persistance.factory;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.factory.strategies.StrategyFactory;

/**
 * La classe DaoFactory rappresenta l'oggetto Singleton che si occupa di
 * costruire gli oggetti Dao necessari per comunicare con una
 * determinata forma di Persistenza. La scelta di quale persistenza
 * debba essere generata avviene per mezzo della classe StrategyFactory.
 * Questa classe agisce come Contesto per le strategie create da StrategyFactory.
 * @author Pasciu01
 * @see StrategyFactory
 * @version 1.0
 */
public class DaoFactory {
	private static DaoFactory instance;
	
	private DaoFactory() {}
	
	public static DaoFactory getInstance() {
		if(instance == null) {
			instance = new DaoFactory();
		}
		return instance;
	}
	
	/**
	 * Metodo che restituisce un oggetto di tipo IPrenotazioneDao a seconda di una strategia
	 * specificata nel file properties e identificata dalla classe StrategyFactory.
	 * @see StrategyFactory
	 * @see IPrenotazioneDao
	 * @author Pasciu01
	 * @version 1.0
	 */
	public IPrenotazioneDao getPrenotazionePersistance() {
		return StrategyFactory.getInstance().getStrategy().getPrenotazioneDao(this);
	}
	
	/**
	 * Metodo che restituisce un oggetto di tipo IDipendenteDao a seconda di una strategia
	 * specificata nel file properties e identificata dalla classe StrategyFactory.
	 * @see StrategyFactory
	 * @see IDipendenteDao
	 * @author Pasciu01
	 * @version 1.0
	 */
	public IDipendenteDao getDipendentePersistance() {
		return StrategyFactory.getInstance().getStrategy().getDipendenteDao(this);
	}
	
	/**
	 * Metodo che restituisce un oggetto di tipo IClienteDao a seconda di una strategia
	 * specificata nel file properties e identificata dalla classe StrategyFactory.
	 * @see StrategyFactory
	 * @see IClienteDao
	 * @author Pasciu01
	 * @version 1.0
	 */
	public IClienteDao getClientePersistance() {
		return StrategyFactory.getInstance().getStrategy().getClienteDao(this);
	}

	/**
	 * Metodo che restituisce un oggetto di tipo IResponsabileDao a seconda di una strategia
	 * specificata nel file properties e identificata dalla classe StrategyFactory.
	 * @see StrategyFactory
	 * @see IResponsabileDao
	 * @author Pasciu01
	 * @version 1.0
	 */
	public IResponsabileDao getResponsabilePersistance() {
		return StrategyFactory.getInstance().getStrategy().getResponsabileDao(this);
	}
	
	/**
	 * Metodo che restituisce un oggetto di tipo ITurnoDao a seconda di una strategia
	 * specificata nel file properties e identificata dalla classe StrategyFactory.
	 * @see StrategyFactory
	 * @see ITurnoDao
	 * @author Pasciu01
	 * @version 1.0
	 */
	public ITurnoDao getTurnoPersistance() {
		return StrategyFactory.getInstance().getStrategy().getTurnoDao(this);
	}
}
