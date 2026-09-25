
package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void deveRetornarPrecoPizza() {
        Pizza pizza = new PizzaBasica(1000.0f);

        assertEquals(1000.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComBacon() {
        Pizza pizza = new Bacon(new PizzaBasica(1000.0f));

        assertEquals(1100.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComQueijoExtra() {
        Pizza pizza = new QueijoExtra(new PizzaBasica(1000.0f));

        assertEquals(1200.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComBordaRecheada() {
        Pizza pizza = new BordaRecheada(new PizzaBasica(1000.0f));

        assertEquals(1050.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComBaconMaisQueijoExtra() {
        Pizza pizza = new Bacon(new QueijoExtra(new PizzaBasica(1000.0f)));

        assertEquals(1320.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComBaconMaisBordaRecheada() {
        Pizza pizza = new Bacon(new BordaRecheada(new PizzaBasica(1000.0f)));

        assertEquals(1155.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComQueijoExtraMaisBordaRecheada() {
        Pizza pizza = new QueijoExtra(new BordaRecheada(new PizzaBasica(1000.0f)));

        assertEquals(1260.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComBaconMaisQueijoExtraMaisBordaRecheada() {
        Pizza pizza = new Bacon(new QueijoExtra(new BordaRecheada(new PizzaBasica(1000.0f))));

        assertEquals(1386.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarIngredientesPizza() {
        Pizza pizza = new PizzaBasica();

        assertEquals("Pizza Básica", pizza.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesPizzaComBacon() {
        Pizza pizza = new Bacon(new PizzaBasica());

        assertEquals("Pizza Básica/Bacon", pizza.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesPizzaComQueijoExtra() {
        Pizza pizza = new QueijoExtra(new PizzaBasica());

        assertEquals("Pizza Básica/Queijo Extra", pizza.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesPizzaComBordaRecheada() {
        Pizza pizza = new BordaRecheada(new PizzaBasica());

        assertEquals("Pizza Básica/Borda Recheada", pizza.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesPizzaComBaconMaisQueijoExtra() {
        Pizza pizza = new Bacon(new QueijoExtra(new PizzaBasica()));

        assertEquals("Pizza Básica/Queijo Extra/Bacon", pizza.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesPizzaComBaconMaisBordaRecheada() {
        Pizza pizza = new Bacon(new BordaRecheada(new PizzaBasica()));

        assertEquals("Pizza Básica/Borda Recheada/Bacon", pizza.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesPizzaComQueijoExtraMaisBordaRecheada() {
        Pizza pizza = new QueijoExtra(new BordaRecheada(new PizzaBasica()));

        assertEquals("Pizza Básica/Borda Recheada/Queijo Extra", pizza.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesPizzaComBaconMaisQueijoExtraMaisBordaRecheada() {
        Pizza pizza = new Bacon(new QueijoExtra(new BordaRecheada(new PizzaBasica())));

        assertEquals("Pizza Básica/Borda Recheada/Queijo Extra/Bacon", pizza.getIngredientes());
    }

}
