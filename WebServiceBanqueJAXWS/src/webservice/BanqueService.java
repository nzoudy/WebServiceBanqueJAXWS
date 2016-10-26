package webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="BanqueWS")
public class BanqueService {

	@WebMethod(operationName="conversionEuroFcfa")
	public double conversion(@WebParam(name="montant") double mt){
		return 650*mt;
	}
	
	@WebMethod
	public String test(){
		return "Test";
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code") int code){
		return new Compte(code, Math.random()*8000);
	}
	
	@WebMethod(operationName="listeAllComptes")
	public List<Compte> getComptes(){
		List<Compte> cptes = new ArrayList<Compte>();
		cptes.add(new Compte(1, Math.random()*8000));
		cptes.add(new Compte(2, Math.random()*8000));
		cptes.add(new Compte(3, Math.random()*8000));
		cptes.add(new Compte(4, Math.random()*8000));
		return cptes;
	}
}
