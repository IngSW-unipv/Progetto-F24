package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

import it.unipv.java.model.AuthGestor;
import it.unipv.java.model.DipendenteModel;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.UserModel;

//qua ci sara la import per il testing

public interface IDipendenteDao {
    public List<DipendenteModel> getAllDipendenti();
    public DipendenteModel getDipendente(LoginModel login);
    public boolean createDipendente(AuthGestor ag);
    public boolean updateDipendente(DipendenteModel d);
    public boolean deleteDipendente(DipendenteModel d);
}