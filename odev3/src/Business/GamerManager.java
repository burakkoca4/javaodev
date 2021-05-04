package Business;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService=gamerCheckService;
	}

	@Override
	public void register(Gamer gamer) {
		if (!gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Kay�t i�lemi ba�ar�s�z");
		}else {
			System.out.println("Kay�t i�lemi ba�ar�l� " + gamer.getUserName());
		}
		
	}

}
