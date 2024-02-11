package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

import it.unipv.java.model.DataAccessFacade; 
 

//qua ci sara la import per il testing

public interface IDipendenteDao {
    public List<DataAccessFacade> getAllDipendenti();
    public boolean getDipendente(DataAccessFacade ag);
    public boolean createDipendente(DataAccessFacade ag);
    public boolean updateDipendente(DataAccessFacade ag);
    public boolean deleteDipendente(DataAccessFacade ag);
}