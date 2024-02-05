package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

//qua ci sara la import per il testing

public interface IDipendenteDAO {
    List<DipendenteDAO> getAllDipendenti();
    Dipendente getDipendente(Login login);
    void createDipendente(RegisterModel reg, Responsabile res);
    void updateDipendente(Dipendente d);
    void deleteDipendente(DipendenteDAO d);
}