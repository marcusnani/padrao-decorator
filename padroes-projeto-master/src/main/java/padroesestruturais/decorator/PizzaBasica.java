
package padroesestruturais.decorator;

public class PizzaBasica implements Pizza {

    public float preco;

    public PizzaBasica() {
    }

    public PizzaBasica(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getIngredientes() {
        return "Pizza Básica";
    }

}
