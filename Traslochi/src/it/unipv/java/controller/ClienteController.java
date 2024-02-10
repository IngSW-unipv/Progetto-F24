package it.unipv.java.controller;

import it.unipv.java.model.ClienteModel;
import it.unipv.java.view.ClienteView;

public class ClienteController {
	public ClienteModel cm;
	public ClienteView cv;
	
	public ClienteController(ClienteModel cm, ClienteView cv) {
		this.cm = cm;
		this.cv = cv;
	}
}
