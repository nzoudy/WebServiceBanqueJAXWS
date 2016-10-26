package webservice;

import java.io.Serializable;

public class Account implements Serializable {

	private int code;
	private double solde;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int code, double solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
