
public class Program2 {
	public static void main(String[] args) {
		TradingCard tc = new TradingCard("General", "gen.img");

		GamingCard gc = new GamingCard("Game Name", "gc.img", "gaming", "Pokemon");

		PokemonCard charmeleon = new PokemonCard("Charmeleon", "p004.img", "gaming", "Pokemon", "fire", 4, "blaze");
		PokemonCard beedrill = new PokemonCard("Beedrill", "p015.img", "gaming", "Pokemon", "bug/poison", 15, "swarm or sniper");
		PokemonCard clefairy = new PokemonCard("Clefairy", "p035.img", "gaming", "Pokemon", "normal", 35, "friend guard");


		TradingCard[ ] cards = new TradingCard[5];

		cards[0] = tc;
		cards[1] = gc;
		cards[2] = charmeleon;
		cards[3] = beedrill;
		cards[4] = clefairy;

		for ( TradingCard card : cards )
		   System.out.println(card);
	}
}
