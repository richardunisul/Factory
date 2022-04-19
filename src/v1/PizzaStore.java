package v1;

public class PizzaStore {
	Pizza orderPizza(){
 
	Pizza pizza = new Pizza();                    // Por motivos de flexibilidade, realmente queremos que seja uma classe ou uma interface abstrada, mas não podemos instanciar diretamente nenhuma delas.

	pizza.prepare();
	pizza.bake();
	pizza.cut();
	pizza.box();
	return pizza;

}
}