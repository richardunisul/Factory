package v4_fabricaDefabricas;

public class Principal {
		NYPizzaFactory nyFactory = new NYFactory();
		PizzaStore nyStore = new PizzaStore(nyFactory);  // Adicionar construtor em PizzaStore
		nyStore.order("Veggie");
		
}
