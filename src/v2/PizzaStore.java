package v2;

public class PizzaStore {

	Pizza orderPizza(String type){                                                  // Agora estamos pensando o tipo de pizza para orderPizza
			 
			If (type.eguals(“cheese”)){     
				Pizza pizza = new CheesePizza();  
			}else If (type.eguals(“greek”)){
				Pizza pizza = new GreekPizza();  
			}else If (type.eguals(“pepperoni”)){
				Pizza pizza = new PepperoniPizza();  
			}                                                                 // Com base no tipo de pizza, instanciamos a classe concreta correta e a atribuímos à variáveis de instância de pizza. Observe que cada pizza aqui tem que implementar a interface Pizza
	}

	pizza.prepare();
	pizza.bake();
	pizza.cut();
	pizza.box();
	return pizza;

}}