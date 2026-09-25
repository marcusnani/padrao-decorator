
package padroesestruturais.decorator;

public class QueijoExtra extends PizzaDecorator {

    public QueijoExtra(Pizza pizza) {
        super(pizza);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeIngrediente() {
        return "Queijo Extra";
    }
}
