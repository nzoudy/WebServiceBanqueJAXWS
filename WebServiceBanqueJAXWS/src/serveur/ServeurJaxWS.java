package serveur;

import javax.xml.ws.Endpoint;
import webservice.BanqueService;

public class ServeurJaxWS {

	private static final String PORT = "8585/";
	private static final String HOSTNAME = "http://localhost:";
	
	public static void main(String[] args) {
		
		String url = HOSTNAME+PORT;
		
		Endpoint.publish(url, new BanqueService());
		
		System.out.println(("\n========================================================="
				  + "\n                                                         "
				  + "\n          Welcome to my zoudys server!                   "
				  + "\n                                                         "
				  + "\n    Please take an minute to visit: my agregator         "
				  + "\n    agregateur.herokuapp.com                             "
				  + "\n    http://www.zoudys.com						        "
				  + "\n                                                         "
				  + "\n=========================================================" ));
	
		System.out.println("Server start on ...." + url);
	}

}
