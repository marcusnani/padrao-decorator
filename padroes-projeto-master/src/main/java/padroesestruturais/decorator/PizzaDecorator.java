
package padroesestruturais.decorator;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;
    public String ingredientes;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.pizza.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeIngrediente();

    public String getIngredientes() {
        return this.pizza.getIngredientes() + "/" + this.getNomeIngrediente();
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
