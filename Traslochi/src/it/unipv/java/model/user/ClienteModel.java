package it.unipv.java.model.user;

public class ClienteModel extends UserModel {
	private int idCliente;

	public ClienteModel() {
       
	}

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
