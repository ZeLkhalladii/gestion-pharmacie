package PharmaciGestion;

public class Client extends Admin{
	
	private int badge;

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	@Override
	public String toString() {
		return "Client [getBadge()=" + getBadge() + ", getId()=" + getId() + ", getNomP()=" + getNomP()
				+ ", getEmail()=" + getEmail() + ", getTele()=" + getTele() + "]";
	}
}
