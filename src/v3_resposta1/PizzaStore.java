package v3_resposta1;

public class PizzaStore {

	Pizza orderPizza(String type){                                             
		SimplePizzaFactory factory;
			
		public PizzaStore(SimpleOizzaFactory factory){  // PizzaEstore recebe a fábrica no construtor
		  	this.factory = factory;
		}

		public Pizza orderPizza(String type){
			Pizza pizza;
		pizza = factory.createPizza(type);                      // e o método orderPizza() usa a fábrica para criar suas pizzas simplesmente passando adiante o tipo de pedido
                                                		//Observer que suvstituímos o operador new por um método de criação no objeto fabrica. Chega de instciações concretas aqui!

    	pizza.prepare();
	    pizza.bake();
    	pizza.cut();
    	pizza.box();
    	return pizza;

}}