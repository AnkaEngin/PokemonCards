
public class GamingCard extends TradingCard{
	private String category;
	private String game;
	
	public GamingCard(String name, String image, String category, String game) {
		super(name, image);
		this.category = category;
		this.game = game;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getGame() {
		return game;
	}
	
	@Override
	public String toString() {
		return super.toString()+": "+game+" character";
	}
		
}