package PharmaciGestion;

public class Admin {
	
	private int id;
	private String nomP;
	private String email;
    private int tele;
    
	
	
	public int getId() {
		return id;
	}

	public String getNomP() {
		return nomP;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nomP) {
		this.nomP = nomP;
	}
	
	
	public String getEmail() {
	return email;
}

	public void setEmail(String email) {
	this.email = email;
}

	public int getTele() {
		return tele;
	}

	public void setTele(int tele) {
		this.tele = tele;
	}
	
	
}
