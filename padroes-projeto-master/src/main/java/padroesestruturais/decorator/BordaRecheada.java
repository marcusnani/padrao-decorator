
package padroesestruturais.decorator;

public class BordaRecheada extends PizzaDecorator {

    public BordaRecheada(Pizza pizza) {
        super(pizza);
    }

    public float getPercentualPreco() {
        return 5.0f;
    }

    public String getNomeIngrediente() {
        return "Borda Recheada";
    }
}
