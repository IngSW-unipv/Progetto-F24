package it.unipv.java.model;

public class ClienteModel extends UserModel {
	private int idCliente;

	public ClienteModel() {
       
	}

	// Costruttore della classe Cliente che chiama il costruttore della classe base
	// UserModel
	public ClienteModel(String nome, String cognome, String cf, String email, String password, UserType userType,
			int idCliente) {
		super(nome, cognome, cf, email, password, userType);
		this.idCliente = idCliente;
	}

  public int getIdCliente() {
	return idCliente;
}public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}

}
