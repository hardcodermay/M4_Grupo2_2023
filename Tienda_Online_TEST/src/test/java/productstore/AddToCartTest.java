package productstore;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = {"productstore"},
        features = "src/test/resources/features/addtocart.feature")
public class AddToCartTest {
}