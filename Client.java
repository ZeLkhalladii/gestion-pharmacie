package PharmaciGestion;

public class Client extends Admin{
	
	private int badge;
	private int NbrOrder= 0;
	boolean Fidele= false;

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	
	public int getNbrOrder() {
		return NbrOrder;
	}

	public void setNbrOrder(int nbrOrder) {
		this.NbrOrder = nbrOrder;
	}
	
	public boolean getFidele() {
		return Fidele;
	}

	public void setFidele(boolean fidele) {
		this.Fidele = fidele;
	}
	
	@Override
	public String toString() {
		return "Client [getId() : " + getId() + ", getNomP() : " + getNomP()
+ ", getEmail() : " + getEmail() + ", getTele() : " + getTele() + " getBadge() : " + getBadge()+ " getFidele " + getFidele() +" getNbrOrder() " + "]";
	}


}
