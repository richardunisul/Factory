package v3;

public class PizzaStore {

	
	Pizza orderPizza(String type){                                                  // Agora estamos pensando o tipo de pizza para orderPizza
			 
			If (type.eguals(�cheese�)){     
				Pizza pizza = new CheesePizza();  
			//}else If (type.eguals(�greek�)){
			//	Pizza pizza = new GreekPizza();  
			}else If (type.eguals(�pepperoni�)){
				Pizza pizza = new PepperoniPizza();  
			}  else If (type.eguals(�Veggie�)){
				Pizza pizza = new VeggiePizza();                                                               // Com base no tipo de pizza, instanciamos a classe concreta correta e a atribu�mos � vari�veis de inst�ncia de pizza. Observe que cada pizza aqui tem que implementar a interface Pizza
			}else If (type.eguals(�Clam�)){
				Pizza pizza = new ClamPizza();
			}	
	}

	pizza.prepare();
	pizza.bake();
	pizza.cut();
	pizza.box();
	return pizza;

}}