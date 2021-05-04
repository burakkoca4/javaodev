package Business;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Campaign campaign) {
		System.out.println(
				"Oyun sat�n al�nd� " + gamer.getFirstName() + " taraf�ndan %" + campaign.getCampaignRate() + " indirimle");

	}

}
