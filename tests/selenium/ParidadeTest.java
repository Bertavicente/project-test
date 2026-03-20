import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParidadeTest {
    @Test
    public void testCondicaoPar() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/src/paridade.php");
        driver.findElement(By.name("numero")).sendKeys("10");
        driver.findElement(By.id("btn-verificar")).click();
        
        String resultado = driver.findElement(By.id("res")).getText();
        assertEquals("PAR", resultado);
        driver.quit();
    }
}
