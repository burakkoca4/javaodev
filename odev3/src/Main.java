import Adapter.MernisServiceAdapter;
import Business.GamerManager;
import Business.SaleManager;
import Entities.Campaign;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		Gamer gamer=new Gamer(1,"Xayalbi","Muhammed Furkan","Alacapunar","burak@gmail.com","40450024638",1994);
		gamerManager.register(gamer);
		
		
		Campaign campaign = new Campaign(1,"Ocak söndüren indirim",15);
		SaleManager saleManager=new SaleManager();
		saleManager.sale(gamer, campaign);

	}

}
