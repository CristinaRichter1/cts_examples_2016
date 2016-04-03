package ro.ase.cts;

public class PizzaExotica extends DecoratorPizza {
	public PizzaExotica(AbstractPizza pizza){
		super(pizza);
	}
	
	@Override
	public String getIngrediente(){
		return super.getIngrediente() + ", ananas";
	}
}
