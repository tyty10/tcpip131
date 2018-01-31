package Client;

public class Client {

	public static void main(String[] args) {
		String ip = "70.12.111.137";
		int port = 7777;
		ClientChat chat = null;
		chat = new ClientChat(ip, port);
	
	}
}
