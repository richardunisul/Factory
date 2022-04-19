package v4_fabricaDefabricas;

public class PizzaStore {

	Pizza orderPizza(String type){                                             
		SimplePizzaFactory factory;
			
		public PizzaStore(SimpleOizzaFactory factory){  // PizzaEstore recebe a f�brica no construtor
		  	this.factory = factory;
		}

		public Pizza orderPizza(String type){
			Pizza pizza;
		pizza = factory.createPizza(type);                      // e o m�todo orderPizza() usa a f�brica para criar suas pizzas simplesmente passando adiante o tipo de pedido
                                                		//Observer que suvstitu�mos o operador new por um m�todo de cria��o no objeto fabrica. Chega de instcia��es concretas aqui!

    	pizza.prepare();
	    pizza.bake();
    	pizza.cut();
    	pizza.box();
    	return pizza;

}}