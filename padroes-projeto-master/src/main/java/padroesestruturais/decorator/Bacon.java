
package padroesestruturais.decorator;

public class Bacon extends PizzaDecorator {

    public Bacon(Pizza pizza) {
        super(pizza);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeIngrediente() {
        return "Bacon";
    }
}
