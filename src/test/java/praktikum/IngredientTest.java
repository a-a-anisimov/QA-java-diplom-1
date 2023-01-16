package praktikum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static praktikum.IngredientType.*;

@RunWith(Parameterized.class)
public class IngredientTest {
    @Parameterized.Parameter(0)
    public IngredientType type;
    @Parameterized.Parameter(1)
    public String name;
    @Parameterized.Parameter(2)
    public float price;
    @Parameterized.Parameters(name = "Type: {0}, Name: {1}, Price: {2}")
    public static Object[][] params() {
        return new Object[][]{
                {SAUCE, "майонезик", 500},
                {FILLING, "кенгурятина", 600},
        };
    }
    @Test
    public void getPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        float actualPrice = ingredient.getPrice();
        Assert.assertEquals(price, actualPrice,0);
    }
    @Test
    public void getName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        String actualName = ingredient.getName();
        Assert.assertEquals(name, actualName);
    }
    @Test
    public void getType() {
        Ingredient ingredient = new Ingredient(type, name, price);
        IngredientType actualType = ingredient.getType();
        Assert.assertEquals(type, actualType);
    }
}