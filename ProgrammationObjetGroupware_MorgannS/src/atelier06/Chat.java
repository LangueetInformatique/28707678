package atelier06;

public class Chat extends Félin implements Domesticable {

	public Chat(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void domestiquer(String nom) {
		nom = "Chat";
		// TODO Auto-generated method stub

	}

	@Override
	public String nom() {
		String nom = "Chat";
		return nom;
	}

}
