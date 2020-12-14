package PharmaciGestion;

public class Medicament extends Admin{
	
	private String description;
	private int prix;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "Client [getdescription()=" + getDescription() + ", getprix()=" + getPrix() + ", getId()=" + getId() + ", getNom()=" + getNomP() + "]";
	}
	
}
