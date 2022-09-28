
public class PokemonCard extends GamingCard{
	private String type;
	private int pokedex;
	private String ability;
	
	public PokemonCard(String name, String image, String category, String game, String type, int pokedex, String ability) {
		super(name, image, category, game);
		this.type = type;
		this.pokedex = pokedex;
		this.ability = ability;
	}
	
	public String getType() {
		return type;
	}
	
	public int getPokedex() {
		return pokedex;
	}
	
	public String getAbility() {
		return ability;
	}
	
	public void setType(String newType) {
		type = newType;
	}
	
	public void setPokedex(int newPokedex) {
		pokedex = newPokedex;
	}
	
	public void setAbility(String newAbility) {
		ability = newAbility;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+pokedex+", a "+type+"-type with "+ability+" ability.";
	}

}
